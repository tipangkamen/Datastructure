package com.xiaozhu.algorithm;

import javax.swing.undo.CannotUndoException;
import java.util.LinkedList;

public class Linkedlist<T> {
    private Node<T> First;//头节点
    private Node<T> Last;//尾节点
    private static int Size=0;




    private static class Node<E> {
        private E item;//元素
        private Node<E> Next;//下一个节点
        private Node<E> Prev;//上一个节点

        public Node(E e,Node<E> next,Node<E> prev){
            this.item=e;
            this.Next=next;
            this.Prev=prev;
        }

    }


}
