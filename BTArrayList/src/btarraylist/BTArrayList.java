/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author TUF
 */
public class BTArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        List<String> list = new ArrayList<String>();
//        list.add("Apple");
//        list.add("banana");
//        list.add("cherry");
//        list.add("pineapple");
//        System.out.println(list);


//
//        List<String> list = new ArrayList<String>();
//        list.add("one");
//        list.add("two");
//        list.add("three");
//        list.add("four");



//Xóa là Tên biến ví dụ ở đây là list_Str.remove(phần tử số mấy)
//        List<String> list_Str = new ArrayList<String>();
//        list_Str.add("Black");
//        list_Str.add("White");
//        list_Str.add("Orange");
//        list_Str.add("Purple");
//        list_Str.add("Green");
//        list_Str.add("Yellow");
//        list_Str.add("Red");
//        list_Str.add("Blue");
//        list_Str.add("Pink");
//        Collections.sort(list_Str);
//        System.out.println("Trước khi xóa: " + list_Str);
//        list_Str.remove(5);
//        Collections.sort(list_Str);
//        System.out.println("\nSau khi xóa : " + list_Str);



// Sắp xếp là Collections.sort
//        List<String> list_Book = new ArrayList<String>();
//        list_Book.add("Python");
//        list_Book.add("C");
//        list_Book.add("Php");
//        list_Book.add("Css");
//        list_Book.add("MySQL");
//        list_Book.add("C++");
//        list_Book.add("Java");
//        list_Book.add("HTML");
//        list_Book.add("Bootstrap");
//        list_Book.add("Flask");
//        System.out.println("Trước:" + list_Book);
//        Collections.sort(list_Book);
//        System.out.println("Sau: " + list_Book);
        
        
//Xáo trộn(Shuffle) cú pháp là Collections.shuffle(tên biến);
//        List<String> list_col = new ArrayList<String>();
//        list_col.add( " Đen ");
//        list_col.add(" Xanh lá");
//        list_col.add(" Hồng ");
//        list_col.add(" Tím");
//        list_col.add(" Trắng");
//        list_col.add(" Vàng ");
//        System.out.println(" Trước khi xáo trộn : " + list_col);
//        Collections.shuffle(list_col);
//        System.out.println(" Sau khi xáo trộn : " + list_col);



// Increase list
//        ArrayList<String> list_book = new ArrayList<String>(2);       // Cấp dung lượng sẵn cho danh sách
//        list_book.add("A");
//        list_book.add("B");
//        System.out.println("Ban đầu " +list_book );
//        list_book.ensureCapacity(7);
//        list_book.add("C");
//        list_book.add("D");
//        list_book.add("E");
//        list_book.add("F");
//        list_book.add("G");
//        System.out.println(list_book);


//Cho phép đảo ngược thứ tự các phần tử trong ds {1 2 3 4} => {4 3 2 1}
//        List<String> list_col = new ArrayList<String>();
//        list_col.add("1");
//        list_col.add("2");
//        list_col.add("3");
//        list_col.add("4");
//        list_col.add("5");
//        list_col.add("6");
//        list_col.add("7");
//        System.out.println("Ban đầu :" + list_col);
//        Collections.reverse(list_col);
//        System.out.println("sau khi đảo :" + list_col);


//Trộn 2 mảng lại nếu trùng nhau phần tử nào thì true còn khác thì false
//        ArrayList<String> list_str1 = new ArrayList<String>();
//        list_str1.add("KFC");
//        list_str1.add("POPPEYES");
//        list_str1.add("MAC DONALD");
//        list_str1.add("TEXAS");
//        list_str1.add("JOLIBEE");
//        list_str1.add("CHICKEN PLUS");
//        ArrayList<String> list_str2 = new ArrayList<String>();
//        list_str2.add("KFC");
//        list_str2.add("JOLIBEE");
//        list_str2.add("FKT");
//        System.out.println("String 1 :" + list_str1);//In ra list1
//        System.out.println("String 2 :" + list_str2);//In ra list2
//        ArrayList<String> list_str3 = new ArrayList<String>();// Tạo list 3 để kết hợp 2 cái xem có giao nhau ko
//        
//        // cú pháp này chưa hiểu lắm
//        for (String e : list_str1) {
//            list_str3.add(list_str2.contains(e) ? "True" : "Flase");
//        }
//        System.out.println("Compare String 1 & 2 :" + list_str3);


// thay đổi thứ tự vị trí của từng phần tử nó hơi giống thằng suffle nhưng mà này có quy tắc
//        ArrayList<String> list_hien = new ArrayList<String>();
//        list_hien.add("1");
//        list_hien.add("2");
//        list_hien.add("3");
//        list_hien.add("4");
//        list_hien.add("5");
//        list_hien.add("6");
//        System.out.println("trước khi swap : ");
//        for (String a : list_hien) {
//            System.out.println(a);
//        }
//        Collections.swap(list_hien, 1, 4);
//        System.out.println("sau khi swap : ");
//        for (String b : list_hien) {
//            System.out.println(b);
//        }


//        ArrayList<String> list_str1 = new ArrayList<String>();
//        list_str1.add("ASUS");
//        list_str1.add("MSI");
//        list_str1.add("DELL");
//        list_str1.add("MAC");
//        System.out.println("Mảng 1: " + list_str1);
//        ArrayList<String> list_str2 = new ArrayList<String>();
//        list_str2.add("TOSHIBA");
//        list_str2.add("MITSUBISHI");
//        list_str2.add("SONY");
//        System.out.println("Mảng 2 : " + list_str2);
//        ArrayList<String> a = new ArrayList<String>();
//        a.addAll(list_str1);
//        a.addAll(list_str2);
//        System.out.println("Biến hình : " + a);



//        ArrayList<String> nam = new ArrayList<String>();
//        nam.add("Black");
//        nam.add("Orange");
//        nam.add("Pink");
//        nam.add("Blue");
//        nam.add("White");
//        nam.add("Yellow");
//        System.out.println( nam);
//        nam.removeAll(nam);
//        System.out.println("Xóa hết" + nam);


//        List<String> nam_ho = new ArrayList<String>();
//        nam_ho.add("MSI");
//        nam_ho.add("ASUS");
//        nam_ho.add("DELL");
//        nam_ho.add("MACBOOK");
//        nam_ho.add("ACER");
//        nam_ho.add("HP");
//        nam_ho.add("LENOVO");
//        System.out.println(nam_ho);
//        String laptop = nam_ho.get(0);
//        System.out.println("First: " + laptop);
//        laptop = nam_ho.get(4);
//        System.out.println("Fifth: " + laptop);


//        List<String> nam_ho = new ArrayList<String>();
//        nam_ho.add("1");
//        nam_ho.add("2");
//        nam_ho.add("3");
//        nam_ho.add("4");
//        nam_ho.add("5");
//        System.out.println(nam_ho);
//        nam_ho.set(1, "6");
//        nam_ho.set(4, "7");
//        System.out.println(nam_ho);



//        List<String> nam_ho = new ArrayList<String>();
//        nam_ho.add("Red");
//        nam_ho.add("Green");
//        nam_ho.add("Orange");
//        nam_ho.add("White");
//        nam_ho.add("Black");
//        if (nam_ho.contains("Orange")) {
//            System.out.println("Có phần tử");
//        } else {
//            System.out.println("Không có phần tử");
//        }



//        List<String> nam_ho1 = new ArrayList<String>();
//        nam_ho1.add("10");
//        nam_ho1.add("20");
//        nam_ho1.add("30");
//        nam_ho1.add("40");
//        nam_ho1.add("50");
//        List<String> nam_ho2 = new ArrayList<String>();
//        nam_ho2.add("A");
//        nam_ho2.add("B");
//        nam_ho2.add("C");
//        nam_ho2.add("D");
//        nam_ho2.add("E");
//        System.out.println("Nam hô 1 : " + nam_ho1);
//        System.out.println("Nam hô 2 : " + nam_ho2);
//        Collections.copy(nam_ho2, nam_ho1);
//        System.out.println("Copy Nam hô 1 to Nam hô 2");
//        System.out.println("Nam hô 1: " + nam_ho1);
//        System.out.println("Nam hô 2 : " + nam_ho2);



//Tạo 1 list con tên biến . subList(phần tử bắt đầu, phần tử kết thúc) lưu ý là ví dụ (0 , 3) thì nhận phần tử 0 1 2 không nhận phần tử 3
//        List<String> nam_ho = new ArrayList<String>();
//        nam_ho.add("1");
//        nam_ho.add("2");
//        nam_ho.add("3");
//        nam_ho.add("4");
//        nam_ho.add("5");
//        System.out.println("in ra: " + nam_ho);
//        List<String> sub_list = nam_ho.subList(0, 3);
//        System.out.println("Biến hình: " + sub_list);



// Tạo 1 bản sao sang mảng khác
//        ArrayList<String> nam_ho = new ArrayList<String>();
//        nam_ho.add("A");
//        nam_ho.add("B");
//        nam_ho.add("C");
//        nam_ho.add("D");
//        nam_ho.add("E");
//        nam_ho.add("F");
//        System.out.println("BAN ĐẦU : " + nam_ho);
//        ArrayList<String> nam_ho_new = (ArrayList<String>) nam_ho.clone();
//        System.out.println("HÀNG REP 1:1 : " + nam_ho_new);



//isEmpty() trả về True False
//        ArrayList<String> nam_ho = new ArrayList<String>();
//        nam_ho.add("A");
//        nam_ho.add("B");
//        nam_ho.add("C");
//        nam_ho.add("D");
//        nam_ho.add("E");
//        nam_ho.add("F");
//        System.out.println(nam_ho);
//        System.out.println("EMPTY HAY KHONG: " + nam_ho.isEmpty());
//        nam_ho.removeAll(nam_ho);
//        System.out.println("REMOVE ALL: " + nam_ho);
//        System.out.println("EMPTY HAY KHONG  : " + nam_ho.isEmpty());



//        ArrayList<String> nam_ho = new ArrayList<String>();
//        nam_ho.add("A");
//        nam_ho.add("B");
//        nam_ho.add("C");
//        nam_ho.add("D");
//        nam_ho.add("EHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
//        nam_ho.add("F");
//        nam_ho.add("G");
//        System.out.println(nam_ho);
//        nam_ho.trimToSize();
//        System.out.println(nam_ho);



//        ArrayList<String> nam_ho = new ArrayList<String>();
//        nam_ho.add("Z");
//        nam_ho.add("X");
//        nam_ho.add("C");
//        nam_ho.add("V");
//        nam_ho.add("B");
//        nam_ho.add("N");
//        nam_ho.add("M");
//        System.out.println( nam_ho);
//        int len = nam_ho.size();
// In ra mảng bằng cách dùng vòng lặp
//        for (int i = 0; i < len; i++) {
//            System.out.println(nam_ho.get(i));
//        }


// Tìm số lớn nhất là Collections.max
//Phải sử dụng OBject <tên biến> tại vì kiểu dữ liệu của ArrayList không xác định 
//        ArrayList nam_ho = new ArrayList();
//        nam_ho.add("80");
//        nam_ho.add("18");
//        nam_ho.add("48");
//        nam_ho.add("37");
//        nam_ho.add("24");
//        Object max_num = Collections.max(nam_ho);
//        System.out.println("Số lớn nhất là : " + max_num);


        
//        ArrayList nam_ho = new ArrayList();
//        nam_ho.add("80");
//        nam_ho.add("18");
//        nam_ho.add("48");
//        nam_ho.add("37");
//        nam_ho.add("24");
//        Object min_nam = Collections.min(nam_ho);
//        System.out.println("Maximum Element ArrayList is : " + min_nam);
    }

}
