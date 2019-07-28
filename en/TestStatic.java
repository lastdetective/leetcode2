/**
 * @author Bruce Liu
 * @version V1.0.0
 * @ClassName TestStatic
 * @Description
 * @date 2019-07-27 20:23
 */
public class TestStatic {
    public static TestStatic t1 = new TestStatic();
    {
        System.out.println("blockA");
    }
    static {
        System.out.println("blockB");
    }

    {
        System.out.println("another one");
    }
    public static void main(String[] args) {
        TestStatic t2 = new TestStatic();
    }
}
