class Solution {
    public int findMin(int[] nums) {
        if (nums[0] < nums[nums.length - 1] || nums.length == 1) return nums[0];
        int l = 0, r = nums.length - 1;
        while (l != r) {
            // check which side is sorted
            int k = (l + r) / 2;
            if (nums[l] < nums[k]) {
                // left sorted
                l = k;
            } else {
                // right sorted
                r = k;
            }
        }
        return nums[l+1];
    }
}
