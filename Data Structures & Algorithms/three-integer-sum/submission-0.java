class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int l = i+1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum  == 0) {
                    res.add(List.of(nums[i], nums[l++], nums[r]));
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return new ArrayList<List<Integer>>(res);
    }
}
