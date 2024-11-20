/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorbt;

import java.util.Scanner;

/**
 *
 * @author TUF
 */
public class Account {
    private String accountNumber;
    private int balance;
    Scanner sc = new Scanner(System.in);

    public Account() {
    }

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
       public void input(){  
        accountNumber = InputCheck.CheckAccountNumber("");
        balance = InputCheck.CheckBalance(0);
    
}
   
}

