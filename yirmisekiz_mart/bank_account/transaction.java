package yirmisekiz_mart.bank_account;
//ana class.
//2 classlı ve farklı metodları olan örnek.
public class transaction {
    public static void main(String[] args) {

     Account ac1=new Account("Ted Murphy",72354,102.56);
     Account ac2=new Account("Jane Smith",69713,40.00);
     Account ac3=new Account("Edward Demsey",93757,759.32);

     ac1.deposit(25.85);

     double smithBalance=ac2.deposit(500.00);

     System.out.println("Smith balance after deposit : "+ smithBalance);
     System.out.println("Smith balance after withdrawal : "+ ac2.withdraw(430.75,1.50));

     ac1.addInterest();
     ac2.addInterest();
     ac3.addInterest();

    System.out.println();
    System.out.println(ac1);
    System.out.println(ac2);
    System.out.println(ac3);

    }
}

