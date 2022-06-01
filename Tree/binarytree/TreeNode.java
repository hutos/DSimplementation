package com.pekopeko.Tree.binarytree;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/3116:55
 * @Description <p>树结点</p>
 */
public class TreeNode {
    // 数据域
    public int data;
    // 左子树
    public TreeNode leftChild;
    // 右子树
    public TreeNode rightChild;

    public TreeNode() {
    }

    public TreeNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data + " ";
    }
}
