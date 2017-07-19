package Coms;

/**
 * 网易
 * 父类、子类继承
 *
 * @author sharp
 *         时间:2017-6-17 下午4:19:04
 */
public class Test01 {
    public static void main(String[] args) {
        Base base = new Son();
        base.method();
    }
}

class Base {
    public void method() {
        System.out.println("base");
    }
}

class Son extends Base {
    public void method() {
        System.out.println("son");
    }

    public void methodB() {
        System.out.println("sonB");
    }
}