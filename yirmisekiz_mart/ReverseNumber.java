package yirmisekiz_mart;
import java.util.Scanner;
//AI ile bak.
public class ReverseNumber {
    public static void main(String[] args) {
        int number,lastDigit,reverse=0;

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a positive integer number : ");
        number=scan.nextInt();

        do {
            lastDigit=number%10;
            reverse=(reverse*10)+lastDigit;
            number/=10;
        } while (number>0);

        System.out.println("The number reversed is "+reverse);
    }
    
}