package _1;

import java.util.Scanner;

/**
 * 题目描述
 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 输入描述:
 输入一个整数（int类型）
 输出描述:
 这个数转换成2进制后，输出1的个数
 示例1
 输入
 
 5
 输出
 
 2
 
 * Created by sharp on 2017/7/10 - 13:56
 */
public class _15求int型数据在内存中存储时1的个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int count = 0; //计数器
        while(num > 0) {
            if(num % 2 == 1) {
                count++; //为1时加1
            }
            
            num = num / 2;
        }
        
        System.out.println(count);
    }
}
