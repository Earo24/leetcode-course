import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for (int i = 0; i < nums.length - 1; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] + nums[j] == target) {
        // return new int[] { i, j };
        // }
        // }
        // }
        Map<Integer, Integer> dic = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(dic.get(target-nums[i])!=null){
                return new int[]{dic.get(target-nums[i]),i};
            }
            dic.put(nums[i], i);
        }
        return null;

    }
}
// @lc code=end
