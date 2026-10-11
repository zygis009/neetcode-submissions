class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> idx_map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            idx_map.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            if (idx_map.containsKey(diff) && idx_map.get(diff) != i) {
                return new int[]{i, idx_map.get(diff)};
            }
        }
        return new int[]{};
    }
}
