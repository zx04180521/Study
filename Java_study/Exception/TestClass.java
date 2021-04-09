package Exception;

public class TestClass {
    public static void main(String[] args) {
        ((TestClass) null).testMethod();
//        getCustomerInfo();
    }
    private static void testMethod() {
        System.out.println("testMethod");
    }


//    public static void getCustomerInfo() {
//
//        try {
//
//            // do something that may cause an Exception
//
//        } catch (java.io.FileNotFoundException ex) {
//
//            System.out.print("FileNotFoundException!");
//
//        } catch (java.io.IOException ex) {
//
//            System.out.print("IOException!");
//
//        } catch (java.lang.Exception ex) {
//
//            System.out.print("Exception!");
//
//        }
//
//    }
}
