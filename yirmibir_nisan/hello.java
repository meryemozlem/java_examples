package yirmibir_nisan;
import java.text.NumberFormat;
import java.util.Scanner;
//WinPercentage
//giriş kontrolü döngüyle yapılacak. oyun sayısı sabit 12 oyun kazanma sayısı kullanıcıdan alınacak. double ile de kazanma olasılığı hesaplanacak.
public class hello {
    public static void main(String[] args) {
        final int num_games=12;
        int won;
        double ratio;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of games won (0 to " + num_games + "):");
        won=scan.nextInt();

        while(won< 0 || won>num_games){
            System.out.print("Invalid input. Please reenter a number");
            won=scan.nextInt();
        }

        ratio=(double) won/num_games;
        NumberFormat fmt = NumberFormat.getPercentInstance();
        System.out.println();
        System.out.println("Winning percentage: " + fmt.format(ratio));
    }
}

