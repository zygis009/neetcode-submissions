class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int vol = 0;
        while (l < r) {
            vol = Math.max(vol, (r - l) * Math.min(heights[l], heights[r]));
            if (heights[l] < heights[r]) l++;
            else r--;
        }
        return vol;
    }
}
