import java.util.Scanner;

public class apcsaright {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double base = 0;
        double height = 0;
        double hypotenuse = 0;

        System.out.print("\nEnter base: ");
        base = in.nextDouble();
        System.out.print("\nEnter height: ");
        height = in.nextDouble();
        System.out.print("\nEnter hypotenuse: ");
        hypotenuse = in.nextDouble();

        if (Math.pow(base, 2) + Math.pow(height, 2) == Math.pow(hypotenuse, 2)) {
            System.out.println("\nYes, that's a right triangle!");
        } else {
            System.out.println("\nNope...not a right triangle.");
        }


        in.close();
    }

}
