package yirmisekiz_mart;

public class ciktilar {
    public static void main(String[] args) {

        //1. --> 100
        int value=0;
        for(int num=10;num<=40;num+=10) {
            value+=num;
        }
        System.out.println(value);

        //2. -->60
        int value1=0;
        for(int num=10;num<40;num+=10) {
            value1+=num;
        }
        System.out.println(value1);

        //3.
        // üretilecek yıldız satırlarının sayısı
        int value2=5;
        // her satırda üretilen yıldız sayısı
        for(int num=1;num<=value2;num++) {
            for(int i=1;i<=(value-num);i++){
                System.out.print(" ");
            }
            for(int i=1;i<=((2*num)-1);i++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}

