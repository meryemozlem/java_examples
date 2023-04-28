package yirmisekiz_mart;

public class example2 {
    public static void  sum(int n){
        int result=0;
        int i=1;
        while (i<=n){
            result += i;
            i++;
        }
        //değer döndürmedi.
       System.out.println(result);
    
    }
    //program açılır açılmaz main hemen çalışır. main static olduğu için.
    public static void main(String[] args) {
        sum(5);
        System.out.println("Sum of numbers between 1 to 13 is : ");
    
        sum(13);
        sum(22);
    }
    
}
