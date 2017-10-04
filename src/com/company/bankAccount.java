package com.company;

/**
 * Created by ma128 on 10/4/17.
 */
public class bankAccount {

double balance;
String name;

  public bankAccount(double a, String n)
  {
      balance = a;
      name = n;
  }
    
    public double returnBalance()
    {
        return balance;
    }
    
    public String returnName()
    {
        return name;
    }
    
    public void deposit(double d)
    {
        balance += d;
    }
    
    public void withdraw(double w)
    {
        balance -= w;
    }
    
    
}
