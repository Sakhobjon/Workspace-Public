package SaxaThinkData;

import java.util.List;
import java.util.Collection;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


//saxa
//param<E>
public class MyLinkedList<E> implements List<E> {
    private class Node {
        public E data;
        public  Node next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
        public Node( E data,Node next){
            this.data =data;
            this.next =next;

        }
        public String toString(){
            return "Node("+data.toString()+")";


        }
    }
    private int size;
    private Node head;

    public MyLinkedList(){
        head= null;
        size = 0;

    }
    public static void main (String[] args){
        List<Integer> mll = new MyLinkedList<Integer>();
        mll.add(1);
        mll.add(2);
        mll.add(3);
        System.out.println(Arrays.toString(mll.toArray())+"size="+mll.size());

    }
    public boolean add (E element) {
        if (head == null) {
            head = new Node(element);
        } else {
            Node node = head;
            for (; node.next != null; node = node.next) {
            }
            node.next = new Node(element);

        }
        size++;
        return true;

    }
    public void add(int index, E element){
        //todo
    }
    public boolean addAll(Collection<?extends E> collection){
        boolean flag=false;
        for (E element: collection){
            flag &= add(element);

        }
        return flag;
    }

}
