package Example;

public class Demo {
    public static void main(String args[]) {
        int num = 10;
        System.out.println(test(num));
        boolean c=true?false:true==true?false:true;
        boolean b = false && (true == true ? false : true);
        System.out.println(b);
    }

    public static int test(int b) {
        try {
            b += 10;
            return b;
        } catch (RuntimeException e) {
        } catch (Exception e2) {
        } finally {
            b += 10;
            return b;
        }
    }
}
