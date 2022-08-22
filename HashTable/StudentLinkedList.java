package com.pekopeko.HashTable;

/**
 * @author lustras
 * @version 1.0
 * @File com.
 * @CreateDate 2022/8/2214:11
 * @Description <p></p>
 */
public class StudentLinkedList {
    public StudentNode head;

    // 尾插法
    public void add(StudentNode node){
        if (head == null){
            head = node;
            return;
        }
        StudentNode p = head;
        while(p.next != null){
            p = p.next;
        }
        p.next = node;
    }

    public boolean findStuByNo(int no) throws Exception {
        if (head == null){
            throw new Exception("空链表");
        }
        StudentNode p = head;
        while(p != null && p.stuNo != no){
            p = p.next;
        }
        return p!=null;
    }

    public boolean del(StudentNode node) throws Exception {
        if (head == null){
            throw new Exception("没有这个学生");
        }
        StudentNode p = head;
        // 有且只有一个学生，把头结点置空
        if (p.next == null){
            if (p.stuNo == node.stuNo && p.stuName.equals(node.stuName)){
                head = null;
                return true;
            }
        }

        // 有不止一个学生
        while (p.next != null){
            // 找到对应学号名字的学生，是第一个删除的情况
            if (p.stuNo == node.stuNo && p.stuName.equals(node.stuName) && (head == p)){
                p = p.next;
                head = p;
                return true;
            }else if ((p.next.stuNo == node.stuNo) && (p.next.stuName.equals(node.stuName))){
                p = p.next.next;
                return true;
            }else {
                // 没找到，继续向下遍历链表
                p = p.next;
            }
        }

        return false;
    }

    // 从链表中间插入
    public void insert(int no,StudentNode node){

    }
}
