class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            // check which side is sorted
            int k = (l + r) / 2;
            if (nums[k] < nums[r]) {
                // right sorted
                r = k;
            } else {
                // left sorted
                l = k+1;
            }
        }
        return nums[l];
    }
}
