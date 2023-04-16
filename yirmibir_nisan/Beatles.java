package yirmibir_mart;
import java.util.ArrayList;
public class Beatles {
    public static void main(String[] args) {
        ArrayList<String> band = new ArrayList<String>();

        band.add("John");
        band.add("Paul");
        band.add("George");
        band.add("Pete");

        //Tüm ArrayList in tamamını bastırır.
        System.out.println(band);

        //1.i ndexdekini remove eder, ve ekrana bastırır.
        int location=band.indexOf("Pete");
        band.remove(location);
        System.out.println(band);

        //1.indexi ekrana bastırır.
        System.out.println("At index 1: " + band.get(1));
        //2.indexe "Ringo" ekler.
        band.add(2, "Ringo");

        System.out.println("Size of the band: " + band.size());

        //tüm listeyi while ile gösterir.
        int index=0;
        while(index<band.size()){
            System.out.println(band.get(index));
            index++;
        }
        
    }
    
}