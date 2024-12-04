/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadlinet2;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author TUF
 */
public class DeadlineT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập số");
//        int n = sc.nextInt();
//        if (n>0){
//            System.out.println("Số dương");
//        }else{
//            System.out.println("Số âm");
//        }

//        System.out.print("Input a: ");
//            double a = sc.nextDouble();
//            System.out.print("Input b: ");
//            double b = sc.nextDouble();
//            System.out.print("Input c: ");
//            double c = sc.nextDouble();
//
//            double result = b * b - 4.0 * a * c;
//
//            if (result > 0.0) {
//                double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
//                double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
//                System.out.println("The roots are " + r1 + " and " + r2);
//            } else if (result == 0.0) {
//                double r1 = -b / (2.0 * a);
//                System.out.println("The root is " + r1);
//            } else {
//                System.out.println("The equation has no real roots.");
//            }
//        System.out.print("Input the 1st number: ");
//        int num1 = sc.nextInt();
//
//        System.out.print("Input the 2nd number: ");
//        int num2 = sc.nextInt();
//
//        System.out.print("Input the 3rd number: ");
//        int num3 = sc.nextInt();
//
//        if (num1 > num2) {
//            if (num1 > num3) {
//                System.out.println("The greatest: " + num1);
//            }
//        }
//
//        if (num2 > num1) {
//            if (num2 > num3) {
//                System.out.println("The greatest: " + num2);
//            }
//        }
//
//        if (num3 > num1) {
//            if (num3 > num2) {
//                System.out.println("The greatest: " + num3);
//            }
//        }
//        System.out.println("Input");
//        int input = sc.nextInt();
//         if (input > 0)
//        {
//            if (input < 1)
//            {
//                System.out.println("Positive small number");
//            }
//            else if (input > 1000000)
//            {
//                System.out.println("Positive large number");
//            }
//            else
//            {
//                System.out.println("Positive number");
//            }
//        }
//        else if (input < 0)
//        {
//            if (Math.abs(input) < 1)
//            {
//                System.out.println("Negative small number");
//            }
//            else if (Math.abs(input) > 1000000)
//            {
//                System.out.println("Negative large number");
//            }
//            else
//            {
//                System.out.println("Negative number");
//            }
//        }
//        else
//        {
//            System.out.println("Zero");
//        }
//        System.out.println("nhập thứ tự trong tuần");
//        int day = sc.nextInt();
//        while(true){
//            switch(day){
//                case 1: 
//                    System.out.println("Monday");
//                    break;
//                case 2:
//                    System.out.println("Tuesday");
//                    break;
//                case 3:
//                    System.out.println("Wednesday");
//                    break;
//                case 4:
//                    System.out.println("Thursday");
//                    break;
//                case 5:
//                    System.out.println("Friday");
//                    break;
//                case 6:
//                    System.out.println("Saturday");
//                    break;
//                case 7:
//                    System.out.println("Sunday");
//                    break;
//            }
//        }
//        System.out.println("Nhập số thứ nhất  vào ");
//        int n = sc.nextInt();
//        System.out.println("Nhập số thứ  hai vào");
//        int m = sc.nextInt();
//        
//        n = Math.round(n*1000);
//        n = n/1000;
//        m = Math.round(m*1000);
//        m = m/1000;
//        if( n == m){
//            System.out.println(" 2 số Giống nhau");
//        }else {
//            System.out.println("2 số khác nhau  ");
//        }
//        System.out.println("Nhập ngày tháng năm");
//        int month = sc.nextInt();
//        int year = sc.nextInt();
//        while (true) {
//            switch (month) {
//                case 1:
//                    System.out.println("31 days");
//                    break;
//                case 2:
//
//                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
//                        System.out.println("29 days");
//                    } else {
//                        System.out.println("28 days");
//                    }
//                    break;
//                case 3:
//                    System.out.println("31 days");
//                    break;
//                case 4:
//                    System.out.println("30 days");
//                    break;
//                case 5:
//                    System.out.println("31 days");
//                case 6:
//                    System.out.println("30 days");
//                    break;
//                case 7:
//                    System.out.println("31 days");
//                    break;
//                case 8:
//                    System.out.println("31 days");
//                    break;
//                case 9:
//                    System.out.println("30 days");
//                    break;
//                case 10:
//                    System.out.println("31 days");
//                    break;
//                case 11:
//                    System.out.println("30 days");
//                    break;
//                case 12:
//                    System.out.println("30 days");
//            }
//        }
// Đọc chưa hiểu cách làm lắm
//        System.out.println("Nhập 1 chuỗi kí tự ");
//        String str = sc.nextLine();
//        System.out.println(str);
//        
//        System.out.println(str.toLowerCase());
//        
//        int year = sc.nextInt();
//        if (year % 4 != 0) {
//            System.out.println("Năm thường");
//        } else {
//            System.out.println("Nhuận");
//        }
//        for (int i =1; i<=10 ; i++){
//            System.out.println(i);
//        }
//        System.out.println("Nhập n số tự nhiên");
//        long n = sc.nextLong();
//        long sum;
//        sum=0;
//        for (int i =1; i<=n; i++){
//            sum = sum + i;
//        }
//        System.out.println("tổng từ 1->n " + sum);
//       int n = sc.nextInt();
//       int sum =0;
//        double avg;
//        {
//            System.out.println("Nhập vào 5 số để test : ");
//        }
//        for (int i = 0; i < 5; i++) {
//            sum += n;
//        }
//        avg = sum / 5;
//        System.out.println("Tổng của 5 số : " + sum + "và trung bình là : " + avg);
//        int n =sc.nextInt();
//        int tri = 0;
//        for(int i =1; i<=n; i++){
//            tri = i*i*i;
//            System.out.println("số là " + i+ " và lập phương là " + tri);
//        }
//        int n = sc.nextInt();
//        int a = 0;
//        for (int i = 0 ; i<= n; i++){
//            a = i * n;
//            System.out.println(i + " " +"x " + n + " =" + a );
//        }
//        int sum=0;
//        System.out.print("Nhập 1 số: ");
//        int n = sc.nextInt();
//        {
//            System.out.println("số lẻ là :");
//            for (int i = 1; i <= n; i++) {
//                System.out.println(2 * i - 1);
//                sum += 2 * i - 1;
//            }
//            System.out.println("Tổng của  " + n + " số lẻ là : " + sum);
//        }
//        System.out.print("Nhập số hàng cho tam giác : ");
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println("");
//        }




//            System.out.print("Nhập n đi nào bạn ơi  : ");
//           int n = sc.nextInt();
//            for (int i = 1; i <= n; i++) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print(i);
//                }
//                System.out.println("");
//            }



//        System.out.print("Nhập số hàng : ");
//        int n = sc.nextInt();
//        int k =1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(k++);
//            }
//            System.out.println("");
//        }

        

//        System.out.print("Nhập số hàng cho kim tự tháp");
//        int  n = sc.nextInt();
//        int kimtuthap;
//        kimtuthap = n+4-1;
//        for(int i =1; i<= n; i++){
//            for(int x = kimtuthap; x!=0; x--){
//                System.out.print("");
//            }
//            for(int j =1; j<= i; j++){
//                System.out.print(i+"");
//            }
//            System.out.println();
//            kimtuthap--;
//        }
        
//        System.out.println("Nhập 1 số vào đi nào");
//        int so = sc.nextInt();
//        if(so > 0){
//            System.out.println("Số dương");
//        }else if(so == 0){
//            System.out.println("zero");
//        }else{
//            System.out.println("số âm");
//        }



        System.out.println("Nhập số n vào");
            if (sc.hasNextLong())
        {

            long n = sc.nextLong();

            if (n < 0)
            {
                n *= -1;
            }
            if (n >= 10000000000L)
            {
                System.out.println("số nhỏ hơn 10 tỷ là: ");
            }
            else
            {
                int digits = 1;
                if (n >= 10 && n < 100)
                {
                    digits = 2;
                }
                else if (n >= 100 && n < 1000)
                {
                    digits = 3;
                }
                else if (n >= 1000 && n < 10000)
                {
                    digits = 4;
                }
                else if (n >= 10000 && n < 100000)
                {
                    digits = 5;
                }
                else if (n >= 100000 && n < 1000000)
                {
                    digits = 6;
                }
                else if (n >= 1000000 && n < 10000000)
                {
                    digits = 7;
                }
                else if (n >= 10000000 && n < 100000000)
                {
                    digits = 8;
                }
                else if (n >= 100000000 && n < 1000000000)
                {
                    digits = 9;
                }
                else if (n >= 1000000000 && n < 10000000000L)
                {
                    digits = 10;
                }
                System.out.println("Số lượng chữ số có trong đó là: " + digits);
            }
        }
        else
        {
            System.out.println("Số input ko hợp lệ");

    }
}
}
