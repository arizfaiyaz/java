import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // This is just simple use of math functions
        // few ways to do, nothing much alright.

        // double x = 3.14;
        // double y = 10;

        // double z = Math.ceil(x);
        // double a = Math.floor(x);
        // double b = Math.ceil(x);
        // System.out.println(z);
        // System.out.println(a);
        // System.out.println(b);

        /* Now we are going to find out the Hypotenuse of a Triangle */
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x");
        x = scanner.nextDouble();
        System.out.println("Enter side y");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("the hypotenuse is: "+z);
        scanner.close();
    }
}
