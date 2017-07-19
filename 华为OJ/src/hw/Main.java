package hw;

import java.util.*;
/**
 * Created by sharp on 6/28 0028 - 0:15
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int count = 0; //计数器
        while (num > 0) {
            if (num % 2 == 1) {
                count++; //为1时加1
            }

            num /= 2;
        }

        System.out.println(count);
    }
}