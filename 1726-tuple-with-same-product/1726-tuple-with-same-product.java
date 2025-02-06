class Solution {
    public int tupleSameProduct(int[] nums) {
        int n =nums.length;
        int count=0;
        Map<Integer,Integer>fm=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int x=nums[i]*nums[j];
                fm.put(x,fm.getOrDefault(x,0)+1);
            }
        }
        for(int i:fm.values()){
        for(int j=0;j<i;j++){
            count+=j;
        }
        }
        return count*8;
    }
}