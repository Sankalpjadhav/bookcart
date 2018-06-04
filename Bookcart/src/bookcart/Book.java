/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookcart;

/**
 *
 * @author sjadh
 */
class Book {
    bookcart.BookAccount[] accounts;     
 int numOfAccounts = 10;
 
 public void book()
 {
     accounts = new bookcart.BookAccount[10];
    numOfAccounts = 0;
 }
 
 public int openNewAccount(String customerName, String customerAddress) {

    bookcart.BookAccount b = new bookcart.BookAccount(customerName,customerAddress);
    numOfAccounts++;
    return b.getAccountNum();
}

    
}
