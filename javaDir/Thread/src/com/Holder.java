package com;

public class Holder<T> {
    private T a;

//    public Holder(T a) {
//        this.a = a;
//    }

    public void set(T a) {
        this.a = a;
    }

    public T get(){
        return a;
    }

    public static void main(String[] args) {
        Holder<String> h3 = new Holder<>();
        h3.set("hello");
        String a = h3.get();
        
        Holder<Object> h4 = new Holder<>();
        h4.set(new Object());
    }
}
