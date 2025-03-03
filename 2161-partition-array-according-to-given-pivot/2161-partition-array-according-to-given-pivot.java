class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr[]=new int[nums.length];
        int i=0;
        for(int num:nums){
            if(pivot>num){
                arr[i]=num;
                i++;
            }
        }
         for(int num:nums){
            if(pivot==num){
                arr[i]=num;
                i++;
            }
        } 
        for(int num:nums){
            if(pivot<num){
                arr[i]=num;
                i++;
            }
        }
        return arr;
    }
}