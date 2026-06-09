class Solution {
    public int findComplement(int num) {
        String s="";
        int temp=num;
        while(temp>0){
            s=(temp%2)+s;
            temp/=2;
        }
        String flip="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                flip+='1';
            }
            else{
                flip+='0';
            }
        }
        int result=0;
        int power=1;
        for(int i=flip.length()-1;i>=0;i--){
            if(flip.charAt(i)=='1'){
                result+=power;
            }
            power*=2;
        }
        return result;
    }
}