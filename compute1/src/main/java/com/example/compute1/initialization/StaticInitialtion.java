package com.example.compute1.initialization;

/** 以Dog类为例
 * 1.定位Dog.class类路径
 * 2.载入Dog.class，执行有关静态初始化的所有动作，静态初始化只在class首次加载时初始化一次
 * 3.当用new Dog()创建对象时，先在堆上为其分配足够的存储空间
 * 4.上面那块存储空间会被清零，即会自动的将Dog对象中的所有的基本类型都置为默认类型，引用类型置为null
 * 5.执行所有出现于字段定义处的初始化
 * 6.执行构造器
 */
public class StaticInitialtion {
    public static void main(String[] agrs) {
        System.out.println("Createing new Cupboard() in main");
        new Cupboard();
        System.out.println("Createing new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);

    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
