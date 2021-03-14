package Interface;

public class Main {
    public static void main(String[] args) {
        Cube cube=new Cube();
        Square square=new Square();
        System.out.println(cube.power(3));
        System.out.println(cube.sum(3,3));

        System.out.println(square.power(3));
        System.out.println(square.sum(3,3));
    }
}
