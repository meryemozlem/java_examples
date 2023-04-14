package ondort_mart;

public class CoinFlip {
    public static void main(String[] args) {
        Coin myCoin=new Coin();
        myCoin.flip();
        System.out.println(myCoin);

        if(myCoin.isHeads()) {
            System.out.println("You win");
        }
        else {
            System.out.println("Better luck. Try again");
        }


    }
}

