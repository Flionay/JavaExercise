package com.ay.linkedlist;

public class LinkedList<E> implements List<E>{
    private int size;
    private Node first; //只用在linkedlist 定义为内部类
    private int ELEMENT_NOT_FOUND=-1;

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void add(int index, E element) {

    }


    @Override
    public boolean contains(E element) {

        return indexOf(element)!=ELEMENT_NOT_FOUND;
    }


    @Override
    public void add(E element) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }


    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    private static class Node<E>{
        // 内部类可以省略public 或 private
        E element;
        Node<E> next;

        //构造方法
        public Node(E element,Node<E> next){
            this.element = element;
            this.next = next;
        }
    }
}
