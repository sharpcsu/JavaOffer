package _1;

import java.util.Scanner;

/**
 * 主题:排序
 *
 题目描述
 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
 最后一个数后面也要有空格
 
 详细描述：
 
 函数接口说明：
 public String getResult(long ulDataInput)
 输入参数：
 long ulDataInput：输入的正整数
 返回值：
 String
 
 
 输入描述:
 输入一个long型整数
 输出描述:
 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
 示例1
 输入
 
 180
 输出
 
 2 2 3 3 5
 * Created by sharp on 2017/7/10 - 13:53
 */
public class _6质数因子 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        
        String res = getResult(l);
        System.out.println(res);
    }
    
    public static String getResult(long ulDataInput) {
        int count = 2;
        String res = "";
        while(true) {
            if(ulDataInput % count == 0) {
                res = res + count + " ";
                ulDataInput = ulDataInput / count;
            } else {
                count++;
            }
            
            if(count == ulDataInput) {
                res = res + count + " ";
                break;
            }
        }
        
        return res;
    }
}
