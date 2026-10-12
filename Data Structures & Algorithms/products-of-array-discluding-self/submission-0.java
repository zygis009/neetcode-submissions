class Solution {
    public int[] productExceptSelf(int[] nums) {
        long total = 1l;
        int zero_count = 0;
        for (int num : nums) {
            if (num != 0) {
                total *= num;
            } else {
                zero_count++;
            }
        }
        int[] res = new int[nums.length];
        if (zero_count > 1) {
            return res;
        }
        for (int i = 0; i < nums.length; i++) {
            if (zero_count > 0 && nums[i] != 0) {
                continue;
            } else {
                if (nums[i] == 0) {
                    res[i] = (int) total;
                } else {
                    res[i] = (int) (total/nums[i]);
                }
            }
        }
        return res;
    }
}  
