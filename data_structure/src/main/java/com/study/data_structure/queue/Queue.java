package com.study.data_structure.queue;

public interface Queue<E> {

    boolean isEmpty();

    int getSize();

    void enqueue(E e);

    E dequeue();

    E getFirst();

}
