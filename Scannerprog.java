import java.util.Scanner;

public class Scannerprog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name blud?");
        String name = scanner.nextLine();

        System.out.println("Hello "+name);
    }
}
