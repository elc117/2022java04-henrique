package publ;

public class Main {

    public static void main(String[] args) {
        Van v = new Van();
        v.quant(8, 4);
        System.out.println(v.getWindow());
        System.out.println(v.getSeat());
        System.out.println(v.getWheel());
    }

}
