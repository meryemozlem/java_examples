package yirmisekiz_mart;
// Tek çift sayıları bulan program.
import javax.swing.JOptionPane; 
public class EvenOdd {
    public static void main(String[] args) {

        int num,again;
        String numStr,result;

        do {
            numStr=JOptionPane.showInputDialog("Enter a number : ");
            num=Integer.parseInt(numStr);

            result="That number is : " + ((num%2==0) ?  " even":" odd");

            /*if(num%2==0) {
                result="The number is even";
            }
            else {
                result="The number is odd";
            }*/
            
            JOptionPane.showMessageDialog(null, result);

            again=JOptionPane.showConfirmDialog(null, "Do you want to try again?");

        } while (again==JOptionPane.YES_OPTION);
    }
    
}