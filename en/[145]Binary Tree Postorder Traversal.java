//Given a binary tree, return the postorder traversal of its nodes' values. 
//
// Example: 
//
// 
//Input: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//Output: [3,2,1]
// 
//
// Follow up: Recursive solution is trivial, could you do it iteratively? 
//

import sun.reflect.generics.tree.Tree;

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
class Solution145 {
    /**
     * @param root
     * @return
     */
   /* public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (result == null) {
            return result;
        }
        postOrderHelper(result, root);
        return result;

    }

    */

    /**
     * 新的
     *//*
    private void postOrderHelper(List<Integer> result, TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderHelper(result, root.left);
        postOrderHelper(result, root.right);
        result.add(root.val);
    }*/
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        return result;
    }

    private void helper(TreeNode root, List<Integer> result) {
        if (root != null) {
            helper(root.left, result);
            helper(root.right, result);
            result.add(root.val);
        }
    }

    public List<Integer> postorTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode last = null;
        TreeNode peeknode = null;
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                peeknode = stack.peek();
                if (peeknode.right != null && last != peeknode.right) {
                    root = peeknode.right;
                } else {
                    result.add(peeknode.val);
                    last = stack.pop();
                }
            }
        }
        return result;
    }


}