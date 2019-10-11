package com.leetcode;

/**
 * @program: mysql1
 * @description: 关于合并两个有序链表的说法
 * @author: Mr.Jiang
 * @create: 2019-10-11 21:07
 **/
public class MergeTwoListsSolution {
    public static void main(String[] args) {
        ListNode s1 = new ListNode(1);
        ListNode s2 = new ListNode(2);
        ListNode s3 = new ListNode(5);
        ListNode s4 = new ListNode(6);
        ListNode s5 = new ListNode(3);
        ListNode s6 = new ListNode(4);
        ListNode s7 = new ListNode(7);
        ListNode s8 = new ListNode(9);
        List l3=new List();
        List l4=new List();
        l3.addListNode(s1);
        l3.addListNode(s2);
        l3.addListNode(s3);
        l3.addListNode(s4);
        l4.addListNode(s5);
        l4.addListNode(s6);
        l4.addListNode(s7);
        l4.addListNode(s8);
        MergeSolution ms=new MergeSolution();
        ms.mergeTwoLists(l3,l4).showListNode();
    }
}

class MergeSolution{
    public List mergeTwoLists(List l1, List l2) {
        ListNode prehead=new ListNode(-1);
        ListNode pre=prehead;
        while (l1!=null&&l2!=null){
            if (l1.head.next.val<l2.head.next.val){
                pre.next=l1.head.next;
                l1.head.next=l1.head.next.next;
            }else{
                pre.next=l2.head.next;
                l2.head.next=l2.head.next.next;
            }
            pre=pre.next;
        }
        return pre.next=l1.next==null? l2:l1;
    }
}

    