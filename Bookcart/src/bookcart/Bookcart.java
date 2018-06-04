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

public class Bookcart {

    /**
     * @param args the command line arguments
     * This Class Displays Menu
     * 1.For OPening Account 2.For Adding Book In Cart 3.For deleting Book
     * 4.for display Cart
     */

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       Scanner in =new Scanner(System.in); 
    Bookcart BookAccount =new Bookcart();
    Book myBook = new Book();
    int user_choice;
     do {
      myBook.disp_stock();
        System.out.println();
        System.out.println("1.ADD CUSTOMER ACCOUNT 2.ADD_INTO_CART 3.DELETE_FROM_CART 4.DISPLAY CART 5.GENETRATE BILL 6.EXIT");
        System.out.println();
        System.out.print("Enter choice: ");
        user_choice = s.nextInt();
        switch (user_choice) {
            case 1: 
                System.out.println("Enter a customer name");
                    String cn = s.next();
                    System.out.println("Enter a customer Address");
                    String ca =s.next();
                    System.out.println("Account was created and it has the following number: " + myBook.openNewAccount(cn, ca));
                    break;
            case 2:System.out.println("Enter account number"); 
                int accountNum=in.nextInt();
                 myBook.ADD_cart(accountNum);
                  break;
            case 3:myBook.DELETEcart();
                    break;
            case 4:myBook.disp_cart(user_choice);
                    break;
            case 5:myBook.bill();
                  break;
            default:
                System.out.println("Plzzzz!!!!! Enter the correct choice");
        }
            
        }
     while(user_choice != 5);
    }

    
    
}
