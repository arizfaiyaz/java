import java.util.Scanner;

public class Scannerprog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name blud?");
        String name = scanner.nextLine();

        System.out.println("How old are you bro? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
    /* when we use nextLine() method to read anything
    it adds a \n line at the end of the input
    and after using it if we use nextInt() 
    then it adds \n\n which is bad so
    we have to add scanner.nextLine() method after the 
    int scanner to fix this.
     */

        System.out.println("What is your fav food blud?");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old bro?" );
        System.out.println("You like "+food);
        scanner.close();
    }
}
