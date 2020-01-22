//Cody Harmon
//Ch_5 Programming Assignment


public class InvoiceTester
{
   public static void main(String[] args)
   {
      //Create and display the first invoice
      Invoice invoice1 = new Invoice();
      invoice1.setPartNumber("117174");
      invoice1.setPartDescription("Smooth Face Steel Head Fiberglass Claw Hammer");
      invoice1.setAmountPurchased(3);
      invoice1.setCostPerItem(9.99);
      System.out.println("INVOICE1: \nPart number: " + invoice1.getPartNumber());
      System.out.println("Part description: " + invoice1.getPartDescription());
      System.out.println("Amount Purchased: " + invoice1.getAmountPurchased());
      System.out.println("Cost per item: $ " + invoice1.getCostPerItem());
      System.out.printf("Invoice amount: $ %.2f", invoice1.getInvoiceAmount());
      
      //Create and display the second invoice
      Invoice invoice2 = new Invoice();
      invoice2.setPartNumber("248774");
      invoice2.setPartDescription("5/8-in x 200-ft Polyethylene Drip Irrigation Distribution Tubing");
      invoice2.setAmountPurchased(2);
      invoice2.setCostPerItem(20.98);
      System.out.println("\nINVOICE2: \nPart number: " + invoice2.getPartNumber());
      System.out.println("Part description: " + invoice2.getPartDescription());
      System.out.println("Amount Purchased: " + invoice2.getAmountPurchased());
      System.out.println("Cost per item: $ " + invoice2.getCostPerItem());
      System.out.printf("Invoice amount: $ %.2f", invoice2.getInvoiceAmount());
   }
   
}
   