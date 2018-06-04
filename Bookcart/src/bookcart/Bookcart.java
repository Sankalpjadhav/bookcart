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
    int stock[][]=  {{0,19,4000},{1,21,2600},{2,35,4250},{3,30,1200},{4,24,7750},{5,21,7100}};
 int cart[][]={{0,0,0},{1,0,0},{2,0,0},{3,0,0},{4,0,0},{5,0,0}};
 String name[][]={{"book"},{"booka"},{"bookb"},{"bookc"},{"bookd"},{"booke"}};
 int code;
 int qty; 
 int flag=0;
static Scanner in=new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
    Bookcart BookAccount =new Bookcart();
    Book myBook = new Book();
    int user_choice;
     do {
        System.out.println();
        System.out.println("1.ADD CUSTOMER ACCOUNT 2.ADD_INTO_CART 3.DELETE_FROM_CART 4.DISPLAY 5.EXIT");
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
            case 3:myBook.disp_cart(user_choice);
                    break;
            default:
                System.out.println("Plzzzz!!!!! Enter the correct choice");
        }
            
        }
     while(user_choice != 5);
    }
    
}
