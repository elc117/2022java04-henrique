package publ;

public class Van extends Vehicle {

    private int seat;

    public Van() {
        seat = 12;
    }

    public void setSeat(int s) {
        seat = s;
    }

    public int getSeat() {
        return seat;
    }

}
