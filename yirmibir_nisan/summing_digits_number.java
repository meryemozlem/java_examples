//1 sayının rakamları toplamını bulan algoritma. 123= 1+2+3=6
package yirmibir_mart;
import java.util.Scanner;

public class summing_digits_number {
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number : " + "(negative number to quit): ");
        int number = scan.nextInt();

        while (number > 0) {
            System.out.print("Sum of digits of a number " + number + " is: ");
            int total = 0;
            while(number>0){
                total += number % 10;
                number/=10;
            }

        System.out.println(total);
        System.out.print("Enter a positive number : " + "(negative number to quit): ");
        number = scan.nextInt();
        }
        
    }
    
}


