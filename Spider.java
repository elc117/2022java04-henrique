package animal;


public class Spider extends Animal {

    private int chelicerae;

    public Spider() {
        chelicerae = 2;
    }

    public void setchelicerae(int a) {
        chelicerae = a;
    }

    public int getchelicerae() {
        return chelicerae;
    }

}
