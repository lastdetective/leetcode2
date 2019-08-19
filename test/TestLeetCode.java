import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Bruce Liu
 * @version V1.0.0
 * @ClassName Test1
 * @Description
 * @date 2019-07-18 11:40
 */
public class TestLeetCode {
    @Test
    public void test1() {
        Solution1 solution1 = new Solution1();
        int[] nums = {0, 3, 9, 3};
        int target = 6;
        int[] result = solution1.twoSum(nums, target);
        Assert.assertArrayEquals(new int[]{1, 3}, result);
    }

    @Test
    public void test15() {
        Solution15 solution15 = new Solution15();
        solution15.threeSum(null);
    }

    @Test
    public void test26() {
        Solution26 solution26 = new Solution26();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length = solution26.removeDuplicates(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    @Test
    public void test20() {
        Solution20 solution20 = new Solution20();
        String s = "(){[(]}[]";
        Assert.assertTrue(solution20.isValid(s));
    }

    @Test
    public void test42() {
        Solution42 solution42 = new Solution42();
        int[] a = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = solution42.trap3(a);
        Assert.assertEquals(6, result);

    }

    @Test
    public void test144() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;
        Solution144 solution144 = new Solution144();
        List<Integer> result = solution144.preorderTraversal(treeNode1);
        Assert.assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    public void test94() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode8 = new TreeNode(8);
        treeNode1.left = treeNode4;
        treeNode1.right = treeNode5;
        treeNode4.right = treeNode6;
        treeNode5.left = treeNode8;
        Solution94 solution94 = new Solution94();
        List<Integer> result = solution94.inorderTraversal(treeNode1);
        Assert.assertEquals(Arrays.asList(4, 6, 1, 8, 5), result);
    }

    @Test
    public void test145() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode8 = new TreeNode(8);
        treeNode1.left = treeNode4;
        treeNode1.right = treeNode5;
        treeNode4.right = treeNode6;
        treeNode5.left = treeNode8;
        Solution145 solution145 = new Solution145();
        List<Integer> result = solution145.postorderTraversal(treeNode1);
        Assert.assertEquals(Arrays.asList(6, 4, 8, 5, 1), result);
    }

    @Test
    public void test102() {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        Solution102 solution102 = new Solution102();
        List<List<Integer>> result = solution102.levelOrder(treeNode1);

        Assert.assertEquals(Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(9, 20),
                Arrays.asList(15, 7)
        ), result);
    }

    @Test
    public void test104() {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        //      TreeNode treeNode1 = new TreeNode(0);

        Solution104 solution104 = new Solution104();
        int result = solution104.maxDepth3(treeNode1);
        Assert.assertEquals(3, result);
    }

    @Test
    public void test101() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(3);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        Solution101 solution101 = new Solution101();
        boolean result = solution101.isSymmetric(treeNode1);
        Assert.assertEquals(true, result);
    }

    @Test
    public void reversePrint() {
        char[] chars = {'2', '1', '3', '4'};
        ReversePrint reversePrint = new ReversePrint();
        reversePrint.printReverse(chars);
    }

    @Test
    public void test344() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        Solution344 solution344 = new Solution344();
        solution344.reverseString(s);
        System.out.println(s);
    }

    @Test
    public void test118() {
        int nums = 8;
        Solution118 solution118 = new Solution118();
        List<List<Integer>> result = solution118.generate2(nums);
        System.out.println(result);

    }

    @Test
    public void testSql() {
        int x = 10;
        int y = 10;
        System.out.println(x == y);
    }

    @Test
    public void test24() {
        //Given 1->2->3->4, you should return the list as 2->1->4->3.
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Solution24 solution24 = new Solution24();
        ListNode result = solution24.swapPairs(node1);
        System.out.println(result);
    }
}
