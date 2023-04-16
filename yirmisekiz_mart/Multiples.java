package yirmisekiz_mart;
import java.util.Scanner;
//Girilen değerin katlarını yazdıran. 5 10 15 20 25 ... 100
public class Multiples {
    public static void main(String[] args) {
        final int per_line=5;
        int value,limit,mult,count=0;
        //input.

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a positive value : ");
        value=scan.nextInt();

        System.out.println("Enter an upper limit : ");
        limit=scan.nextInt();

        System.out.println();
        System.out.println("The multiples of " + value + " between " + value + "and " + limit+" (inclusive) are : ");

        for (mult=value; mult <= limit; mult+=value) {
            System.out.print(mult+"\t");
            count++;

            if(count % per_line ==0  )
                System.out.println();
        }
    }
}
