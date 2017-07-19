package _1;

import java.util.Scanner;

/**
 * 主题:栈
 *
 * 题目描述
 数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 输入描述:
 先输入键值对的个数
 然后输入成对的index和value值，以空格隔开
 输出描述:
 输出合并后的键值对（多行）
 示例1
 输入
 
 4
 0 1
 0 2
 1 2
 3 4
 输出
 
 0 3
 1 2
 3 4
 
 * Created by sharp on 2017/7/10 - 13:54
 */
public class _8合并表记录 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] arr = new int[num][2];
        for(int i = 0; i < num; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        
        if(num < 2) {
            System.out.println(arr[0][0] + " " + arr[0][1]);
            return;
        }
        
        for(int i = 0; i < num - 1; i++) {
            for(int j = 0; j < num - i  - 1; j++) {
                if(arr[j][0] > arr[j + 1][0]) {
                    int temp0 = arr[j][0];
                    int temp1 = arr[j][1];
                    arr[j][0] = arr[j + 1][0];
                    arr[j][1] = arr[j + 1][1];
                    arr[j + 1][0] = temp0;
                    arr[j + 1][1] = temp1;
                }
            }
        }
        
        for(int i = 1; i < num; i++) {
            if(arr[i - 1][0] == arr[i][0]) {
                arr[i][1] += arr[i - 1][1];
            } else {
                System.out.println(arr[i - 1][0] + " " + arr[i - 1][1]);
            }
        }
        
        System.out.println(arr[num -1][0] + " " + arr[num - 1][1]);
    }
}
