package dort_nisan.c_example;

public class RollingDice {
    public static void main(String[] args) {

        Die die1, die2;
        int sum;

        die1=new Die();
        die2=new Die();

        die1.roll();
        die2.roll();
        System.out.println("Die 1: " + die1 + ", Die 2: " + die2);

        die1.roll();
        die2.setFaceValue(4);
        System.out.println("Die 1: " + die1 + ", Die 2: " + die2);

        sum=die1.getFaceValue()+die2.getFaceValue();
        System.out.println("Sum: " + sum);

        sum=die1.roll()+die2.roll();
        System.out.println("Die 1: " + die1 + ", Die 2: " + die2);

        System.out.println("New sum: " + sum);
    }
}
