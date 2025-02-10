class Solution {
    public String clearDigits(String s) {
        int n= s.length();
        int count=0;
        String a ="";
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                count++;
            }
            else if(count!=0){
                count--;
            }
            else if (count==0){
                a=s.charAt(i)+a;

            }
        }
        return a;
    }
}