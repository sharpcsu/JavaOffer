package _1;

import java.util.Scanner;

/**
 * 主题:字符串
 *
 * 题目:
 * 题目描述
 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，
 从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 
 输入：
 
 合法坐标为A(或者D或者W或者S) + 数字（两位以内）
 
 坐标之间以;分隔。
 
 非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。//合法性判断
 
 下面是一个简单的例子 如：
 
 A10;S20;W10;D30;X;A1A;B10A11;;A10;
 
 处理过程：
 
 起点（0,0）
 
 +   A10   =  （-10,0）
 +   S20   =  (-10,-20)
 +   W10  =  (-10,-10)
 +   D30  =  (20,-10)
 +   x    =  无效
 +   A1A   =  无效
 +   B10A11   =  无效
 +  一个空 不影响
 +   A10  =  (10,-10)
 
 结果 （10， -10）
 
 输入描述:
 一行字符串
 输出描述:
 最终坐标，以,分隔
 示例1
 输入
 
 A10;S20;W10;D30;X;A1A;B10A11;;A10;
 输出
 
 10,-10
 * Created by sharp on 2017/7/10 - 13:57
 */
// TODO: 2017/7/10 运行超时  oj未通过
public class _17坐标移动 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.split(";");
    
        int x = 0;
        int y = 0;
    
        for(String s : strs) {
            if (isLegal(s)) {
                switch (s.charAt(0)) {
                    case 'A':
                        x -= Integer.valueOf(s.split("A")[1]);
                        break;
                    case 'W':
                        y += Integer.valueOf(s.split("W")[1]);
                        break;
                    case 'D':
                        x += Integer.valueOf(s.split("D")[1]);
                        break;
                    case 'S':
                        y -= Integer.valueOf(s.split("S")[1]);
                        break;
                    default:
                        throw new RuntimeException("输入错误");
                }
            }
        }
    
        //输出结果
        System.out.println(x + "," + y);
    }
    
    /**
     * 判断输入的坐标是否合法
     * @param s 输入的坐标为
     * @return 坐标是否合法
     */
    private static boolean isLegal(String s) {
        //坐标为空
        if (s == null || "".equals(s)) {
            return false;
        }
        
        //坐标以AWDS开头
        if (!(s.charAt(0) == 'A' || s.charAt(0) == 'W' || s.charAt(0) == 'D' || s.charAt(0) == 'S')) {
            return false;
        }
    
        if (s.length() == 2) {
            if (s.charAt(1) >= '0' && s.charAt(1) <= '9') {
                return true;
            } else {
                return false;
            }
        } else if (s.length() == 3) {
            if (s.charAt(1) >= '1' && s.charAt(1) <= '9' && s.charAt(2) >= '0' && s.charAt(2) <= '9') {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
