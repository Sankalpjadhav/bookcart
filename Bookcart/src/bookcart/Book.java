/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookcart;

import java.util.Scanner;

/**
 *
 * @author sjadh
 */
class Book {
    bookcart.BookAccount[] accounts;     
 int noOfAccounts = 10;
 int stock[][]=  {{0,19,4000},{1,21,2600},{2,35,4250},{3,30,1200},{4,24,7750},{5,21,7100}};
 int cart[][]={{0,0,0},{1,0,0},{2,0,0},{3,0,0},{4,0,0},{5,0,0}};
 String name[][]={{"book1"},{"book2"},{"book3"},{"book4"},{"book5"},{"book6"}};
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
    System.out.println("CODE \t QUANTITY\t\tRATE  ");
    for(i=0;i<6;i++){
    if(cart[i][1]!=0){
    
    System.out.println(cart[i][0]+"\t"+"\t"+cart[i][1]+"\t"+"\t"+cart[i][2]);
    System.out.println("UPDATED STOCK ");
      System.out.println("CODE \t QUANTITY\t\tRATE  ");
    System.out.println(stock[i][0]+"\t"+"\t"+stock[i][1]+"\t"+"\t"+stock[i][2]);
    }   
    }
    }
   
    }
    return 1;
}
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
    void bill(){
        int i;int amt=0;
        for(i=0;i<6;i++){
         amt=amt+cart[i][2];
         
        
        }
    System.out.println("YOUR TOTAL BILL IS RS."+ amt);
    
    }
 void disp_stock(){
 int i;
 System.out.println("..............................BOOK STOCK.........................................");
 System.out.println("\tBOOK_NAME\t\tCODE\t\tQUANTITY\t\tRATE\t ");
 for(i=0;i<6;i++){
 System.out.println("\t"+name[i][0]+"\t"+"\t"+"\t"+stock[i][0]+"\t"+"\t"+stock[i][1]+"\t"+"\t"+"\t"+stock[i][2]);
 }
 
 }

    
}
