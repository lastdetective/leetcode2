//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining. 
//
// 
//The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image! 
//
// Example: 
//
// 
//Input: [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6 
//

import javax.swing.text.MutableAttributeSet;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/articles/trapping-rain-water/">solution</a>
 */
class Solution42 {
    /**
     * 算出每一个格子 左边的最高的格子 右边的最高高度
     * 最终的大小 min(maxleft,maxright)-当前的高度
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int ans = 0;
        for (int i = 1; i < height.length; i++) {
            int maxLeft = 0;
            int maxRight = 0;
            for (int l = i - 1; l >= 0; l--) {
                maxLeft = Math.max(maxLeft, height[l]);

            }
            for (int r = i + 1; r < height.length; r++) {
                maxRight = Math.max(maxRight, height[r]);
            }
            if (maxLeft > height[i] && maxRight > height[i]) {
                ans += Math.min(maxLeft, maxRight) - height[i];
            }

        }
        return ans;
    }


    public int trap2(int[] height) {
        if (height == null) {
            return 0;
        }
        int ans = 0;
        int size = height.length;
        int[] leftMax = new int[size];
        int[] rightMax = new int[size];
        for (int i = 1; i < size; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        rightMax[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        for (int i = 1; i < size - 1; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return ans;

    }

    /**
     * Approach 3: Using stacks
     * Intuition
     * <p>
     * Instead of storing the largest bar upto an index as in Approach 2, we can use stack to keep track of the bars that are bounded by longer bars and hence, may store water. Using the stack, we can do the calculations in only one iteration.
     * <p>
     * We keep a stack and iterate over the array. We add the index of the bar to the stack if bar is smaller than or equal to the bar at top of stack, which means that the current bar is bounded by the previous bar in the stack. If we found a bar longer than that at the top, we are sure that the bar at the top of the stack is bounded by the current bar and a previous bar in the stack, hence, we can pop it and add resulting trapped water to \text{ans}ans.
     * <p>
     * Algorithm
     * <p>
     * Use stack to store the indices of the bars.
     * Iterate the array:
     * While stack is not empty and \text{height}[current]>\text{height}[st.top()]height[current]>height[st.top()]
     * It means that the stack element can be popped. Pop the top element as \text{top}top.
     * Find the distance between the current element and the element at top of stack, which is to be filled. \text{distance} = \text{current} - \text{st.top}() - 1distance=current−st.top()−1
     * Find the bounded height \text{bounded\_height} = \min(\text{height[current]}, \text{height[st.top()]}) - \text{height[top]}bounded_height=min(height[current],height[st.top()])−height[top]
     * Add resulting trapped water to answer \text{ans} \mathrel{+}= \text{distance} \times \text{bounded\_height}ans+=distance×bounded_height
     * Push current index to top of the stack
     * Move \text{current}current to the next position
     *
     * @param height
     * @return
     */
    public int trap3(int[] height) {
        int ans = 0, current = 0;
        Stack<Integer> st = new Stack<>();
        while (current < height.length) {
            while (!st.empty() && height[current] > height[st.peek()]) {
                int top = st.peek();
                st.pop();
                if (st.empty()) {
                    break;
                }
                int distance = current - st.peek() - 1;
                int bounded_height = Math.min(height[current], height[st.peek()]) - height[top];
                ans += distance * bounded_height;
            }
            st.push(current++);
        }
        return ans;

    }
}
