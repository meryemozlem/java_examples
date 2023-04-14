package ondort_mart;
import java.util.Scanner;
public class MinOfTree {
    public static void main(String[] args) {
        int num1,num2,num3,min=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter three integers: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        if(num1 < num2)
            if(num1<num3)
                min = num1;
            else
                min = num3;
        else if(num2  < num3)
            min = num2;
        else if(num3 < num1 && num3 < num2)
            min = num3;

        System.out.println("Minimum value is: " + min);
    }
    
}
