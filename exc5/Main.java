class A {

    public void m1() {

        System.out.print("hi");

    }

    public void m2() {

        System.out.print("/");

    }

}

class B extends A {

    public void m1() {

        System.out.print("i");

    }

    public void m2() {

        System.out.print(":");

    }

}

class C extends B {

    public void m1() {

        System.out.print("iih");

    }

    public void m2() {

        System.out.print("//:");

    }

}

class D extends A {

    public void m1() {

        System.out.print("ih");

    }

    public void m3() {

        System.out.print("/:");

    }

}

class E extends D {

    public void m1() {

        System.out.print("h");

    }

    public void m2() {

        System.out.print("/:/");

    }

}

public class Main{

    public static void main(String[] args) {

        A a = new A();

        B b = new B();

        C c = new C();

        D d = new D();

        E e = new E();

    // inja ro kamel yadam nemiad !
    // bejay x ha bayad (a,b,c,d,e) gharar bedam
        a.m1();

        a.m1();

        d.m1();

        a.m1();

        b.m1();

        System.out.println();

        e.m2();

        a.m2();

        c.m2();
`
        a.m2();

        b.m2();
    }

}