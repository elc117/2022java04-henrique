package animal;

public class Main {

    public static void main(String[] args) {
        Spider s = new Spider();
        s.setPaw(8);
	s.setchelicerae(4);
        System.out.println(s.getPaw());
        System.out.println(s.getchelicerae());
    }
}
