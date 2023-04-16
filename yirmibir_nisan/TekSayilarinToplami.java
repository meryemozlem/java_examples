package yirmibir_mart;
import java.util.Scanner;

//- sayı girilene kadar  tek sayıların toplamını bulan kod.

public class TekSayilarinToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;
        do {
            System.out.print("Bir sayı girin: ");
            number = scanner.nextInt();
            if (number >= 0 && number % 2 != 0) {
                sum += number;
            }
        } while (number >= 0);
        System.out.println("Girilen tek sayıların toplamı: " + sum);
    }
}

