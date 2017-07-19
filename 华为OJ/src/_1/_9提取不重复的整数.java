package _1;

import java.util.Scanner;

/**
 * 主题:数组
 *
 题目描述
 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 输入描述:
 输入一个int型整数
 输出描述:
 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 示例1
 输入
 
 9876673
 输出
 
 37689
 * Created by sharp on 2017/7/10 - 13:54
 */
public class _9提取不重复的整数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++)
            arr[i] = -1;
        
        int num = scanner.nextInt();
        while(num > 0) {
            int i = num % 10;
            if(arr[i] == -1) {
                arr[i] = 1;
                System.out.print(i);
            }
            num /= 10;
        }
    }
}
