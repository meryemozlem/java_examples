package dort_nisan;
import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        double a, b, c;
        double discriminant,root1,root2;

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the coefficient x squared: ");
        a =scan.nextInt();

        System.out.println("Enter the coefficient x: ");
        b =scan.nextInt();

        System.out.println("Enter the constant: ");
        c =scan.nextInt();

        discriminant = Math.pow(b,2) - (4*a*c);

        root1 = ((-b) + Math.sqrt(discriminant)) / (2*a);
        root2 = ((-b) - Math.sqrt(discriminant)) / (2*a);

        System.out.println("Root #1: " + root1);
        System.out.println("Root #2: " + root2);

    }
}
