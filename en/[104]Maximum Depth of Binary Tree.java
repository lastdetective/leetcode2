//Given a binary tree, find its maximum depth. 
//
// The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node. 
//
// Note: A leaf is a node with no children. 
//
// Example: 
//
// Given binary tree [3,9,20,null,null,15,7], 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7 
//
// return its depth = 3. 
//

import org.omg.CORBA.MARSHAL;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution104 {
    private static int answer = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        upToDown(root, 1);
        return answer;
    }

    private void upToDown(TreeNode root, int maxDepth) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            answer = Math.max(answer, maxDepth);
        }
        upToDown(root.left, maxDepth + 1);
        upToDown(root.right, maxDepth + 1);
    }

    public int maxDepth2(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth2(root.left), maxDepth2(root.right)) + 1;
    }

    public int maxDepth3(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxDepthLeft = maxDepth3(root.left);
        int maxDepthRight = maxDepth3(root.right);
        return Math.max(maxDepthLeft, maxDepthRight)+1;
    }

}