package dort_nisan;

public class comparing {
    //Sözlükteki sıralamaya göre karşılaştırma yapar.
    public static void main(String[] args) {
        String name1="Ahmet";
        String name2="Tuğse";
        int result=name1.compareTo(name2);

        if(result < 0){
            System.out.println(name1 + "comes before" + name2);
        }
        else{
            if(result == 0){
                System.out.println("names are the same");
            }
            else{
                System.out.println(name1 + "comes after" + name2);
            }
        }
    }
}
