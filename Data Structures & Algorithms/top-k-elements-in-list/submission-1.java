class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        List<Integer>[] freq = new List[nums.length];
        for (int i = 0; i < nums.length; i++) {
            counts.put(nums[i], counts.getOrDefault(nums[i], 0)+1);
            freq[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> e : counts.entrySet()) {
            freq[e.getValue()-1].add(e.getKey());
        }
        int[] res = new int[k];
        int idx = 0;
        for (int i = nums.length - 1; i >= 0 && idx < k; i--) {
            for (int num : freq[i]) {
                res[idx++] = num;
                if (idx == k) {
                    return res;
                }
            }
        }
        return res;
        // int[][] carr = new int[counts.size()][2];
        // int itr = 0;
        // for (Map.Entry<Integer, Integer> e : counts.entrySet()) {
        //     carr[itr][0] = e.getKey();
        //     carr[itr][1] = e.getValue();
        //     ++itr;
        // }
        // Arrays.sort(carr, Comparator.comparing(a -> -a[1]));
        // int[] res = new int[k];
        // for (int i = 0; i < k; i++) {
        //     res[i] = carr[i][0];
        // }
        // return res;
    }
}
