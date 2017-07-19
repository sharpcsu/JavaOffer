package Coms;

/**
 * Created by sharp on 7/12 0012 - 0:00
 */
public class Test6 {
    static {
        int x = 5;
    }

    static int x, y;
    public static void main(String[] args) {
        x--;
        myMethod();
        int num = x + y + ++x;
        System.out.println(num);


    }
    
    private static void myMethod() {
        y = x++ + ++x;
    }
}
