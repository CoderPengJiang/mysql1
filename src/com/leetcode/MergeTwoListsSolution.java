package com.leetcode;

import javax.xml.soap.Node;

/**
 * @program: mysql1
 * @description: 关于合并两个有序链表的说法
 * @author: Mr.Jiang
 * @create: 2019-10-11 21:07
 **/
public class MergeTwoListsSolution {
    public static void main(String[] args) {
        NodeL node = new NodeL(1);
        NodeL node1 = new NodeL(2);
        NodeL node2 = new NodeL(3);
        NodeL node3 = new NodeL(4);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        NodeL node_ = new NodeL(5);
        NodeL node_1 = new NodeL(6);
        NodeL node_2 = new NodeL(7);
        NodeL node_3 = new NodeL(9);
        node_.next = node_1;
        node_1.next = node_2;
        node_2.next = node_3;
        MergeSolution ms = new MergeSolution();
        ms.addValueLast(node, 13);
        ms.showMergeTwoList(node);
        System.out.println();
        ms.showMergeTwoList(node_);
        System.out.println();
        NodeL nl = ms.mergeTwoLists(node, node_);
        ms.showMergeTwoList(nl);
    }
}

class MergeSolution {
    /**
     * @Description: 使用迭代法进行连个有序链表的连接操作
     * @Param: [l1, l2]
     * @return: com.leetcode.NodeL
     * @Author: Mr.Jiang
     * @Date: 2019/10/11
     */
    public NodeL mergeTwoLists(NodeL l1, NodeL l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    /**
     * @Description: 打印输出链表的值
     * @Param: [head]
     * @return: void
     * @Author: Mr.Jiang
     * @Date: 2019/10/11
     */
    public void showMergeTwoList(NodeL head) {
        if (head == null) {
            System.out.println("链表为空");
        }
        NodeL temp = head;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.print(temp.val + ",");
            temp = temp.next;
        }
    }

    /**
     * @Description: 在链表的最后插入一个值
     * @Param: [l, value]
     * @return: com.leetcode.NodeL
     * @Author: Mr.Jiang
     * @Date: 2019/10/11
     */
    public void addValueLast(NodeL l, int value) {
        NodeL addnode=new NodeL(value);
        NodeL temp=l;
        while (temp.next != null) {

           temp = temp.next;

        }

        temp.next =addnode;
    }
}

class NodeL {
    public int val;
    NodeL next;

    public NodeL(int val) {
        this.val = val;
    }
}



    