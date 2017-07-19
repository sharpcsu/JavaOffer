package exec1;

/**
 * Created by sharp on 7/5 0005 - 23:39
 */
public class Derived {
    public Derived(String s) {
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Derived("c");
    }
}

class Base2 {
    public Base2(String s) {
        System.out.println("B");
    }
}
