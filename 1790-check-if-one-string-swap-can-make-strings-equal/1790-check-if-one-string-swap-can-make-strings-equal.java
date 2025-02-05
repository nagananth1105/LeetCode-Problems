class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int c=0,m=0;
        char[] arr1=new char[s1.length()];
        char[] arr2=new char[s1.length()];
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
                arr1[m]=s1.charAt(i);
                arr2[m]=s2.charAt(i);
                m++;
            }
        }
        if(c>2){
            return false;
        }
        else{
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
        }
        return true;
    }
}