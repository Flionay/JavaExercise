package com.ay;

public interface List<E> {
    void clear();
    int size();
    boolean isEmpty();
    void add(int index,E element);
    boolean contains(E element);
    void add(E element);
    E get(int index);
    E remove(int index);
    E set(int index,E element);
    int indexOf(E element);
}
