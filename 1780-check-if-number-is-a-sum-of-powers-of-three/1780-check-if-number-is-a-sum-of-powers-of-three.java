class Solution {
    public boolean checkPowersOfThree(int n) {
        int num=16;
        int arr[] =new int[num];
        for(int i=0;i<num;i++){
            arr[i]=(int)Math.pow(3,i);
        }
        for(int i=num-1;i>=0;i--){
            if(n>=arr[i]){
                n-=arr[i];
            }
            if(n==0)
            return true;
        }
        return false;
}

}