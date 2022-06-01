package com.pekopeko.Tree.binarytree;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/3117:00
 * @Description <p>二叉（搜索）树的接口</p>
 */
public interface IBinarySearchTree {
    /**
     * 查找
     * @param o 待查找的数据
     */
    public Object find(int o);

    /**
     * 插入
     * @param o 插入的数据值
     */
    public void insert(int o);

    /**
     * 删除
     * @param o 删除的值
     */
    public boolean delete(Object o);

    /**
     * 求二叉树的深度
     */
    public int depth();

    /**
     * 判断是否为空树
     */
    public boolean isEmpty();

    /**
     * 获取元素结点的数量
     */
    public int size();

    /**
     * 清空树的所有元素
     */
    public void clear();

    /**
     * 前序遍历
     */
    public void preorder();

    /**
     * 中序遍历
     */
    public void inorder();

    /**
     * 后序遍历
     */
    public void postOrder();

    /**
     * 层序遍历
     */
    public void levelOrder();

    /**
     * 判断是否为完全二叉树
     */
    public boolean isComplete();

    /**
     * 判断是否为满二叉树
     */
    public boolean isFull();

    /**
     * 打印二叉树
     */
    public void display();
}
