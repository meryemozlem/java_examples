package ondort_mart;
import java.util.Scanner;
public class age {
    public static void main(String [] args){
        final int minor=20;
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age=scan.nextInt();
        System.out.println("Your entered is: "+age);

        if(age < minor)
            System.out.println("You are youth");

            //her halükarda yazar.
        System.out.println("Age is a state of mind");

    }
    
}