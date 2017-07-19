package _2;

import java.util.Scanner;

/**
 * 主题:字符串
 * <p>
 * 题目描述
 * 密码是我们生活中非常重要的东东，我们的那么一点不能说的秘密就全靠它了。哇哈哈. 接下来渊子要在密码之上再加一套密码，虽然简单但也安全。
 * <p>
 * 假设渊子原来一个BBS上的密码为zvbo9441987,为了方便记忆，他通过一种算法把这个密码变换成YUANzhi1987，这个密码是他的名字和出生年份，
 * 怎么忘都忘不了，而且可以明目张胆地放在显眼的地方而不被别人知道真正的密码。
 * <p>
 * 他是这么变换的，大家都知道手机上的字母： 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,
 * 就这么简单，渊子把密码中出现的小写字母都变成对应的数字，数字和其他的符号都不做变换，
 * <p>
 * 声明：密码中没有空格，而密码中出现的大写字母则变成小写之后往后移一位，如：X，先变成小写，再往后移一位，不就是y了嘛，简单吧。记住，z往后移是a哦。
 * <p>
 * 输入描述:
 * 输入包括多个测试数据。输入是一个明文，密码长度不超过100个字符，输入直到文件结尾
 * 输出描述:
 * 输出渊子真正的密文
 * <p>
 * 示例1
 * 输入
 * YUANzhi1987
 * <p>
 * 输出
 * zvbo9441987
 * <p>
 * Created by sharp on 2017/7/10 - 13:58
 */
public class _1简单密码破解 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append(upper2c(c));
            } else if (c >= 'a' && c <= 'z') {
                sb.append(low2c(c));
            } else if (c >= '0' && c <= '9') {
                sb.append(c);
            } else {
                throw new RuntimeException("输入错误");
            }
        }
    
        System.out.println(sb.toString());
    }
    
    /**
     * 大写字母转密文
     * @param c 大写字母
     * @return 密文
     */
    private static char upper2c(char c) {
        //转成小写字母
        char lowerC = Character.toLowerCase(c);
    
        //后移一位
        // TODO: 2017/7/10 字符按照字典顺序后移一位
        if (lowerC>= 'a' && lowerC<= 'y') {
            return (char) (lowerC+ 1);
        } else {
            return 'a';
        }
    }
    
    /**
     * 小写字母转密文
     * @param c 小写字母
     * @return 密文
     */
    private static char low2c(char c) {
        if (c >= 'a' && c <= 'c') {
            return '2';
        } else if (c >= 'd' && c <= 'f') {
            return '3';
        } else if (c >= 'g' && c <= 'i') {
            return '4';
        } else if (c >= 'j' && c <= 'l') {
            return '5';
        } else if (c >= 'm' && c <= 'o') {
            return '6';
        } else if (c >= 'p' && c <= 's') {
            return '7';
        } else if (c >= 't' && c <= 'v') {
            return '8';
        } else {
            return '9';
        }
    }
}
