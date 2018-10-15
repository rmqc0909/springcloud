package com.example.compute1.initialization;

public class Table {
    static Bowl bowl1 = new Bowl(1);
    public Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }
    void f2(int maker) {
        System.out.println("f2(" + maker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}
