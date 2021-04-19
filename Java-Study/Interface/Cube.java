package Interface;

public class Cube implements Power,Sum {
    @Override
    public int power(int x) {
        //立方
        return x*x*x;
    }

    @Override
    public int sum(int x, int y) {
        return x+y;
    }
}
