class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int l = 0, r = chars.length - 1;
        while (l < chars.length && !Character.isLetterOrDigit(chars[l])) {
            ++l;
        }
        while (r >= 0 && !Character.isLetterOrDigit(chars[r])) {
            --r;
        }
        while (l < r) {
            if (Character.toLowerCase(chars[l++]) != Character.toLowerCase(chars[r--])) return false;
            while (l < chars.length && !Character.isLetterOrDigit(chars[l])) {
                ++l;
            }
            while (r >= 0 && !Character.isLetterOrDigit(chars[r])) {
                --r;
            }
        }
        return true;
    }
}
