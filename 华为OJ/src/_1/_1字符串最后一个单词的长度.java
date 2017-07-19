package _1;

import java.util.Scanner;

/**
 * 主题:字符串
 *
 题目描述
 计算字符串最后一个单词的长度，单词以空格隔开。
 输入描述:
 一行字符串，非空，长度小于5000。
 输出描述:
 整数N，最后一个单词的长度。
 示例1
 输入
 
 hello world
 输出
 
 5
 
 * Created by sharp on 2017/7/10 - 13:52
 */
public class _1字符串最后一个单词的长度 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
    
        if(str == null || str.equals(""))
            System.out.println(0);
    
        String[] strs = str.split(" ");
        String strEnd = strs[strs.length - 1];
        System.out.println(strEnd.length());
    }
}
