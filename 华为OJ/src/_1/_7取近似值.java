package _1;

import java.util.Scanner;

/**
 *
 * 题目描述
 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 输入描述:
 输入一个正浮点数值
 输出描述:
 输出该数值的近似整数值
 示例1
 输入
 
 5.5
 输出
 
 6
 * Created by sharp on 2017/7/10 - 13:54
 */
public class _7取近似值 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        int res;
        if((int)(f + 0.5f) == (int)f)
            res = (int)f;
        else
            res = (int)f + 1;
        System.out.println(res);
    }
}
