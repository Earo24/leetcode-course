/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {

        int res = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (i < c.length - 1) {
                switch (String.valueOf(new char[] { c[i], c[i + 1] })) {
                    case "IV":
                        res += 4;
                        i++;
                        break;
                    case "IX":
                        res += 9;
                        i++;
                        break;
                    case "XL":
                        res += 40;
                        i++;
                        break;
                    case "XC":
                        res += 90;
                        i++;
                        break;
                    case "CD":
                        res += 400;
                        i++;
                        break;
                    case "CM":
                        res += 900;
                        i++;
                        break;
                    default:
                        switch (c[i]) {
                            case 'I':
                                res += 1;
                                break;
                            case 'V':
                                res += 5;
                                break;
                            case 'X':
                                res += 10;
                                break;
                            case 'L':
                                res += 50;
                                break;
                            case 'C':
                                res += 100;
                                break;
                            case 'D':
                                res += 500;
                                break;
                            case 'M':
                                res += 1000;
                                break;
                            default:
                                break;
                        }
                }
            } else {
                switch (c[i]) {
                    case 'I':
                        res += 1;
                        break;
                    case 'V':
                        res += 5;
                        break;
                    case 'X':
                        res += 10;
                        break;
                    case 'L':
                        res += 50;
                        break;
                    case 'C':
                        res += 100;
                        break;
                    case 'D':
                        res += 500;
                        break;
                    case 'M':
                        res += 1000;
                        break;
                    default:
                        break;
                }
            }
        }
        return res;
    }
}
// @lc code=end
