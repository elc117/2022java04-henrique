package publ;

public class Vehicle {

    private int window;
    private int wheel;

    public Vehicle() {
        window = 0;
        wheel = 0;
    }

    public void quant(int x, int y) {
        window = x;
        wheel = y;
    }

    public int getWindow() {
        return window;
    }

    public int getWheel() {
        return wheel;
    }

}
