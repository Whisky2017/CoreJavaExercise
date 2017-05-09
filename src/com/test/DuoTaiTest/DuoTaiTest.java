package com.test.DuoTaiTest;

/**
 * Created by shikang on 2017/4/8.
 */
public class DuoTaiTest {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        /**
         * 触发多态的条件：
         * 1、继承
         * 2、重写
         * 3、向上转型（子类的实例变量赋给父类的引用变量）
         */
        System.out.println(a1.show(b));   //output:A.show(A obj); return:A and A
        System.out.println(a1.show(c));   //output:A.show(A obj); return:A and A
        System.out.println(a1.show(d));   //output:A.show(D obj); return:A and D
        System.out.println(a2.show(b));   //发生多态output:A.show(A obj); 发现B中重写该方法，则执行B.show(B obj); return B and A
        System.out.println(a2.show(c));   //发生多态output:A.show(A obj); 发现B中重写该方法，则执行B.show(B obj); return B and A
        System.out.println(a2.show(d));   //发生多态output:A.show(D obj); return A and D
        System.out.println(b.show(b));    //output:B.show(B obj); return B and B
        System.out.println(b.show(c));    //发生多态output:在B中未找到C的方法，则在父类中查找，父类中也未找到，则再在子类中查找C的父类，执行B.show(B obj); return:B and B
        System.out.println(b.show(d));    //发生多态，同上，但是在父类中找到对应方法，output:A.show(D obj); return:A and D

        /**
         * 多态发生时执行顺序：
         * 1、this.show(O);
         * 2、super.show(O);
         * 3、this.show((super)O);
         * 4、super.show((super)O);
         */
    }
}

class A{
    public String show(D obj){
        return "A and D";
    }
    public String show(A obj){
        return "A and A";
    }
}
class B extends A{
    public String show(B obj){
        return "B and B";
    }
    public String show(A obj){
        return "B and A";
    }
}
class C extends B{

}
class D extends B{

}
