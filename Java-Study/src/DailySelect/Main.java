package DailySelect;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        A a0 = new A();
        A a1 = new B();
        A a2 = new C();
    }
}

class A {
    public A() {
        System.out.println("A");
    }
}

class B extends A {
    public B(){
        System.out.println("B");
    }
}

class C extends B {
    public C(){
        System.out.println("C");
    }
}