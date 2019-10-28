package com.leetcode;

import java.nio.file.NotDirectoryException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @program: DataSructure and Algorithm
 * @description: 层序遍历二叉树
 * @author: CoderPengJiang
 * @create: 2019-10-27 21:46
 **/
public class SeqTraBinaryTree {
    public static void main(String[] args) {
        //定义一颗完全二叉树
        TreeNode[] node = new TreeNode[10];
        for (int i = 0; i < 10; i++) {
            node[i] = new TreeNode(i);
        }
        for (int i = 0; i < 10; i++) {
            if (2 * i + 1 < 10) {
                node[i].left = node[2 * i + 1];
            }
            if (2 * i + 2 < 10) {
                node[i].right = node[2 * i + 2];
            }
        }
        System.out.println("---层序遍历---");
        seqTraBinaryTreeSolu(node[0]);
        System.out.println("---前序遍历---");
        FrontTravelTree(node[0]);
        System.out.println("---非递归前序遍历二叉树---");
        FrontTraTreeUnRecur(node[0]);
        System.out.println("---中序遍历---");
        MidTravelTree(node[0]);
        System.out.println("---后续遍历---");
        PostTravelTree(node[0]);
    }

    /**
     * @Description:层次遍历二叉树
     * @Param: [root]
     * @return: void
     * @Author: Mr.Jiang
     * @Date: 2019/10/28
     */
    public static void seqTraBinaryTreeSolu(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int numQue = queue.size();
            for (int i = 0; i < numQue; i++) {
                TreeNode currentNode = queue.poll();
                System.out.println(currentNode.val + ",");
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
    }

    /**
     * @Description: 利用递归方法前序遍历二叉树
     * @Param: [root]
     * @return: void
     * @Author: Mr.Jiang
     * @Date: 2019/10/28
     */
    public static void FrontTravelTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        FrontTravelTree(root.left);
        FrontTravelTree(root.right);
    }

    /**
     * @Description: 利用递归方法中序遍历二叉树
     * @Param: [root]
     * @return: void
     * @Author: Mr.Jiang
     * @Date: 2019/10/28
     */
    public static void MidTravelTree(TreeNode root) {
        if (root == null) {
            return;
        }
        MidTravelTree(root.left);
        System.out.println(root.val);
        MidTravelTree(root.right);
    }
    /**
    * @Description: 利用递归方法后续遍历二叉树
    * @Param: [root]
    * @return: void
    * @Author: Mr.Jiang
    * @Date: 2019/10/28
    */
    public static void PostTravelTree(TreeNode root) {
        if (root == null) {
            return;
        }
        PostTravelTree(root.left);
        PostTravelTree(root.right);
        System.out.println(root.val);
    }
    /**
    * @Description: 利用非递归的方法进行前序遍历二叉树
    * @Param: [root]
    * @return: void
    * @Author: Mr.Jiang
    * @Date: 2019/10/28
    */
    public static void FrontTraTreeUnRecur(TreeNode root){
        if (root==null){
            return;
        }else {
            Stack<TreeNode> stack=new Stack<TreeNode>();
            stack.add(root);
            while (!stack.isEmpty()){
                root =stack.pop();
                System.out.print(root.val+",");
                if (root.right!=null){
                    stack.push(root.right);
                }
                if (root.left!=null){
                    stack.push(root.left);
                }

            }
        }
        System.out.println();
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }


    @Override
    public String toString() {
        return "TreeNode{" + "val=" + val + '}';
    }
}