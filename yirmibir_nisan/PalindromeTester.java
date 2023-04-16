package yirmibir_mart;
import java.util.Scanner;
//Kullanıcıdan bir kelime alın. Bu kelime palindrom mu değil mi kontrol edilecek. Palindrom ise ekrana palindrom yazılacak. Palindrom değilse ekrana palindrom değil yazılacak.
public class PalindromeTester {
    public static void main(String[] args) {
        String str,another="y"; // String obje ve class dan üretilir. Bu SAYEDE metotları kullanırım.
        int left,right; // int == index kullanacağım
        Scanner scan = new Scanner(System.in);
        //equals.IgnoreCase() metodu ile büyük küçük harf duyarlılığı kaldırıldı. Bu sayede kullanıcı y ifadeleri ile tekrar kelime girebilir.
        while (another.equalsIgnoreCase("y")) // allows y or Y
        {
            System.out.println( "Enter a potential palindrome : ");
            str = scan.nextLine();
            left=0; // 0. indexten başlayacak
            right=str.length()-1; // yine index ifadesi için l-1;

            //iç içe while. İlk while döngüsü sağlanırsa ikinci while döngüsüne girer. İkinci while döngüsü sağlanırsa ilk while döngüsüne girer.
            //l=10 için 0==9 l ve r değerleri.
            while(str.charAt(left) == str.charAt(right) && left < right)
            {
                left++;
                right--;
            }

            System.out.println();

            if(left < right)
                System.out.println("That string is NOT a palindrome.");
            else
                System.out.println("That string IS a palindrome.");

            System.out.println();
            System.out.print("Test another palindrome (y/n)? ");
            another=scan.nextLine();
        }
    }



    //2. yol
    /*
    import java.util.*;
    class Palindrome
    {
        public static void main(String args[])
        {
            String original, reverse = "";
            Scanner in = new Scanner(System.in);

            System.out.println("Enter a string to check if it is a palindrome");
            original = in.nextLine();

            int length = original.length();

            for (int i = length - 1; i >= 0; i--)
                reverse = reverse + original.charAt(i);

            if (original.equals(reverse))
                System.out.println("The string is a palindrome.");
            else
                System.out.println("The string isn't a palindrome.");

        }
    }*/
}