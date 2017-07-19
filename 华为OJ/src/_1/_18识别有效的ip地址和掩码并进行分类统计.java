package _1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 主题:字符串, 查找
 * <p>
 * 题目描述
 * 请解析IP地址和对应的掩码，进行分类识别。要求按照A/B/C/D/E类地址归类，不合法的地址和掩码单独归类。
 * <p>
 * 所有的IP地址划分为 A,B,C,D,E五类
 * A类地址1.0.0.0~126.255.255.255;
 * B类地址128.0.0.0~191.255.255.255;
 * C类地址192.0.0.0~223.255.255.255;
 * D类地址224.0.0.0~239.255.255.255；
 * E类地址240.0.0.0~255.255.255.255
 * <p>
 * 私网IP范围是：
 * 10.0.0.0～10.255.255.255
 * 172.16.0.0～172.31.255.255
 * 192.168.0.0～192.168.255.255
 * <p>
 * 子网掩码为前面是连续的1，然后全是0。（例如：255.255.255.32就是一个非法的掩码）
 * 本题暂时默认以0开头的IP地址是合法的，比如0.1.1.2，是合法地址
 * <p>
 * 输入描述:
 * 多行字符串。每行一个IP地址和掩码，用~隔开。
 * <p>
 * 输出描述:
 * 统计A、B、C、D、E、错误IP地址或错误掩码、私有IP的个数，之间以空格隔开。
 * 0  1 2  3 4         5               6
 * 示例1
 * 输入
 * <p>
 * 10.70.44.68~255.254.255.0
 * 1.0.0.1~255.0.0.0
 * 192.168.0.2~255.255.255.0
 * 19..0.~255.255.255.0
 * <p>
 * 输出
 * 1 0 1 0 0 2 1
 * <p>
 * Created by sharp on 2017年7月19日14:35:13
 */
// TODO: 2017/7/19 有点问题15:45:57
public class _18识别有效的ip地址和掩码并进行分类统计 {
    static int[] nums = {0, 0, 0, 0, 0, 0, 0}; //统计A, B, C, D, E, 错误IP地址或错误掩码, 私有IP地址的个数
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String str = null;
        
        //输入数据
        while ((str = scanner.nextLine()) != null && !"".equals(str)) {
            list.add(str);
        }
        
        for (String s : list) {
            classify(s);
        }
        
        //打印结果
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
    //对IP地址进行分类
    private static void classify(String s) {
        //合法性判断
        if (s == null || "".equals(s)) {
            return;
        }
        
        //字符串分割成IP地址和子网掩码
        String[] ss = s.split("~");
        if (ss.length != 2) {
            nums[5]++;
            return;
        }
        
        //对ip地址进行分割
        String[] ips = ss[0].split("\\.");
        if (ips.length != 4) {
            nums[5]++;
            return;
        }
        
        int[] ip = new int[4];
        for (int i = 0; i < ips.length; i++) {
            ip[i] = Integer.valueOf(ips[i]);
        }
        
        
        if (ip[0] == 10) {
            for (int i = 1; i < ip.length; i++) {
                if (ip[i] < 0 || ip[i] > 255) {
                    nums[5]++;
                    return;
                }
            }
            
            //判断子网掩码
            if (is子网掩码(ss[1])) {
                nums[6]++;
            } else {
                nums[5]++;
            }
        } else if (ip[0] == 172 && ip[1] >= 16 && ip[1] <= 31) {
            for (int i = 2; i < ip.length; i++) {
                if (ip[i] < 0 || ip[i] > 255) {
                    nums[5]++;
                    return;
                }
            }
            
            //判断子网掩码
            if (is子网掩码(ss[1])) {
                nums[6]++;
            } else {
                nums[5]++;
            }
        } else if (ip[0] == 192 && ip[1] == 168) {
            for (int i = 2; i < ip.length; i++) {
                if (ip[i] < 0 || ip[i] > 255) {
                    nums[5]++;
                    return;
                }
            }
            
            //判断子网掩码
            if (is子网掩码(ss[1])) {
                nums[6]++;
            } else {
                nums[5]++;
            }
        } else if (ip[0] >= 1 && ip[0] <= 126) {
            //A
            for(int i = 1; i < ip.length; i++) {
                if (ip[i] < 0 || ip[i] > 255) {
                    nums[5]++;
                    return;
                }
            }
            
            if (is子网掩码(ss[1])) {
                nums[0]++;
            } else {
                nums[5]++;
            }
        } else if (ip[0] >= 128 && ip[0] <= 191) {
            //B
            for(int i = 1; i < ip.length; i++) {
                if (ip[i] < 0 || ip[i] > 255) {
                    nums[5]++;
                    return;
                }
            }
            
            if (is子网掩码(ss[1])) {
                nums[1]++;
            } else {
                nums[5]++;
            }
        } else if (ip[0] >= 192 && ip[0] <= 223) {
            //C
            for(int i = 1; i < ip.length; i++) {
                if (ip[i] < 0 || ip[i] > 255) {
                    nums[5]++;
                    return;
                }
            }
            
            if (is子网掩码(ss[1])) {
                nums[2]++;
            } else {
                nums[5]++;
            }
        } else if (ip[0] >= 224 && ip[0] <= 239) {
            //D
            for(int i = 1; i < ip.length; i++) {
                if (ip[i] < 0 || ip[i] > 255) {
                    nums[5]++;
                    return;
                }
            }
            
            if (is子网掩码(ss[1])) {
                nums[3]++;
            } else {
                nums[5]++;
            }
        } else if (ip[0] >= 240 && ip[0] <= 255) {
            //E
            for(int i = 1; i < ip.length; i++) {
                if (ip[i] < 0 || ip[i] > 255) {
                    nums[5]++;
                    return;
                }
            }
            
            if (is子网掩码(ss[1])) {
                nums[4]++;
            } else {
                nums[5]++;
            }
        } else {
            nums[5]++;
        }
        
        
    }
    
    /**
     * 判断字符串是否是子网掩码
     *
     * @param s 字符串
     * @return true false
     */
    private static boolean is子网掩码(String s) {
        //合法性判断
        if (s == null || "".equals(s)) {
            return false;
        }
        
        String[] ss = s.split("\\.");
        if (ss.length != 4) {
            return false;
        }
        
        boolean is255 = true;
        for (int i = 0; i < ss.length; i++) {
            if (is255 && "255".equals(ss[i])) {
            
            } else if (is255 && "0".equals(ss[i])) {
                is255 = false;
            } else if (!is255 && "0".equals(ss[i])) {
            
            } else {
                return false;
            }
        }
        
        return true;
    }
    
}
