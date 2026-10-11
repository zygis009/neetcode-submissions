class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0)+1);
        }
        int[][] carr = new int[counts.size()][2];
        int itr = 0;
        for (Map.Entry<Integer, Integer> e : counts.entrySet()) {
            carr[itr][0] = e.getKey();
            carr[itr][1] = e.getValue();
            ++itr;
        }
        Arrays.sort(carr, Comparator.comparing(a -> -a[1]));
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = carr[i][0];
        }
        return res;
    }
}
