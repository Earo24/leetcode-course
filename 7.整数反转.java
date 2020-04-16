/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (Integer.MAX_VALUE / 10 < result) {
                return 0;
            }
            if (Integer.MIN_VALUE / 10 > result) {
                return 0;
            }
            result = result * 10 + pop;
        }
        return result;
    }
}
// @lc code=end
