package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner kbin = new Scanner(System.in);
        System.out.println("Welcome to Lowercase Two bank! Enter your name below");
        String name = kbin.nextLine();

        System.out.println("\n Please enter your account balance below");
        double balance=kbin.nextInt();

        bankAccount myAccount = new bankAccount(balance, name);
        System.out.println("Welcome " + myAccount.returnName() + " Your balance is " + myAccount.returnBalance()+" What would you like to do? ");
        String response = kbin.next();
        if(response.equalsIgnoreCase("withdraw")){
            System.out.println(); // Withdraw money, and tell  user how much they withdrew, and their remaining balance.
        } else if(response.equalsIgnoreCase("deposit"))
        {

            System.out.println(); // Deposit money, tell user how much they deposited, and their remaining balance.
        }
    }
}
