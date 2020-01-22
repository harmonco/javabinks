//Cody Harmon
//Ch_9 Programming Assignment

import java.util.Scanner;
public class Account
{
   private double balance;
   public Account()
   {
      balance = 0;
   }
 
   public Account(double initialDeposit)
   {
      balance = initialDeposit;
   }
   
   public double getBalance()
   {
      return balance;
   }

   //returns new balance or throws NegativeAmountException
   public double deposit(double amount) throws NegativeAmountException
   {
      if(amount > 0)
         balance += amount;
      else
         throw new NegativeAmountException();
      return balance;

   }
   
   //returns new balance or throws InsufficientAmountException
   public double withdraw(double amount) throws NegativeAmountException, InsufficientBalanceException
   {
      if (amount > balance)
         throw new InsufficientBalanceException();
      if (amount < 0)
         throw new NegativeAmountException();
      else
         balance -= amount;
      return balance;
   }
   
   public static void main(String [] args)
   {
      Account a = new Account(10);
      try
      {
         a.deposit(100);
         a.withdraw(150);
         System.out.println(a.getBalance());
      }
      catch (Exception e)
      {
         System.out.println(e.getMessage());
      }
   }
   
}