package Object_02;

public class Main {
    public static void main(String[] args) {
        Shape s1=new Circle();
        Shape s2=new Square();
        mapDraw(s1);
        mapDraw(s2);
        Shape[] s={new Circle(),new Square()};
        for(Shape shape:s){
            mapDraw(shape);
        }
    }
    public static void mapDraw(Shape shape){
        shape.draw();
    }

}
