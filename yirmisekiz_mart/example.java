package yirmisekiz_mart;

public class example {
public static int sum(int n){
    int result=0;
    int i=1;
    while (i<=n){
        result += i;
        i++;
    }
    return result;

}
//program açılır açılmaz main hemen çalışır. main static olduğu için.
public static void main(String[] args) {
    System.out.println("Sum of numbers between 1 to 5 is : "+sum(5));

    int x= sum(22);
    System.out.println(x);
}

}
