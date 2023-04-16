package yirmibir_mart;
import java.util.Scanner;
public class odev2{
    //Write a program to print the powers of 3 from 1 to k. (k value is user input)
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value of k: ");
    int k = scanner.nextInt();
 
    for (int i = 0; i <= k; i++) {
    int powerOfThree = (int) Math.pow(3, i);
    System.out.println(powerOfThree);
    }
 }
}
    