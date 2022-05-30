package com.pekopeko.LinkList.singlelinkedlist;

/**
 * @author lustras
 * @version 1.0
 * @File com.
 * @CreateDate 2022/5/2711:40
 * @Description <p></p>
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("尾插法：");
        list.addTail(0);
        list.addTail(1);
        list.addTail(2);
        list.addTail(3);
        list.addTail(4);
        list.display();
        list.remove(5);
        list.display();

        System.out.println("头插法：");
        list.add(5);
        list.display();

        System.out.println("从第" + 2  + "个位置插入数据；");
        list.insert(2,10);
        list.display();

        System.out.println("判空：");
        if(list.isEmpty())
            System.out.println("\t链表为空。\n");
        else
            System.out.println("\t链表不为空。\n");

        System.out.println("输出长度：");
        System.out.println("\nlength: " + list.length() + "\n");

        System.out.println("元素的位置：");
        System.out.println("\t" + list.indexOf(3));

        System.out.println("===========================");
        System.out.println(list.get(0));
    }
}
