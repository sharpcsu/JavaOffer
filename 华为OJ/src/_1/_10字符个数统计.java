package _1;

import java.util.Scanner;

/**
 * 主题:字符串
 *
 * 题目描述
 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
 输入描述:
 输入N个字符，字符在ACSII码范围内。
 输出描述:
 输出范围在(0~127)字符的个数。
 示例1
 输入
 
 abc
 输出
 
 3
 
 * Created by sharp on 2017/7/10 - 13:54
 */
public class _10字符个数统计 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        int[] arr = new int[128];
        int count = 0;
        
        for(int i = 0; i < chars.length; i++) {
            arr[chars[i]] = 1;
        }
        
        for(int i = 0; i < 128; i++) {
            if(arr[i] != 0)
                count++;
        }
        
        System.out.println(count);
    }
}
