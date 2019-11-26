package com.company;

import java.util.Iterator;

public interface OrderedIterator<T> extends Iterator<T> {
    int put(T comparable);
}
