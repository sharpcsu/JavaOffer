package _1;

import java.util.Scanner;

/**
 * 主题: 字符串
 *
 题目描述
 给定n个字符串，请对n个字符串按照字典序排列。
 输入描述:
 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 输出描述:
 数据输出n行，输出结果为按照字典序排列的字符串。
 示例1
 输入
 
 9
 cap
 to
 cat
 card
 two
 too
 up
 boat
 boot
 输出
 
 boat
 boot
 cap
 card
 cat
 to
 too
 two
 up
 
 * Created by sharp on 2017/7/10 - 13:56
 */
public class _14字串的连接最长路径查找 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        while(scanner.hasNext()) {
            s = s + " " + scanner.nextLine();
        }
        
        String[] str = s.split(" ");
        
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(str[j].compareTo(str[j + 1]) > 0) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        
        for(int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
    }
}
