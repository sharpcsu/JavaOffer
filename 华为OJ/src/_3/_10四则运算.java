package _3;

import java.util.Scanner;

/**
 * 请实现如下接口
//  功能：四则运算
// 输入： strExpression ：字符串格式的算术表达式，如 : "3+2*{1+2*[-4/(8-6)+7]}"
// 返回： 算术表达式的计算结果
//
public   static   int  calculate(String strExpression)
        {
        //请实现
        return  0;
        }
        约束：
        pucExpression 字符串中的有效字符包括 [ ‘0’-‘9’],‘+’,‘-’, ‘*’,‘/’ ,‘(’， ‘)’,‘[’, ‘]’,‘{’ ,‘}’。
        pucExpression 算术表达式的有效性由调用者保证;
        
        
        输入描述:
        输入一个算术表达式
        输出描述:
        得到计算结果
 * Created by sharp on 2017/7/7 - 18:47
 */
// TODO: 2017/7/7 重要
public class _10四则运算 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
    
        int res = calculate(s);
    }
    
    public static int calculate(String strExpression) {
    
        return 0;
    }
}
