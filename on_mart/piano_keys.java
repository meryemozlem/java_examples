package on_mart;

public class piano_keys {
    public static void main(String[] args) {
        int keys=88;
        System.out.println("Piano has "+keys+" keys.");
        int white=keys-12;
        System.out.println("Piano has "+white+" white keys.");
        int black=keys-white;
        System.out.println("Piano has " + black+" black keys.");

        keys=120;
        System.out.println("Piano has " + keys + " keys.");

        int i=100;
        System.out.println("Celcius temparature: " + ++i);
        System.out.println("Celcius temparature: " + i--);
        System.out.println("Celcius temparature: " + i);

        int j=3;
        System.out.println("result: " + ++j + " " + j++ + " " + ++j);

    }
    
}
