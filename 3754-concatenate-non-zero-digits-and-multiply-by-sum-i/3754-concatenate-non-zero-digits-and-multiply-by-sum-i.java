class Solution {
    public long sumAndMultiply(int n) {
        // Convert number to string
        if(n==0) return 0;
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder();

        // Remove zeros
        for (char c : s.toCharArray()) {   // <-- fix here
            if (c != '0') {
                sb.append(c);
            }
        }

        // Convert back to long
        String str = sb.toString();
        long num = Long.parseLong(str);
        int sum=0;
        long temp=num;
        while(temp>0){
            long d=temp%10;
            sum+=d;
            temp /= 10;
        }
        return num*sum; // return the number instead of printing
    }
}

