package Interface;

public class Square implements Power,Sum {
    @Override
    public int power(int x) {
        return x*x*x;
    }

    @Override
    public int sum(int x, int y) {
        return x+y;
    }
}

