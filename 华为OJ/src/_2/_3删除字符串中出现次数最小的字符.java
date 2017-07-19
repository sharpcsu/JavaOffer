package _2;

import java.util.Scanner;


/**
 * 主题:字符串
 *
 题目描述
 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 输入描述:
 字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
 输出描述:
 删除字符串中出现次数最少的字符后的字符串。
 示例1
 输入
 
 abcdd
 输出
 
 dd
 * Created by sharp on 2017年7月10日19:24:11
 */
// TODO: 2017/7/10 oj为通过
public class _3删除字符串中出现次数最小的字符 {
    static int[] arr = new int[26];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }
        
        //查找字符出现最少的次数
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 26; i ++) {
            if (arr[i] != 0 && min > arr[i]) {
                min = arr[i];
            }
        }
        
        //删除出现次数最少的字符
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (arr[c - 'a'] != min) {
                sb.append(c);
            }
        }
    
        System.out.println(sb.toString());
    }
}
