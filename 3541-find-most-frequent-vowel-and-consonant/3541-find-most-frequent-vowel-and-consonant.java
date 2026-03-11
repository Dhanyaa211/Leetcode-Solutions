class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        int maxVowel = 0;
        int maxCons = 0;
        for(int i = 0; i < 26; i++){
            char ch = (char)(i + 'a');
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                maxVowel = Math.max(maxVowel, freq[i]);
            } else {
                maxCons = Math.max(maxCons, freq[i]);
            }
        }
        return maxVowel + maxCons;
    }
}