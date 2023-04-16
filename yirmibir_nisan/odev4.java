package yirmibir_mart;
import java.util.Scanner;

public class odev4 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        Character myChar;
        switch (num){
        case 5:
        myChar='W';
        break;
        case 6:
        myChar='X';
        break;
        case 7:
        myChar='Y';
        break;
        default:
        myChar='Z';
    }
 System.out.println(myChar);
    
}
}


