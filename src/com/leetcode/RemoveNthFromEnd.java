//防止外包调用，加了//
//package com.leetcode;
//
//import java.awt.*;
//
//public class RemoveNthFromEnd {
//    public static void main(String[] args) {
//        // ListNode ln = new ListNode(0);
//        // System.out.println(ln);
//        List ls = new List();
//        //定义6个链表结点
//        ListNode l1 = new ListNode(1);
//        ListNode l2 = new ListNode(2);
//        ListNode l3 = new ListNode(5);
//        ListNode l4 = new ListNode(7);
//        ListNode l5 = new ListNode(8);
//        ListNode l6 = new ListNode(9);
//        //在ls中添加结点
//        ls.addListNode(l1);
//        ls.addListNode(l2);
//        ls.addListNode(l3);
//        ls.addListNode(l4);
//        ls.addListNode(l5);
//        ls.addListNode(l6);
//       // 打印显示结点
//        ls.showListNode();
//        System.out.println();
//        //测试打印删除链表的倒数第n个结点，并且输出
//        ls.removeNthFromEnd(6);
//        ls.showListNode();
//    }
//}
//
////定义链表类，进行基本的链表操作
//class List {
//    //定义链表的头结点
//    ListNode head = new ListNode(0);
//
//    //返回头结点
//    public ListNode getHead() {
//        return head;
//    }
//
//    //给链表添加结点
//    public void addListNode(ListNode node) {
//        ListNode temp = head;
//        //利用循环使得temp指向最后一个结点
//        while (true) {
//            //如果头结点的指向为空，则退出循环
//            if (temp.next == null) {
//                break;
//            }
//            temp = temp.next;
//        }
//        temp.next = node;
//    }
//
//    public void showListNode() {
//        ListNode temp = head;
//        if (temp.next == null) {
//            System.out.println("链表为空");
//        }
//        while (temp.next != null) {
//            temp = temp.next;
//            System.out.print(temp.val);
//        }
//    }
//
//    /**
//     * @Description: 利用双指针删除链表的第n个结点
//     * @Param: [head, n]
//     * @return: com.leetcode.ListNode
//     * @Author: Mr.Jiang
//     * @Date: 2019/10/9
//     */
//    public void removeNthFromEnd(int n) {
//        ListNode front = head;
//        ListNode after = head;
//        for (int i = 0; i < n - 1; i++) {
//            after = after.next;
//        }
//        if (head.next == null) {
//            System.out.print("此链表为空链表");
//        }
//        after = after.next;
//        while (after.next != null) {
//            after = after.next;
//            front = front.next;
//        }
//        front.next = front.next.next;
//    }
//}
//
//class ListNode {
//    public int val;
//    ListNode next;
//
//    //构造器
//    public ListNode(int val) {
//        this.val = val;
//    }
//
//    @Override
//    public String toString() {
//        return "ListNode(" + val + ")";
//    }
//}
//