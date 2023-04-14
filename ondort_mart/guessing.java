package ondort_mart;

import java.util.Scanner;
import java.util.Random;

public class guessing {
    public static void main(String[] args) {
        final int max=10;
        int answer,guess;
        Scanner scan=new Scanner(System.in);
        Random generator=new Random();

        answer=generator.nextInt(max)+1;
        System.out.println("I'm thinking of a number between 1 and "+max+". guess what it is ...");
        guess=scan.nextInt();
        if(guess==answer)//tek satırda yok. çiftli satırda {} kullanılmalıdır.
            System.out.println("You got it!");
        else
            System.out.println("Sorry, the number was "+answer);
        }
    }