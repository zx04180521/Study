package Example;

public class TestClass {
    private static void testMethod(){
        System.out.println("testMethod");
    }
    public void a(){

    }
    public static void main(String[] args) {
        TestClass t=null;
        t.testMethod();
        ((TestClass)null).testMethod();
    }
}
