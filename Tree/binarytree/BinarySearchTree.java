package com.pekopeko.Tree.binarytree;

import java.util.Stack;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/3116:53
 * @Description <p>二叉（搜索）树</p>
 */
public class BinarySearchTree implements IBinarySearchTree {
    private TreeNode root;

    public BinarySearchTree(int o) {
        this.root = new TreeNode(o);
    }

    /**
     * 查找
     * @param o 待查找的数据
     */
    @Override
    public Object find(int o) {
        TreeNode p = root;
        while (p != null){
            if (p.data > o){
                p = p.leftChild;
            }else if (p.data < o){
                p = p.rightChild;
            }else {
                return p.data;
            }
        }
        return null;
    }

    /**
     * 插入
     * @param o 插入的数据值
     */
    @Override
    public void insert(int o) {
        TreeNode tree = null;
        if (root == null){
            tree = new TreeNode(o);
            return;
        }
        TreeNode p = root;
        // 与根结点的值比较,当p==null时找到了位置
        while (p != null) {
            if (o > p.data) {
                if (p.rightChild == null) {
                    p.rightChild = new TreeNode(o);
                    return;
                }
                p = p.rightChild;
            } else {
                if (p.leftChild == null) {
                    p.leftChild = new TreeNode(o);
                    return;
                }
                p = p.leftChild;
            }
        }
    }

    /**
     * 删除
     * @param o 删除的值
     */
    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public int depth() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public void preorder() {

    }

    @Override
    public void inorder() {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (node != null || !stack.isEmpty()) {

            while (node != null){
                stack.push(node);
                node = node.leftChild;
            }
            node = stack.pop();
            System.out.print(node.data + "  ");
            node = node.rightChild;
        }
    }

    @Override
    public void postOrder() {

    }

    @Override
    public void levelOrder() {

    }

    @Override
    public boolean isComplete() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void display() {

    }
}
