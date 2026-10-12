class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for (char c : s.toCharArray()) {
            if (map.values().contains(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || map.get(c) != stack.pop()) return false;
            }
        }
        return stack.isEmpty();
    }
}
