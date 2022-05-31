package com.pekopeko.LinkList.singlelinkedlist;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/2710:14
 * @Description <p>接口</p>
 */
public interface ILinkedList {
    /**
     * 清空
     */
    public void clear();

    /**
     * 获取链表长度
     */
    public int length();

    /**
     * 判断是否为空
     */
    public boolean isEmpty();

    /**
     * 获取指定元素
     * @param i 第i个位置
     */
    public Object get(int i);

    /**
     * 头插法新增结点
     * @param o 数据
     */
    public void add(Object o);

    /**
     * 尾插法新增结点
     * @param o 数据
     */
    public void addTail(Object o);

    /**
     * 在index位置插入结点（中）
     * @param index 第i个位置
     * @param o 数据
     */
    public void insert(int index,Object o);

    /**
     * 删除index位置结点（中）
     * @param index 第i个位置
     */
    public void remove(int index);

    /**
     * 查找对应元素下标
     * @param o 数据
     */
    public int indexOf(Object o);

    /**
     * 输出所有元素
     */
    public void display();

}
