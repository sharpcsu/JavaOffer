package _1;

import java.util.Scanner;

/**
 * 主题:字符串
 *
 题目描述
 •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 输入描述:
 连续输入字符串(输入2次,每个字符串长度小于100)
 输出描述:
 输出到长度为8的新字符串数组
 示例1
 输入
 
 abc
 123456789
 输出
 
 abc00000
 12345678
 90000000
 * Created by sharp on 2017/7/10 - 13:53
 */
public class _4字符串分隔 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            int n = str.length() % 8 == 0 ? 0 : 8 - str.length() % 8;
            System.out.print(str.charAt(0));
            for(int i = 1; i < str.length() + n; i++) {
                if(i >= str.length()) {
                    System.out.print(0);
                } else {
                    if(i % 8 == 0)
                        System.out.println();
                    System.out.print(str.charAt(i));
                }
            }
        
            System.out.println();
        }
    }
}
