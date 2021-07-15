package com.ay.linkedlist;

public class LinkedList<E> implements List<E>{
    private int size;

    //只用在Linkedlist 定义为内部类
    private Node<E> first;

    private int ELEMENT_NOT_FOUND=-1;

    @Override
    public void clear() {
        first=null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    //
    @Override
    public void add(int index, E element) {
        Node<E> nodes = new Node<>(element);
        if(index == 0){
            first = new Node<>(element,first);
        }else{
//            nodes.next = node(index-1).next;
//            node(index-1).next = nodes;
             Node<E> prev = node(index-1);
             prev.next = new Node<>(element,prev.next);

        }
        size ++;
    }


    @Override
    public boolean contains(E element) {

        return indexOf(element)!=ELEMENT_NOT_FOUND;
    }


    @Override
    public void add(E element) {
        add(size,element);
    }

    @Override
    public E get(int index) {
        Node<E> nodes = first;
        for (int i = 0; i < index; i++) {
            nodes = nodes.next;
        }
        return nodes.element;
    }

    @Override
    public E remove(int index) {
        if(index==0){
            first = node(index+1);
        }else{
            node(index-1).next = node(index+1);
        }

        return null;
    }


    // 相当于改动嘛
    @Override
    public E set(int index, E element) {
        E old = node(index).element;
        node(index).element = element;

        return old;
    }

    // 获取指定元素的index
    @Override
    public int indexOf(E element) {
        Node<E> nodes = first;
        for (int i = 0; i < size; i++) {
            nodes = nodes.next;
            if(nodes.element==element){
                return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    public String toString(){
        Node<E> nodes = first;
        StringBuilder string = new StringBuilder();
        string.append("Size: ").append(size).append(" [");
        while(nodes.next!=null){
            string.append(nodes.element).append(",");
        }
        string.append("]");
        return string.toString();

    }

    // 定义一个函数返回对应index的node对象
    private Node<E> node(int index){
        Node<E> nodes = first;
        for (int i = 0; i < index; i++) {
            nodes = nodes.next;
        }
        return nodes;
    }

    // 注意返回对象 跟返回对象元素
    private static class Node<E>{
        // 内部类可以省略public 或 private
        E element;
        Node<E> next;

        //构造方法
        public Node(E element){
            this.element = element;
        }

        public Node(E element,Node<E> next){
            this.element = element;
            this.next = next;
        }
    }
}
