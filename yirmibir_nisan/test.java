package yirmibir_mart;

public class test {
    //Verilen kısa örnekler.

    public static void main(String[] args) {
        int i=1;
        while(i<=5){
            int j=i;
            while(j<=5){
                System.out.print(i+j+" ");
                j++;
            }
            System.out.println();
            i++;
        }

        int max=1000,min=100;
        while(max>min){
            max-=min;
            System.out.println(max);
        }
        //üs aldı.
        int par1=1, par2=129;
        while(par2>par1){
            if(par1!=0){
                System.out.println(par1);
                par1*=2;}
        }

    }
}