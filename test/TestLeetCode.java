import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

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
        Assert.assertEquals(6,result);

    }
}
