package yirmisekiz_mart;

public class example3 {
    //formal değişkenler gönderiliyor.
    public static void change(int a, double b){
        System.out.println("a + b = "+(a+b));
        a=7;
        b=3.4;
        System.out.println(" a - b = "+(a-b));
    
    }
    //program açılır açılmaz main hemen çalışır. main static olduğu için.
    public static void main(String[] args) {
        //local değişkenler gönderiliyor.
        int x=3;
        double y=8.0;
        System.out.println(" x - y = "+(x-y));
        change(x,y);
        System.out.println(" x - y = "+(x-y));
    }
}
