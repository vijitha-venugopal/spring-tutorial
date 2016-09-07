package com;

public class A {

    private B b;
    A(){
    System.out.println("a is created");}

    public B getB() {
        return b;
    }
    public void setB(B b) {
        this.b = b;
    }
    private void print(){
        System.out.println("hello a");
    }
    void display(){
        print();
        b.print();
    }
}  