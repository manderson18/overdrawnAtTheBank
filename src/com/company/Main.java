package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner kbin = new Scanner(System.in);
        System.out.println("Welcome to Lowercase Two bank! Enter your name below");
        String name = kbin.nextLine();

        System.out.println("Please enter your account balance below");
        double balance = kbin.nextDouble();
        int userExit = 0;
        bankAccount myAccount = new bankAccount(balance, name);
        while (userExit == 0) {
        System.out.println("Welcome " + myAccount.returnName()+ ", Your balance is " + myAccount.returnBalance() + ". What would you like to do? \n Deposit \n OR \n Withdraw ");
        String bufferResponse = kbin.nextLine();


            String response = kbin.nextLine();

            if (response.equalsIgnoreCase("withdraw")) {
                System.out.println("Please enter the amount you wish to withdraw: ");
                double withdrawAmount = kbin.nextInt();

                System.out.println("OK, " + myAccount.returnName() + ", you have just withdrawn " + myAccount.withdraw(withdrawAmount) + ". Your remaining balance is " + myAccount.returnBalance() + ".\n"); // Withdraw money, and tell the user how much they withdrew, and their remaining balance.
            } else if (response.equalsIgnoreCase("deposit")) {
                System.out.println("Please enter the amount you wish to deposit: ");
                double depositAmount = kbin.nextInt();
                System.out.println("OK, " + myAccount.returnName() + ", you have just deposited " + myAccount.deposit(depositAmount) + ". Your new and improved balance is " + myAccount.returnBalance() + ".\n"); // Deposit money, tell user how much they deposited, and their remaining balance.
            } else {
                userExit = 1;
                System.out.println("Okay, have a great day " + myAccount.returnName());
            }
        }
    }
}

// Add a while statement to allow multiple transactions
// Don't allow someone to overdraw on their account.

// If(withdrawAmount >myAccount.returnBalance){
// System.out.println("Sorry, you don't have enough money, you only have "+myAccount.returnBalance+". Please make a deposit, or get the hell out my bank you broke hobo.");
// }
