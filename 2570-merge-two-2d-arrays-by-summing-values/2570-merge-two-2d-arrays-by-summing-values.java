class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[] arr = new int[1001];
        int len = 0;
        for(int i = 0; i < nums1.length; i++){
            if(arr[nums1[i][0]] == 0){
                len++;
            }
            arr[nums1[i][0]] = nums1[i][1];
        }
        
        for(int i = 0; i < nums2.length; i++){
            if(arr[nums2[i][0]] == 0){
                len++;
            }
            arr[nums2[i][0]] = arr[nums2[i][0]] + nums2[i][1];
        }

        int[][] res = new int[len][2];

        int ind = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                res[ind][0] = i;
                res[ind][1] = arr[i];
                ind++;
            }
        }

        return res;
    }
}