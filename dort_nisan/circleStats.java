package dort_nisan;
import java.util.Scanner;
import java.text.DecimalFormat;


public class circleStats {
    public static void main(String[] args) {
       // final double PI=3.14159;
        int radius=1;
        double area,circumference;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the circle radius : " + radius);
        radius=scan.nextInt();

        area=Math.PI*Math.pow(radius,2);
        circumference=2.0*Math.PI*radius;

        DecimalFormat fmt=new DecimalFormat("0.###");
        System.out.println("The radius is " + radius);

        System.out.println("The circle area is " + fmt.format(area));
        System.out.println("The circle circumference is " + fmt.format(circumference));

    }
}