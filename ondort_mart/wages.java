package ondort_mart;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class wages {
    public static void main(String[] args) {
        final double rate=8.25; // saatlik ücret
        final int standard=40; //haftalık saat

        Scanner scan=new Scanner(System.in);
        double pay=0.0;
        System.out.print("Enter the number of hours worked: ");
        int hours=scan.nextInt();
        System.out.println();

        if(hours>standard){
            pay=standard*rate+(hours-standard)*(rate*1.5);
        }
        else{
            pay=hours*rate;
        }

        NumberFormat fmt=NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Your weekly pay is: "+fmt.format(pay));

    }
    
}