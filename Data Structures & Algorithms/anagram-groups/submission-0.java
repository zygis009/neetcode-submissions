class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<SortedString, List<Integer>> idxs_map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            SortedString ss = new SortedString(strs[i]);
            List<Integer> idxs = idxs_map.getOrDefault(ss, new ArrayList<>());
            idxs.add(i);
            idxs_map.put(ss, idxs);
        }
        List<List<String>> res = new ArrayList<>();
        for (List<Integer> v : idxs_map.values()) {
            List<String> str_list = new ArrayList<>();
            for (int idx : v) {
                str_list.add(strs[idx]);
            }
            res.add(str_list);
        }
        return res;
    }
}

class SortedString {
    
    public String sorted;
    
    public SortedString(String s) {
        char[] cs = s.toCharArray();
        Arrays.sort(cs);
        this.sorted = new String(cs);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != getClass()) return false;
        SortedString other = (SortedString) o;
        return this.sorted.equals(other.sorted);
    }

    @Override
    public int hashCode() {
        return this.sorted.hashCode();
    }
}