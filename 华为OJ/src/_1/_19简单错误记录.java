package _1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 主题: 字符串
 * <p>
 * 题目描述
 * 开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
 * <p>
 * 处理：
 * 1、 记录最多8条错误记录，循环记录，对相同的错误记录（净文件名称和行号完全匹配）只记录一条，错误计数增加；
 * 2、 超过16个字符的文件名称，只记录文件的最后有效16个字符；
 * 3、 输入的文件可能带路径，记录文件名称不能带路径。
 * <p>
 * 输入描述:
 * 一行或多行字符串。每行包括带路径文件名称，行号，以空格隔开。
 * <p>
 * 输出描述:
 * 将所有的记录统计并将结果输出，格式：文件名 代码行数 数目，一个空格隔开，如：
 * <p>
 * 示例1
 * 输入
 * E:\V1R2\product\fpgadrive.c   1325
 * <p>
 * 输出
 * fpgadrive.c 1325 1
 * <p>
 * Created by sharp on 2017年7月19日15:50:33
 */
// TODO: 2017/7/19 运行超时
public class _19简单错误记录 {
    private static int num = 8; //最多8条记录
    private static int insertNum = 0; //需要插入的日志条数, 便于覆盖旧的日志
    private static int recordNum = 0; //日志中记录的总条数 <=num
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        ArrayList<String> list = new ArrayList<>();
        
        while ((str = scanner.nextLine()) != null && !"".equals(str)) {
            list.add(str);
        }
        
        String[][] records = record(list);
        
        //打印日志
        for(int i = 0; i < recordNum; i++) {
            System.out.println(records[i][0] + " " + records[i][1]);
        }
    }
    
    /**
     * 记录错误日志
     *
     * @param list 输入的字符串
     * @return 待输出的日志
     */
    private static String[][] record(ArrayList<String> list) {
        
        String[][] records = new String[num][2]; //记录日志的二维数组
        for (String s : list) {
            String[] ss = s.split(" ");
            
            String[] file = ss[0].split("\\\\");
            String fileName = file[file.length - 1];
            if (fileName.length() > 16) {
                //文件名超过16个字符
                String substring = fileName.substring(fileName.length() - 16, fileName.length());
                String name = substring + " " + ss[ss.length - 1];
        
                insertByName(records, name);
            } else {
                //文件名不超过16个字符
                String name = fileName + " " + ss[ss.length - 1];
        
                insertByName(records, name);
            }
        }
        
        return records;
    }
    
    /**
     * 根据name插入日志记录
     *
     * @param records 记录的二维数组
     * @param name 日志的名字
     */
    private static void insertByName(String[][] records, String name) {
        int index;
        
        if ((index = containsKey(records, name)) == -1) {
            //错误不存在
            if (recordNum < 8) {
                //记录小于8条直接添加
                records[recordNum] = new String[]{name, 1 + ""};//二维数组中插入一条数据
                
                recordNum++;
            } else {
                //记录超过8条, 日志前移, 覆盖第一条
                for(int i = 0; i < num - 1; i++) {
                    records[i] = records[i + 1];
                }
                
                records[num - 1] = new String[]{name, 1 + ""};
            }
            
            insertNum++; //插入记录+1
        } else {
            //错误已经存在
            int num = Integer.valueOf(records[index][1]) + 1; //数值+1
            records[index] = new String[]{records[index][0], num+""};
        }
    }
    
    /**
     * 判断二维数组的第一列是否包含name
     *
     * @param records 二维数组
     * @param name     关键字
     * @return -1时表示没有, 不为-1时表示二维数组的下表索引
     */
    private static int containsKey(String[][] records, String name) {
        //合法性判断
        if (records == null || name == null || "".equals(records) || "".equals(name)) {
            return -1;
        }
        
        for (int i = 0; i < records.length; i++) {
            if (records[i] != null) {
                if (name.equals(records[i])) {
                    return i;
                }
            }
        }
        
        return -1;
    }
    
}
