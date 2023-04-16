package yirmibir_mart;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class deneme {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int i=1;
        List<Integer> list=new ArrayList<>();
        while(i<=num){
        int j=1;
            while(j<=i){
                if(i%j==0){
                    list.add(j);
                }
            j++;
        }
        System.out.println(i+" : "+list);
        list.clear();
        i++;
        }
        }
}


