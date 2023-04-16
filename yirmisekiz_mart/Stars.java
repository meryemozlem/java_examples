package yirmisekiz_mart;
//2 for döngüsü ile yıldızlar oluşturuldu. 1. for döngüsü satır sayısını belirler. 2. for döngüsü ise yıldız sayısını belirler. saırır,sütun.

public class Stars {
    public static void main(String[] args) {

        final int MAX_ROWS=10;

        for (int row=1; row <= MAX_ROWS; row++) {
            for (int star=1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}