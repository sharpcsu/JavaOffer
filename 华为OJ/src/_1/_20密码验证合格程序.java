package _1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * 主题:字符串 数组
 *
 * 题目描述
 密码要求:
 1.长度超过8位
 2.包括大小写字母.数字.其它符号,以上四种至少三种
 3.不能有相同长度超2的子串重复
 
 说明:长度超过2的子串
 
 输入描述:
 一组或多组长度超过2的子符串。每组占一行
 输出描述:
 如果符合要求输出：OK，否则输出NG
 示例1
 输入
 
021Abc9000
021Abc9Abc1
021ABC9000
021$bc9000
 
 输出
 
 OK
 NG
 NG
 OK
 * Created by sharp on 2017年7月10日18:28:02
 */
// TODO: 2017/7/10 oj未通过
public class _20密码验证合格程序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
    
        // TODO: 2017/7/10 从控制台连续输入有问题
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            list.add(str);
        }
    
        //判断密码是否合规
        for (String s : list) {
            //1. 长度超过8位
            if (s.length() < 8) {
                System.out.println("NG");
                continue;
            }
    
            //2. 包含大小写字母 数字 特殊符号的至少三种
            if (containNums(s) < 3) {
                System.out.println("NG");
                continue;
            }
    
            //3. 不能有长度超过2的子串重复
            if (containTwoLonger(s)) {
                System.out.println("NG");
            } else {
                System.out.println("OK");
            }
        }
    }
    
    /**
     * 是否包含长度超过2的子串重复
     * @param s 密码字符串
     * @return true or false
     */
    private static boolean containTwoLonger(String s) {
        //生成长度为2的子串
        String[] strs = new String[s.length() - 1];
        for(int i = 0; i < s.length() - 2; i++) {
            strs[i] = s.substring(i, i + 3);
        }
        
        //判断是否包含相同的子串
        for(int i = 0; i < strs.length - 1; i++) {
            for(int j = i + 1; j < strs.length; j++) {
                if (strs[i].equals(strs[j])) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /**
     * 字符串包含几种类型数字
     * @param s 密码字符串
     * @return 种类数目
     */
    private static int containNums(String s) {
        boolean containUpper = false;
        boolean containLower = false;
        boolean containNum = false;
        boolean containSep = false;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                containUpper = true;
            } else if (c >= 'a' && c <= 'z') {
                containLower = true;
            } else if (c >= '0' && c <= '9') {
                containNum = true;
            } else {
                containSep = true;
            }
    
            if (containUpper && containLower && containNum && containSep) {
                return 4;
            }
        }
        
        int num = 0;
        if (containUpper) {
            num++;
        }
    
        if (containLower) {
            num++;
        }
    
        if (containNum) {
            num++;
        }
    
        if (containSep) {
            num++;
        }
        
        return num;
    }
}
