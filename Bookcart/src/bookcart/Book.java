/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookcart;

import java.util.Scanner;

/**
 *This class Shows Us Option Of books Along with Their code And Name
 * Stock Cart Shows Us Books Avaliable 
 * Name Array Shows US Name Of book .
 * @author sjadh
 */
public class Book {
 bookcart.BookAccount[]accounts;     
 int noOfAccounts = 10;
 int stock[][]=  {{0,19,4000},{1,21,2600},{2,35,4250},{3,30,1200},{4,24,7750},{5,21,7100}};
 int cart[][]={{0,0,0},{1,0,0},{2,0,0},{3,0,0},{4,0,0},{5,0,0}};
 String name[][]={{"BIBLE"},{"KHURAN"},{"GEETA"},{"INFERNO"},{"STATION"},{"ROAD"}};
 int code;
 int qty; 
 int flag=0;
 static Scanner in=new Scanner(System.in);
 
 public void book()
 {
     accounts = new bookcart.BookAccount[10];
    noOfAccounts = 0;
 }
 
 public int openNewAccount(String customerName, String customerAddress) {

  
        BookAccount b=new BookAccount(customerName,customerAddress);
        noOfAccounts++;
        return b.getAccountNum();
        
    
 
}
 /**
 * This Part Of Code Adds The Required Item In Cart
 * It Increases The Quantity Of item In Cart 
 * And Decreases The Same Quantity From The Stock Available
 * Items Are Selected with Help Of Code 
 */
public void ADD_cart(int accountNum)
{   
               System.out.println("enter the code");
        code =in.nextInt();
  
         if(code<0||code>5)
         {
                System.out.println("invalid code");
                ADD_cart(accountNum);
                
          }

         else
         {
            System.out.println("enter the quantity to be added");
            qty=in.nextInt();
            if (qty >stock[code][1]){
                System.out.println("not valid");
            }
            else{
            cart[code][1] +=qty;
            cart[code][2]=cart[code][1]*stock[code][2];
            stock[code][1]-=qty;
         }
  }    
              
}
public int check(int b){
    for(int i=0;i<6;i++){
        if(cart[i][0]==cart[code][0])
            return b=0;
    }
    return b=1;
}
/** 
 *This method checks the cart status
 * and displays the books presnt in the cart
 * This method also displays the updated book stock after every add and remove operations.
 
 
 
 
 */
    public int disp_cart(int flag){
    int i;
    for(i=0;i<6;i++){
    if(cart[i][1]!=0){
    flag++;}
    if(flag==0){
        System.out.println("shopping cart is empty");
        return 0;
    }
    else{
     System.out.println("..........MY CART.........");
    System.out.println("CODE \t QUANTITY\t\tRATE  ");
    for(i=0;i<6;i++){
    if(cart[i][1]!=0){
    
    System.out.println(cart[i][0]+"\t"+"\t"+cart[i][1]+"\t"+"\t"+cart[i][2]);
     System.out.println(".........................................UPDATED BOOK STOCK.........................................");
 System.out.println("\tBOOK_NAME\t\tCODE\t\tQUANTITY\t\tRATE\t ");
 
 System.out.println("\t"+name[i][0]+"\t"+"\t"+"\t"+stock[i][0]+"\t"+"\t"+stock[i][1]+"\t"+"\t"+"\t"+stock[i][2]+"\t"+"\t");
 
    }   
    }
    }
   
    }
    return 1;
}
    /**
 * This Part Of Code Removes The Required book from the Cart
 * It Increases The Quantity Of that book In the stock
 * And Decreases The Same Quantity From cart
 * Items Are Selected with Help Of Code 
 */
    public void DELETEcart(){
        System.out.println("enter the code");
  code =in.nextInt();
  
  if(code<0||code>5)
  {
      System.out.println("invalid code");
      DELETEcart();
  }
  if(cart[code][1]==0){
  
  System.out.println("item not available");
  }
  else{
  System.out.println("enter the quantity to be reduced");
  qty=in.nextInt();
  if(cart[code][1]<qty)
      
  {
      System.out.println("WARNINIG:excess quantity entered");
      
  }
  else{
  
  cart[code][1] -=qty;
  cart[code][2]=cart[code][1]*stock[code][2];
  stock[code][1]+=qty;
          }
  }    
}
    /**
 * This Part Of code Generates and displays the net bill of a customer.
 */
    void bill(){
        int i;int amt=0;
        for(i=0;i<6;i++){
         amt=amt+cart[i][2];
         
        
        }
    System.out.println("YOUR TOTAL BILL IS RS."+ amt);
    
    }
    /**
     * This code displays th books in stalk along with the book code,number of books available,price of the book. 
     */
 void disp_stock(){
 int i;
 System.out.println("..............................BOOK STOCK.........................................");
 System.out.println("\tBOOK_NAME\t\tCODE\t\tQUANTITY\t\tRATE\t ");
 for(i=0;i<6;i++){
 System.out.println("\t"+name[i][0]+"\t"+"\t"+"\t"+stock[i][0]+"\t"+"\t"+stock[i][1]+"\t"+"\t"+"\t"+stock[i][2]);
 }
 
 }

    
}
