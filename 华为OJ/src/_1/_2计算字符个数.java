package _1;

import java.util.Scanner;

/**
 * 主题:字符串
 *
 题目描述
 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 输入描述:
 输入一个有字母和数字以及空格组成的字符串，和一个字符。
 输出描述:
 输出输入字符串中含有该字符的个数。
 示例1
 输入
 
 ABCDEF
 A
 输出
 
 1
 
 * Created by sharp on 2017/7/10 - 13:53
 */
public class _2计算字符个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String s = str.toUpperCase();
        char c = scanner.nextLine().toUpperCase().charAt(0);
    
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(s.charAt(i) == c)
                count++;
        }
    
        System.out.println(count);
    }
}
