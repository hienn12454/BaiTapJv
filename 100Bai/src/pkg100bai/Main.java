/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100bai;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import static java.lang.Math.sqrt;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author TUF
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        // TODO code application logic here
//        //Bài 51
//        System.out.println("Nhập 1 chuỗi");
//        Scanner sc = new Scanner(System.in);
//        String chuoi = sc.nextLine();
//        int so = Integer.parseInt(chuoi);
//        System.out.println("Số là:  " + so);
        // Bài 52
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Hãy nhập số 1 và số 2");
//        int s1 = sc.nextInt();
//        int s2 = sc.nextInt();
//        System.out.println("Hãy nhập số 3");
//        int s3 = sc.nextInt();
//        System.out.println(Check(s1, s2, s3));
//
//    }
//    public static boolean Check(int s1, int s2,int  s3){
//        if((s1 + s2) == s3){
//            System.out.println(s3);
//        return true;
//    }
//        else {
//            return false;
//        }
//    }

        //Bài 53
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số 1 2 3");
//        int s1 = sc.nextInt();
//        int s2 = sc.nextInt();
//        int s3 = sc.nextInt();
//        System.out.println(Check(s1, s2, s3));
//    }
//    public static boolean Check(int s1, int s2, int s3){
//        if (s2 > s1 && s3 > s2){
//            System.out.println("Kết quả là đúng");
//            return true;
//        }else{
//            return false;
//        }
//    }
        //Bài 54
//           Scanner sc = new Scanner(System.in);
//           System.out.println("Nhập số giây vào");
//           int giay = sc.nextInt();
//           int second = giay % 60;
//           int hour = giay / 60;
//           int minute = hour % 60;
//           hour = hour / 60;
//           System.out.println(hour+"/"+minute+"/"+second);
//           }
        //Bài 56
//            Scanner sc =new Scanner(System.in);
//            System.out.println("Nhập 2 số x y và chia cho z");
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            int z = sc.nextInt();
//            int count;
//            count = 0;
//            for (int i = x; i<= y; i++){
//                if(i % z == 0){
//                    System.out.println("số chia hết cho "+z+" trong phạm vi từ " + x+" -> "+y);
//                System.out.println(i);
//             
//            count = count + 1;
//            }
//                
//                
//            }
//            System.out.println(count);
        //Bài 57
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số ");
//        int num = sc.nextInt();
//        System.out.println(result(num));
//    }
//    public static int result(int num) {
//        int ctr = 0;
//
//        for (int i = 1; i <=sqrt(num); i++) {
//
//            if (num % i == 0 && i * i != num) {
//                ctr += 2;
//            } else if (i * i == num) {
//                ctr++;
//            }
//        }
//        return ctr;
//    }
//}
        //Bài 58
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập 1 chuỗi kí tự");
//        String s = sc.nextLine();
//        System.out.println(s);
//        String upper_case_line = "";
//        Scanner lineScan = new Scanner(s);
//        
//        while(lineScan.hasNext()){
//            String word = lineScan.next();
//            upper_case_line += Character.toUpperCase(word.charAt(0)) +word.substring(1) + " "; 
//        }
//        System.out.println("Kí tự sau khi upper case");
//        System.out.println(upper_case_line.trim());
//    }
        //Bài 59
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        s = s.toLowerCase();
//        System.out.println(s);
// 
        //Bài 60
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập 1 chuỗi");
//        String s = sc.nextLine();
//        String[] words = s.split("[ ]+");
//        System.out.println("Penultimate word: "+ words[words.length-2]);
        //Bài 61
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập 1 chuỗi");
//        String s = sc.nextLine();
//        s = s.trim();
//        String result = "";
//        char[] ch = s.toCharArray();
//        for (int i = ch.length -1; i>=0; i--){
//            result +=ch[i];
//        }
//        System.out.println("Reverse word: " + result.trim());
        //Bài 62
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Nhập 3 số đi nào");
//          int s1 = sc.nextInt();
//          int s2 = sc.nextInt();
//          int s3 = sc.nextInt();
//          System.out.println(Check(s1, s2, s3));
//          
//    }
//    public static boolean Check(int s1, int s2, int s3){
//        if(s3 - s2 < 20 || s2 - s1 < 20 || s3 - s1 < 20){
//            System.out.println("Đúng");
//            return true;
//        }else{
//            return false;
//        }
//    }
//        Bài 63
//        Scanner sc = new Scanner(System.in);
//        int s1 = sc.nextInt();
//        int s2 = sc.nextInt();
//        if(s1 > s2 ){
//            System.out.println(s1);
//        }else if(s2 > s1){
//            System.out.println(s2);
//        }else if(s1 == s2){
//            System.out.println("0");
//            System.out.println(Check(s1, s2));
//        }
//    }
//    public static int Check(int s1, int s2){
//        int a;
//        System.out.println("");
//        return a = s1%6;
        //Bài 64
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập 2 số");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println("Result: " + common_digit(a, b));
//    }
//
//    public static boolean common_digit(int p, int q) {
//        if (p < 25 || q > 75) {
//            return false;
//        }
//        int x = p % 10;
//        int y = q % 10;
//        p /= 10;
//        q /= 10;
//        return (p == q || p == y || x == q || x == y);
        //Bài 65
//        Scanner sc  = new Scanner(System.in);
//         System.out.print("Nhập số thứ nhất: ");
//        int a = sc.nextInt();  
//        System.out.print("Nhập số thứ hai: ");
//        int b = sc.nextInt();  
//        int divided = a / b;
//        int result = a - (divided * b);
//        System.out.println(result);
        //Bài 66
//         int sum = 1;
//        int ctr = 0;
//        int n = 0;
//        while (ctr < 100) {
//            n++;
//            if (n % 2 != 0) {
//                if (is_Prime(n)) {
//                    sum += n;
//                }
//            }
//            ctr++;
//        }
//        System.out.println("\nSum of the prime numbers till 100: " + sum);
//    }
//    public static boolean is_Prime(int n) {
//        for (int i = 3; i * i <= n; i += 2) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
        //Bài 67
//        Scanner sc = new Scanner(System.in);
//        String main_string = "Python 3.0";
//        String word = "Tutorial";
//        String result = main_string.substring(0, 7) + word + main_string.substring(6);
//        System.out.println(result);
//        
        //Bài 68
//        Scanner sc  = new Scanner(System.in);
//        String main_string = "Python 3.0";
//        String last_three_chars = main_string.substring(main_string.length() - 3);
//        System.out.println(last_three_chars + last_three_chars + last_three_chars + last_three_chars);
        //Bài 69
//        String main_string = "Python";
//        String substring = main_string.substring(0, main_string.length() / 2);
//        System.out.println(substring);
//        
        //Bài 70
        String str1 = "Python";
        String str2 = "Tutorial";
        if (str1.length() >= str2.length()) {
            System.out.println(str2 + str1 + str2);
        } else {
            System.out.println(str1 + str2 + str1);
        }
    }
}
