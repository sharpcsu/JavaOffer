package 异常;

/**
 * Created by sharp on 2017/8/1 - 16:29
 */
public class Demo1 {
    public static void main(String[] args) {
        try {
            a();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    
    private static void a() throws RuntimeException{
        System.out.println("a-before");
        try {
            b();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("a-after");
    }
    
    private static void b() throws RuntimeException {
        System.out.println("b-before");
        throw new RuntimeException("出现异常了");
    }
    
    
}
