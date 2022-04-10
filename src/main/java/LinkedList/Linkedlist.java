package LinkedList;

import com.sun.xml.internal.ws.policy.spi.PolicyAssertionValidator;

import javax.swing.undo.CannotUndoException;
import java.util.LinkedList;

public class Linkedlist<T> {
    private Node<T> First;//头节点
    private Node<T> Last;//尾节点
    private static int Size=0;
    
    public Linkedlist(){

    }
    public Linkedlist(T t){
         if(First==null){
             Node<T> node = new Node(t);
         }
    }

   


    private static class Node<E> {
        private E item;//元素
        private Node<E> Next;//下一个节点
        private Node<E> Prev;//上一个节点

        public Node(E e,Node<E> next,Node<E> prev){
            this.item=e;
            this.Next=next;
            this.Prev=prev;
        }

        public Node(E e){
            this.item=e;
        }
    }


}
