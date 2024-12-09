/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btdeadlinet2.pkg2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TUF
 */
public class BTDeadLineT22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> nam_ho = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nam_ho1 = new ArrayList<>();
        nam_ho1.add("Kotex chống thấm");
        nam_ho1.add("Nguyễn Minh Nam");
        nam_ho1.add("50000");
        nam_ho1.add("Nam Hô");
        nam_ho.add(nam_ho1);

        ArrayList<String> nam_ho2 = new ArrayList<>();
        nam_ho2.add("Bao cao su siêu mỏng");
        nam_ho2.add("Vương Trần Quang Thắng");
        nam_ho2.add("24000");
        nam_ho2.add("Quang Tèo");
        nam_ho.add(nam_ho2);

        ArrayList<String> nam_ho3 = new ArrayList<>();
        nam_ho3.add("Bàn phím cơ Edra");
        nam_ho3.add("Nguyễn Trung Hiền");
        nam_ho3.add("300000");
        nam_ho3.add("Hiền");
        nam_ho.add(nam_ho3);

        ArrayList<String> nam = new ArrayList<String>();
       
        nam.add("1. Sắp xếp theo giá sp từ thấp đến cao");
        nam.add("2. Sắp xếp theo giá sp từ cao đến thấp");
        nam.add("3. Xóa khách hàng");
        System.out.println(nam);
        
        nam.add("Nhập lựa chọn của bạn ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Danh sách trước khi sắp xếp:");
            for (ArrayList<String> sp : nam_ho) {
                System.out.println(sp);
            }

            Collections.sort(nam_ho, (a, b) -> Double.compare(
                    Double.parseDouble(a.get(2)),
                    Double.parseDouble(b.get(2))
            )
            );

            System.out.println("\nDanh sách sau khi sắp xếp (từ thấp đến cao):");
            for (ArrayList<String> sp : nam_ho) {
                System.out.println(sp);
            }
        } 
        
        
        else if (choice == 2) {
            System.out.println("Danh sách trước khi sắp xếp:");
            for (ArrayList<String> sp : nam_ho) {
                System.out.println(sp);
            }

            Collections.sort(nam_ho, (a, b) -> Double.compare(
                    Double.parseDouble(b.get(2)),
                    Double.parseDouble(a.get(2))
            )
            );

            System.out.println("\nDanh sách sau khi sắp xếp (từ cao đến thấp):");
            for (ArrayList<String> sp : nam_ho) {
                System.out.println(sp);
            }
        }

    }
}
