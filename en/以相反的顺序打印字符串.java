import org.junit.Test;

/**
 * @author Bruce Liu
 * @version V1.0.0
 * @ClassName 以相反的顺序打印字符串
 * @Description
 * @date 2019-08-13 22:20
 */
class ReversePrintTest {

    /**
     * 比如有一个字符数组 s[n]
     * 要 反向打印
     */
    public static void main(String[] args) {
        printReverse();
    }
    public static void printReverse() {
        char[] chars = {'H', 'E', 'L', 'L', 'O'};
        helper(0,chars);
    }

    public static void helper(int index, char[] chars) {
        if (chars == null || index >= chars.length) {
            return;
        }
        helper(index + 1, chars);
        System.out.print(chars[index]);
    }
}
