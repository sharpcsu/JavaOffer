package _1;

import java.util.Scanner;

/**
 * 主题: 字符串
 *
 题目描述
 描述：
 输入一个整数，将这个整数以字符串的形式逆序输出
 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 
 输入描述:
 输入一个int整数
 输出描述:
 将这个整数以字符串的形式逆序输出
 示例1
 输入
 
 1516000
 输出
 
 0006151
 
 * Created by sharp on 2017/7/10 - 13:55
 */
public class _11数字颠倒 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num == 0) {
            System.out.println(0);
            return;
        }
        
        while(num > 0) {
            System.out.print(num % 10);
            num /= 10;
        }
    }
}
