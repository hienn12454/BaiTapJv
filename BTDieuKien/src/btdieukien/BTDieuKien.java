/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btdieukien;

import java.awt.BorderLayout;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author TUF
 */
public class BTDieuKien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //Bài 1
//        System.out.println("Nhập tuổi ");
//        int tuoi = sc.nextInt();
//        if(tuoi > 0 && tuoi <= 2){
//            System.out.println("Trẻ sơ sinh");         
//        }else if(tuoi > 2 && tuoi <= 10){
//            System.out.println("Nhi đồng");
//        }else if(tuoi > 10 && tuoi <= 17){
//            System.out.println("Vị thành niên");
//        }else if(tuoi > 17 && tuoi <= 39){
//            System.out.println("Thanh niên");
//        }else if(tuoi > 39 && tuoi <= 50){
//            System.out.println("Trung niên");
//        }
        //Bài 2
//        int sx = sc.nextInt();
//        if(sx >= 15){
//            System.out.println("Thay thế");
//        }else if(sx >= 10 && sx < 15){
//            System.out.println("Bảo trì");
//        }else {
//            System.out.println("Không");
//        }
        //Bài 3
//        int diem = sc.nextInt();
//        if(diem >= 9){
//            System.out.println("5000");
//        }else if(diem >=8 && diem < 9){
//            System.out.println("3000");
//        }else if(diem >= 7 && diem < 8){
//            System.out.println("1000");
//        }else{
//            System.out.println("0");
//        }
        //Bài 4
//        System.out.println("Nhập time");
//        int time = sc.nextInt();
//        System.out.println("Nhập lương");
//        int luong = sc.nextInt();
//        int thuong = 0;
//        if(time >= 200){
//            thuong = luong * 20/100;
//        }else if(time >= 100 && time < 200){
//            thuong = luong *10/100;
//        }else {
//           thuong = 0;
//        }
//        System.out.println(luong +  " " + thuong);
        //Bài 5
//        System.out.println("Nhập điểm");
//        int diem = sc.nextInt();
//        if(diem>8){
//            System.out.println("HSG");
//        }else if(diem < 5){
//            System.out.println("HSY");
//        }
        //Bài 7
//        System.out.println("Nhập số 1 và số 2");
//        int n1= sc.nextInt();
//        int n2= sc.nextInt();
//        System.out.println(n1+" "+n2);
//        int swap;
//        swap = n2;
//        n2 = n1;
//        n1 = swap;
//        System.out.println("Sau khi hoán đổi " + n1 + " " + n2);
        //Bài 8
//        int num, i, j, temp;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập vào số lượng phần tử của mảng:");
//        num = input.nextInt();
//        int array[] = new int[num];
//        System.out.println("Nhập vào các phần tử trong mảng:");
//        for (i = 0; i < num; i++)
//            array[i] = input.nextInt();
//        for (i = 0; i < (num - 1); i++) {
//            for (j = 0; j < num - i - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println("Kết quả sau khi sắp xếp theo thứ tự tăng dần là: ");
//        for (i = 0; i < num; i++) {
//            System.out.print(array[i] + "\t");
//        }
        //Bài 9
        //Bài 10
//        System.out.println("Nhập tháng");
//        int month = sc.nextInt();
//        System.out.println("Nhập năm");
//        int year = sc.nextInt();
//        if(month == 8|| month == 1|| month == 3|| month ==5 || month ==7|| month==10 || month == 12){
//            System.out.println("Có 31 ngày");
//        }else if(month ==2 && year %4 != 0){
//            System.out.println("Có 29 ngày");
//        }else{
//            System.out.println("Có 30 ngày");
//        }
        //Bài 11
//        System.out.println("Nhập pt cần giải");
//        System.out.println("1.Phương trình bậc I");
//        System.out.println("2.Phương trình bậc II");
//        System.out.println("3.Phương trình bậc IV");
//        System.out.println("4.Phương trình bậc I hai ẩn");
//        int n = sc.nextInt();
//        System.out.println("Nhập a, b, c, d");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//            switch (n) {
//                case 1:
//                    System.out.println("Phương trình bậc I " + a + "x" + b+"="+"0");
//                    break;
//                case 2:
//                    System.out.println("Phương trình bậc II "+a+"x^2"+b+"x"+c+"="+"0");
//                    break;
//                case 3:
//                    System.out.println("Phương trình trùng phương "+a+"x^4"+b+"x^2"+c+"="+"0");
//                    break;
//                case 4:
//                    System.out.println("Phương trình bậc I hai ẩn "+a+"x"+"+"+b+"y"+"="+c);
//                    break;
//            }
        //Bài 12
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>0 || b>0 || c>0){
            System.out.println("Đây là 1 tam giác");
        }
        if(a==b && b==c && c==a){
            System.out.println("Tam giác đều");
        }else if(a==b || a==c || b==c){
            System.out.println("Tam giác cân");
        }else if(sqrt(a) == (b+c) || sqrt(b) == (a+c) || sqrt(c) == (a+b) )
            System.out.println("Tam giác vuông");
    }else if(a != b || b!=c || a!=c){
            System.out.println("Tam giác thường");
}
}
