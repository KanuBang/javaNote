package extend.super3;

import extend.super3.ClassA;

public class ClassB extends ClassA {
    public ClassB(int a) {
        this(a,100);
        a+=1;
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a = "+a + " b = " + b);
    }
}
