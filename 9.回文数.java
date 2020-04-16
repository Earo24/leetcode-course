/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        // String s = String.valueOf(x);
        // char[] c = s.toCharArray();
        // for (int i = 0; i < c.length / 2; i++) {
        // if (c[i] != c[c.length - i - 1]) {
        // return false;
        // }
        // }
        // return true;
        int current = 0;
        while (x > current) {
            current = current * 10 + x % 10;
            x /= 10;
        }
        return current == x || x == current / 10;
    }
}
// @lc code=end
