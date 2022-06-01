package com.pekopeko.Tree.binarytree;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/3117:05
 * @Description <p>二叉（搜索）树测试类</p>
 */
public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree(9);
        binarySearchTree.insert(12);
        binarySearchTree.insert(7);
        binarySearchTree.insert(5);
        binarySearchTree.inorder();
        System.out.println("\n找到值7:");
        System.out.println(binarySearchTree.find(7));
    }
}
