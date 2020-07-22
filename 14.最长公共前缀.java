import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        // if(strs.length==0){
        //     return "";
        // }
        // List<char[]> list=new ArrayList<>();
        // for(String str:strs){
        //     list.add(str.toCharArray());
        // }
        // int i=0;
        // out:while(true){
        //     int res=0;
        //     for(char[] str:list){
        //         if(i>str.length-1){
        //             break out;
        //         }
        //         res=res^str[i];
        //         if(res!=0&&res!=str[i]){
        //             break out;
        //         }
        //     }
        //     if(strs.length%2==0){
        //         if(res!=0){
        //             break;
        //         }
        //     }else{
        //         if(res!=list.get(0)[i]){
        //             break;
        //         }
        //     }
        //     i++;
        // }
        // return strs[0].substring(0,i);
        if(strs.length==0){
            return "";
        }
        String pStr=strs[0];
        for(int i=0;i<strs.length;i++){
            int j=0;
            for(;j<strs[i].length()&&j<pStr.length();j++){
                if(pStr.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            pStr=pStr.substring(0,j);
        }
        return pStr;
    }
}
// @lc code=end

