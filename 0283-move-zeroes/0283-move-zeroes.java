import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> res = new ArrayList<>();
        for (int num : nums) {
            if (num != 0) {
                res.add(num);
            }
        }
        while (res.size() < n) {
            res.add(0);
        }
        for (int i = 0; i < n; i++) {
            nums[i] = res.get(i);
        }
    }
}
