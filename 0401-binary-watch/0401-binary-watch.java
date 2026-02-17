class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list=new ArrayList<>();
        for(int hour=0;hour<12;hour++){
            for(int min=0;min<60;min++){
                if(Integer.bitCount(hour)+Integer.bitCount(min)==turnedOn){
                    list.add(hour+":"+String.format("%02d",min));
                }
            }
        }
        return list;
    }
}