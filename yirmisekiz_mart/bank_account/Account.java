package yirmisekiz_mart.bank_account;
import java.text.NumberFormat;

public class Account {

    private final double RATE=0.035;
    //bunlar sadece account a özel. transaction da kullanılmaz. oop deki capsulation.

    private long acctNumber;
    private double balance;
    private String name;

    //constructor.
    public Account(String owner,long account,double initial){
        name=owner;
        acctNumber=account;
        balance=initial;
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount,double fee){
        balance = balance - amount - fee;
        return balance;
    }

    public double addInterest(){
        balance += (balance * RATE);
        return balance;
    }

    public double getBalance(){
        return balance;
    }

    //
    public String toString(){
        NumberFormat ft=NumberFormat.getCurrencyInstance();
        return ( acctNumber + "\t" + name + "\t" + ft.format( balance ));
    }

}