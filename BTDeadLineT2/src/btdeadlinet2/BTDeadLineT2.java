/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btdeadlinet2;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TUF
 */
public class BTDeadLineT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nam_ho = new ArrayList<String>();
        nam_ho.add("- Nhập tên sản phẩm");
        nam_ho.add("- Nhập tên khách hàng");
        nam_ho.add("- Nhập giá sản phẩm ");
        nam_ho.add("- Nhập thông tin sản phẩm");
        
        
        
        ArrayList<String> nam = new ArrayList<String>();
        for(String prompt : nam_ho){
            System.out.println(prompt + ":");
            String input = sc.nextLine();
            nam.add(input);
        }
        
        
        for(int i = 0; i < nam.size(); i++){
            System.out.println(nam_ho.get(i) + " : " + nam.get(i));
        }
        sc.close();
        
        
        ArrayList<String> menu = new ArrayList<String>();
     
        menu.add("1. Sắp xếp theo giá từ thấp đến cao");
        menu.add("2. Sắp xếp theo giá từ cao đến thấp");
        menu.add("3. Xóa tên khách hàng");
        menu.add("Nhập lựa chọn của bạn");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("-------------");
            Collections.sort(nam);
            System.out.println();
        }else if(choice == 2){
            System.out.println("-------------");
        }else if(choice == 3){
            System.out.println("-------------");
        }else{
            System.out.println("Khong hợp lệ");
        }
    }
}
 
