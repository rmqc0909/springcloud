package com.example.compute1.initialization;

public class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static  Bowl bowl4 = new Bowl(4);

    public Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int maker) {
        System.out.println("f3(" + maker + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}
