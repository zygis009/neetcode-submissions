class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append('(');
            str = str.replace("\\", "\\\\")
                     .replace("(", "\\(")
                     .replace(")", "\\)");
            sb.append(str);
            sb.append(')');
        }
        return new String(sb);
    }

    public List<String> decode(String str) {
        if (str.length() == 0) return new ArrayList<>();
        char[] chars = str.toCharArray();
        StringBuilder tracker = new StringBuilder();
        List<String> res = new ArrayList<>();
        for (int i = 1; i < chars.length - 1; i++) {
            char c = chars[i];
            tracker.append(c);
            if (c == '(' && tracker.charAt(tracker.length()-2) == ')') {
                String s = tracker.substring(0, tracker.length()-2)
                            .replace("\\\\", "\\")
                            .replace("\\(", "(")
                            .replace("\\)", ")");
                res.add(s);
                tracker = new StringBuilder();
            }
        }
        String s = new String(tracker)
                    .replace("\\\\", "\\")
                    .replace("\\(", "(")
                    .replace("\\)", ")");
        res.add(s);
        return res;
    }
}
