package com.company;

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
    
    public double deposit(double d)
    {
        balance += d;
        return d;
    }
    
    public double withdraw(double w)
    {
        balance -= w;
        return w;
    }
    
}
