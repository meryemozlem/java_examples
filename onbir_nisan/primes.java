package onbir_nisan;

public class primes {
    public static void main(String[] args) {
        int [] primeNums={2,3,5,7,11,13,17,19};

        System.out.println("Array length: " + primeNums.length);

        System.out.println("The first few prime numbers are:");

        for(int prime: primeNums)
            System.out.print(prime +  " ") ;
}
}
