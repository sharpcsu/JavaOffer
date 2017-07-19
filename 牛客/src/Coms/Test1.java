package Coms;

/**
 * String 类型
 *
 * @author sharp
 *         时间:2017-6-17 下午4:13:40
 */
public class Test1 {
    private static String MESSAGE = "taobao";

    public static void main(String[] args) {
        String a = "tao" + "bao";
        String b = "tao";
        String c = "bao";

        System.out.println(a == MESSAGE);
        System.out.println((b + c) == MESSAGE);
    }
}
