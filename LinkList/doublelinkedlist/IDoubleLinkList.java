package com.pekopeko.LinkList.doublelinkedlist;

/**
 * @author lustras
 * @version 1.0
 * @CreateDate 2022/5/3014:38
 * @Description <p>双向循环链表</p>
 */
public interface IDoubleLinkList {
    /**
     * 清空
     */
    public void clear();

    /**
     * 判空
     */
    public boolean isEmpty();

    /**
     * 在index位置插入结点
     */
    public void insert(int index, Object o);

    /**
     * 头插
     */
    public void addHead(Object o);

    /**
     * 尾插
     */
    public void addTail(Object o);

    /**
     * 头删
     */
    public void removeHead();

    /**
     * 尾删
     */
    public void removeTail();

    /**
     * 插入结点
     * @param index 索引下标
     */
    public void remove(int index);

    /**
     * 获取第index个位置的值
     * @param index 索引下标
     */
    public Object get(int index);

    /**
     * 打印链表
     */
    public void display();

    /**
     * 获取双向链表的长度
     */
    public int length();
}
