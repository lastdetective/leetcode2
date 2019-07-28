/**
 * @author Bruce Liu
 * @version V1.0.0
 * @ClassName 相反的顺序打印字符串
 * @Description
 * @date 2019-07-27 16:30
 */
class ReversePrint {
    public void printReverse(char[] str) {
        helper(0, str);
    }

    private void helper(int index, char[] str) {
        if (str == null || index >= str.length) {
            return;
        }
        helper(index + 1, str);
        System.out.print(str[index]);
    }
}
