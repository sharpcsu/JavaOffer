package Coms;

/**
 * Created by sharp on 7/4 0004 - 23:10
 */
public class Test03 {
    public static void main(String[] args) {
        String classFile = "com.jd.". replaceAll(".", "/") + "MyClass.class";
        System.out.println(classFile);
    }
}
