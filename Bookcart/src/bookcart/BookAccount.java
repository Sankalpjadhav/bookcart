/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookcart;

/**
 *This class is used to find the account number of the user .
 * @author sjadh
 * it returns the account number to the calling function.
 */
public class BookAccount {
    
    int accountNum;
    String customerName;
    String customerAddress;
    int noOfAccounts=0;

       public String getAccountInfo(){
           return "Account number: " + accountNum + "\nCustomer Name: " + customerName + "\nCustomer Address:" + customerAddress +"\n";
       }


       public BookAccount(String abc, String xyz){
         customerName = abc;
         customerAddress = xyz;
         noOfAccounts ++;
         accountNum = noOfAccounts;
       }
       
        public int getAccountNum(){
        return accountNum;
    }
        
    
}
