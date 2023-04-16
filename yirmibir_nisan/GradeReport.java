
package yirmibir_mart;
import java.util.Scanner;
//10 luk sisteme göre notu 10 a bölüp kalanına göre değeri switch case değeri yazdıran program.
public class GradeReport {
    public static void main(String[] args) {
        int grade,category;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a numeric grade: (0-100) ");
        grade=scan.nextInt();

        category=grade/10;
        System.out.print("That grade is: ");

        switch(category){
            case 10:
                System.out.println("a perfecto score. well done !");
                break;
            case 9:
                System.out.println("well above average, excellent !");
                break;
            case 8:
                System.out.println("above average, nice work !");
                break;
            case 7:
                System.out.println("average!");
                break;
            case 6:
                System.out.println("below average, you should see the !");
                break;
            default:
                System.out.println("not passing");
        }

        /*
        int total=10;
        int max=8;
        (total>max)?total+1:total*2;

        System.out.println("Smaller: " +((num1<num2)?num1:num2));
        */
    }
}
