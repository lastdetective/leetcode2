//Write a function that reverses a string. The input string is given as an array of characters char[]. 
//
// Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory. 
//
// You may assume all the characters consist of printable ascii characters. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
// 
//
// 
// Example 2: 
//
// 
//Input: ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]
// 
// 
// 
//

class Solution344 {
    public void reverseString(char[] s) {
        helper(0, s);
    }

    private char[] helper(int curr, char[] chars) {
        if (chars == null || chars.length == 0 || curr == chars.length / 2) {
            return chars;
        }
        char temp = chars[chars.length - 1 - curr];
        chars[chars.length - 1 - curr] = chars[curr];
        chars[curr] = temp;
        return helper(curr + 1, chars);
    }
}