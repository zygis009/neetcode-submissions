class Solution {
    public int search(int[] nums, int target) {
        int l = 0; int r = nums.length - 1;
        while (l < r) {
            int k = (l + r) / 2;
            if (nums[k] == target) return k;
            if (nums[k] < nums[r]) {
                if (nums[k] < target && target <= nums[r]) {
                    l = k+1;
                } else {
                    r = k-1;
                }
            } else {
                if (nums[l] <= target && target < nums[k]) {
                    r = k - 1;
                } else {
                    l = k + 1;
                }
            }
        }
        return nums[l] == target ? l : -1;
    }
}
