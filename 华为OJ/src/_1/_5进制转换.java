package _1;

import java.util.Scanner;

/**
 * 主题:字符串
 *
 题目描述
 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
 输入描述:
 输入一个十六进制的数值字符串。
 输出描述:
 输出该数值的十进制字符串。
 示例1
 输入
 
 0xA
 输出
 
 10
 
 * Created by sharp on 2017/7/10 - 13:53
 */
public class _5进制转换 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            int count = 0;
            for(int i = 2; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c >= '0' && c <= '9') {
                    count = count * 16 + c - '0';
                } else {
                    count = count * 16 + c - 'A' + 10;
                }
            }
        
            System.out.println(count);
        }
    }
}
