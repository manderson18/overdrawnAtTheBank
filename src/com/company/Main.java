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
        String bufferResponse = kbin.nextLine();
	    
	    String response = kbin.nextLine();
        if(response.equalsIgnoreCase("withdraw"))
	{
		// Create SOP and scanner to ask for amount to withdraw
		System.out.println("OK "+myAccount.returnName+" you have just withdrawn"+withdraw+" your remaining balance is "+returnBalance+". Have a good day!"); // Withdraw money, and tell the user how much they withdrew, and their remaining balance.
        } 
	    else if(response.equalsIgnoreCase("deposit"))
        {
		    //Create SOP and scanner to ask for amount to deposit
            System.out.println("OK "+myAccount.returnName+" you have just deposited"+deposit+" your new and improved balance is "+returnBalance+". Have a good day!"); // Deposit money, tell user how much they deposited, and their remaining balance.
        }
	    
    } else 
    
    {
    System.out.println("Okay, have a good day "+ myAccount.returnName +'.');
    }
}
