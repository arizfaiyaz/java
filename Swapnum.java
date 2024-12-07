public class Swapnum {
    public static void main(String[] args) {
        String x = "water";
        String y = "kool-aid";

    // Now to swap we need to a new variable.
    String temp;
    temp = x;
    x = y;
    y = temp;
    System.out.println(x);
    System.out.println(y);
    }
}
