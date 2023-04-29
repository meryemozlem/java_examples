package onbir_nisan;
import java.util.Scanner;
public class reverseOrder {
    //cümle içindeki kelimeleri ters çevirme sorulsaydı 1 for döngüsü kullanırdık.
    //biz burada dizideki sayıları ters çeviriyoruz. 2 for döngüsü kullandık.
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        double[] numbers=new double[10];
      
        System.out.println("The size of the array: " + numbers.length);

        for(int index=0; index<numbers.length; index++){
            System.out.print("Enter number " + (index+1) + ": ");
            numbers[index]=scan.nextDouble();
        }

        System.out.println("The numbers in reverse order: ");

        for(int index=numbers.length-1; index>=0; index--)
            System.out.print(numbers[index] + " ");
        scan.close();
    }   
}

