package _5链表;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import 第2章链表问题.Node;
import 第2章链表问题.NodeUtils;

/**
 第2节 环形链表插值练习题
 有一个整数val，如何在节点值有序的环形链表中插入一个节点值为val的节点，并且保证这个环形单链表依然有序。

 给定链表的信息，及元素的值A及对应的nxt指向的元素编号同时给定val，请构造出这个环形链表，并插入该值。

 测试样例：
 [1,3,4,5,7],[1,2,3,4,0],2
 返回：{1,2,3,4,5,7}
 * Created by sharp on 7/11 0011 - 23:01
 */
public class _2环形链表插值 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String As = scanner.nextLine();
        String nxts = scanner.nextLine();
        int val = scanner.nextInt();

        String[] Ass = As.split(" ");
        String[] nxtss = nxts.split(" ");

        int[] A = new int[Ass.length];
        int[] nxt = new int[nxtss.length];

        for(int i = 0; i < A.length; i++) {
            A[i] = Integer.valueOf(Ass[i]);
        }

        for(int i = 0; i < nxt.length; i++) {
            nxt[i] = Integer.valueOf(nxtss[i]);
        }

        Node head = insert(A, nxt, val);

        //打印链表
        NodeUtils.printLink(head);
    }

    public static Node insert(int[] A, int[] nxt, int val) {

        //构建循环链表
        //创建节点, 保存在ArrayList中
        List<Node> list = new ArrayList<>();
        for(int i = 0; i < A.length; i++) {
            list.add(new Node(A[i]));
        }

        //建立循环链表间的依赖关系
        for(int i = 0; i < nxt.length; i++) {
            list.get(i).next = list.get(nxt[i]);
        }


        return list.get(0);
    }
}
