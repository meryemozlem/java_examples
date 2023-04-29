package dort_nisan;
//hatali.
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.InputMismatchException;

public class purchase {
    public static void main(String[] args) {

        final double TAX_RATE=0.06;
        int quantity=5;
        
        Scanner scan=new Scanner(System.in);

        NumberFormat fmt1=NumberFormat.getCurrencyInstance();
        NumberFormat fmt2=NumberFormat.getPercentInstance();

        System.out.println("Enter the quantity: ");
        quantity=scan.nextInt();

        System.out.println("Enter the unit prize: ");
        double unitPrice=scan.nextDouble();

        double subtotal=quantity*unitPrice;
        double tax=subtotal*TAX_RATE;
        double total=subtotal+tax;

        System.out.println("Subtotal: " + fmt1.format(subtotal));
        System.out.println("Tax: " + fmt1.format(tax) + " at " + fmt2.format(TAX_RATE));
        System.out.println("Total: " + fmt1.format(total));
    }
    
}
