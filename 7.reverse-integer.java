import java.util.Stack;

/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        final Stack<Integer> result = new Stack<Integer>();
        while (true) {
            final int mantissa = x % 10;
            result.push(mantissa);
            x /= 10;
            if (x == 0) {
                break;
            }
        }
        if (result.peek().equals(0)) {
            result.pop();
        }
        int resultNum = 0;
        int i = 0;
        while (!result.empty()) {
            resultNum += result.pop() * Math.pow(10, i++);
            System.out.println(resultNum);
        }
        return resultNum;
    }
}
// @lc code=end
