/**
 * Created by sharp on 2017/7/19 - 15:22
 */
public class Test {
    public static void main(String[] args) {
//        String[] ss = "10.70.44.68".split("\\.");
//        System.out.println(ss.length);
    
//        String[] ss = "E:\\V1R2\\product\\fpgadrive.c".split("\\\\");
//        System.out.println(ss.length);
    
        String str = "abcdefghijklmn0123456789012345";
        String substring = str.substring(str.length() - 16, str.length());
        System.out.println(substring);
    }
}
