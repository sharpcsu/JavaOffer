package _1;

import java.util.Scanner;

/**
 * 主题:数组
 *
 题目描述
 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 
 接口说明
 // 反转句子
 //
 // @param sentence 原句子
 // @return 反转后的句子
 
public String reverse(String sentence);
        
        
        
        输入描述:
        将一个英文语句以单词为单位逆序排放。
        输出描述:
        得到逆序的句子
        示例1
        输入
        
        I am a boy
        输出
        
        boy a am I
        
 * Created by sharp on 2017/7/10 - 13:55
 */
public class _13句子逆序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        
        String res = reverse(str);
        System.out.println(res);
    }
    
    public static String reverse(String sentence) {
        String[] strs = sentence.split(" ");
        int len = strs.length;
        for(int i = 0; i < (len + 1) / 2; i++) {
            String temp = strs[i];
            strs[i] = strs[len - 1 - i];
            strs[len - 1 - i] = temp;
        }
        
        String res = strs[0];
        for(int i = 1; i < len; i++) {
            res = res + " " + strs[i];
        }
        
        return res;
    }
}
