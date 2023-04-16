package yirmibir_mart;
public class quick {
    //ekrana kaç kez bastıracak. 10*19=190 içi ie while 10 tane 19. c2 biter c1++ tekrar c2 ye girer.
    public static void main(String[] args){

        int count1=1;
        //count1 10 kez döner
        while (count1 <= 10){
             //1 den 19 a kadar döner. 20 eşit değil.  count 2
            int count2 =1;
            while(count2<=20){
                System.out.println(count1 +"Here");
                count2++;
            } 
            count1++;
        }

        int a=0,b=10,mid;
        while(a<=b){
            mid=a;
            while(mid <= b){
                System.out.println(mid+ " ");
                mid++;
            }
        System.out.println();
        a++;
        }
    }
}


