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
public class InputCheck {
    public static Scanner sc = new Scanner(System.in);
    public static String CheckAccountNumber(String accountNumber){
        while(true){
            System.out.println("Nhập số tài khoản");
            String accountNumber1 = sc.nextLine();
            if(accountNumber1 != null){
                return accountNumber;
            }else {
                System.out.println("Không hợp lệ");
            }
        }
    }
    public static int CheckBalance(int balance){
        while(true){
            System.out.println("Nhập số dư");
            int balance1 = sc.nextInt();
            if(balance1 >0){
                return balance;
            }else {
                System.out.println("Không hợp lệ");
            }
        }
    }
}
