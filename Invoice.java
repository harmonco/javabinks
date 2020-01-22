//Cody Harmon
//Ch_5 Programming Assignment


/**
This program creates an invoice for items purchased at a hardware store
*/
public class Invoice
{
   //Instance variables
   private String partNumber; //The number for the part being purchased
   private String partDescription; //A description of the part being purchased
   private int amountPurchased; //The amount of an item purchased
   private double costPerItem; //The cost for one item purchased
   
   //Methods that sets part number
   public void setPartNumber(String newPartNumber)
   {
      partNumber = newPartNumber;
   }
   
   //Method that sets part description
   public void setPartDescription(String newPartDescription)
   {
      partDescription = newPartDescription;
   }
   
   //Method that sets amount purchased   
   public void setAmountPurchased(int newAmountPurchased)
   {
      amountPurchased = newAmountPurchased;
   }
   
   //Method that sets cost per item
   public void setCostPerItem(double newCostPerItem)
   {
      costPerItem = newCostPerItem;
   }
   
   //Method that returns the part number
   public String getPartNumber ()
   {
      return partNumber;
   }
   
   //Method that returns the part description
   public String getPartDescription ()
   {
      return partDescription;
   }
   
   //Method that returns the amount purchased
   public int getAmountPurchased ()
   {
      return amountPurchased;
   }
   
   //Method that returns the cost per item
   public double getCostPerItem ()
   {
      return costPerItem;
   }
   
   //Method that returns the total price of the items
   public double getInvoiceAmount ()
   {
      return amountPurchased * costPerItem;
   }
   
   
   
}