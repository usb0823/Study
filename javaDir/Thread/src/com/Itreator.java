package com;

public interface Itreator<T> {
	 // 判断是否还有元素
    boolean hasNext();
    // 洗一个元素
    T next();
}
