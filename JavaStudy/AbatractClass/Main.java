package AbatractClass;

public class Main {
    public static void main(String[] args) {
        Shape shape=new Rect();
        shape.draw();
        Rect r=new Rect();
        r.draw();
        Shape shape1=new Square();
        shape1.draw();
    }
}
