class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            // If target is smaller than current element, return the current index
            if (nums[i] > target) {
                return i;
            }
        }
        // If target is larger than all elements, return the last index + 1
        return nums.length;
    }
}
