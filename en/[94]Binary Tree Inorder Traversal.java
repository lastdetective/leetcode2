//Given a binary tree, return the inorder traversal of its nodes' values. 
//
// Example: 
//
// 
//Input: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//Output: [1,3,2] 
//
// Follow up: Recursive solution is trivial, could you do it iteratively? 
//

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution94 {
    /**
     * recursive method
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderHelper(root, result);
        return result;


    }

    private void inOrderHelper(TreeNode root,
                               List<Integer> result) {
        if (root != null) {
            //     if (root.left != null) {
            inOrderHelper(root.left, result);
            //  }
            result.add(root.val);
            //   if (root.right != null) {
            inOrderHelper(root.right, result);
            //    }
        }
    }

    /**
     * 迭代的方法
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> toVisit = new Stack<>();
        if (root == null) {
            return result;
        }
        TreeNode curr = root;
        while (curr != null || !toVisit.isEmpty()) {
            while (curr != null) {
                toVisit.push(curr);
                curr = curr.left;
            }
            TreeNode visiting = toVisit.pop();
            result.add(visiting.val);
            curr = visiting.right;
        }
        return result;
    }
}