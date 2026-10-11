class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<SortedString, List<String>> idxs_map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            SortedString ss = new SortedString(strs[i]);
            List<String> idxs = idxs_map.getOrDefault(ss, new ArrayList<>());
            idxs.add(strs[i]);
            idxs_map.put(ss, idxs);
        }
        return new ArrayList<>(idxs_map.values());
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