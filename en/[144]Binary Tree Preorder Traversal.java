//Given a binary tree, return the preorder traversal of its nodes' values. 
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
//Output: [1,2,3]
// 
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
class Solution144 {
    /**
     * recursive solution
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private void dfs(TreeNode root, List<Integer> ret) {
        if (root != null) {
            ret.add(root.val);
            dfs(root.left, ret);
            dfs(root.right, ret);
        }
    }

    /**
     * Iterative Solution
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> toVisit = new Stack<>();
        toVisit.push(root);
        while (!toVisit.isEmpty()) {
            TreeNode visiting = toVisit.pop();
            result.add(visiting.val);
            if (visiting.right != null) {
                toVisit.push(visiting.right);
            }
            if (visiting.left != null) {
                toVisit.push(visiting.left);
            }
        }
        return result;
    }

}