package com.study.designmodel.iterator;

/**
 * @author yang
 */
public interface MyIterator<T> {

    void first();

    void last();

    T next();

    boolean hasNext();

}
