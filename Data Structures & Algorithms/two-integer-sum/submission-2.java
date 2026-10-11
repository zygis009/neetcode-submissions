class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // Map<Integer, Integer> idx_map = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        //     idx_map.put(nums[i], i);
        // }
        // for (int i = 0; i < n; i++) {
        //     int diff = target - nums[i];
        //     if (idx_map.containsKey(diff) && idx_map.get(diff) != i) {
        //         return new int[]{i, idx_map.get(diff)};
        //     }
        // }
        Map<Integer, Integer> diff_map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (diff_map.containsKey(num)) {
                return new int[]{diff_map.get(num), i};
            }
            int diff = target - num;
            if (!diff_map.containsKey(diff)) diff_map.put(diff, i);
        }
        return new int[]{};
    }
}
