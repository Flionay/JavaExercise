package com.oop.Demo10;

public class application {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner();
        inner.getID();
    }
}
