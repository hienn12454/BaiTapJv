/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadlinet2.pkg2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author TUF
 */
public class DeadlineT22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
//        System.out.println("Nhập 2 số tự nhiên vào");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if(a>b){
//            System.out.println("Số max là " + a);
//        }else{
//            System.out.println("Số max là: " + b);
//        }


        
//        System.out.println("Nhập 2 số tự nhiên vào");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if(a>b && a>c){
//            System.out.println("Số max là " + a);
//        }else if(b>a && b>c){
//            System.out.println("Số max là: " + b);
//        }else{
//            System.out.println("Số max là: "+ c);
//        }


//        System.out.println("Nhập số n vào để xét");
//        int n =sc.nextInt();
//        if(n>0){
//            System.out.println("positive");
//        }else if(n<0){
//            System.out.println("negative");
//        }else if(n==0){
//            System.out.println("zero");
//        }


//        System.out.println("Nhập n đi nào mày");
//        int n = sc.nextInt();
//        if(n<= 11 && n>=5){
//            System.out.println("OK");
//        }else{
//            System.out.println("Not OKE");
//        }
        
//        
//        System.out.println("Nhập n đi bạn");
//        int n = sc.nextInt();
//        if(n / 2 == 0){
//            System.out.println("even number");
//        }else{
//            System.out.println("odd number");
//        }



//        System.out.println("Nhập year");
//        int year = sc.nextInt();
//        if(year / 4 == 0){
//            System.out.println("Năm nhuận");
//    }else{
//            System.out.println("Không phải năm nhuận");
//        }


//        System.out.println("Nhập 1 kí tự");
//        char str = sc.next().charAt(0);
//        if(str >= 'a' && str<='z' || str>='A' && str<='Z'){
//            System.out.println("Alphabet");
//        }else{
//            System.out.println("Not Alphabet");
//        }

        

//        System.out.println("Nhập 1 char");
//        char ch = sc.next().charAt(0);
//        if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch =='u'){
//            System.out.println("Vowel");
//        }else{
//            System.out.println("Consonent");
//        }


//        char ch = sc.next().charAt(0);
//        if(ch >= 'a'&& ch<='z')
//        {
//            System.out.println("đây là chữ viết thường");
//        }else{
//            System.out.println("Đây là chữ in");
//        }


//        System.out.println("Nhập kí tự");
//        char ch = sc.next().charAt(0);
//        if(ch>='a' && ch<='z' || ch<='A' && ch<='Z'){
//            System.out.println("Alphabet");
//        }else if(ch < 9 && ch>0){
//            System.out.println("Number");
//        }else{
//            System.out.println("Special character");
//        }


//        System.out.println("input week");
//        int week = sc.nextInt();
//
//        if (week == 1) {
//            System.out.println("This is a Sunday");
//        } else if (week == 2) {
//            System.out.println("This is a Monday");
//        } else if (week == 3) {
//            System.out.println("This is a Tuesday");
//        } else if (week == 4) {
//            System.out.println("This is a Wednesday");
//        } else if (week == 5) {
//            System.out.println("This is a Thursday");
//        } else if (week == 6) {
//            System.out.println("This is a Friday");
//        } else if (week == 7) {
//            System.out.println("This is a Saturday");
//        }


//        System.out.print("Nhập n) :");
//        int n = sc.nextInt();
//        if (n== 1) {
//            System.out.println("This is a January");
//        } else if (n == 2) {
//            System.out.println("This is a February");
//        } else if (n== 3) {
//            System.out.println("This is a March");
//        } else if (n== 4) {
//            System.out.println("This is a April");
//        } else if (n== 5) {
//            System.out.println("This is a May");
//        } else if (n== 6) {
//            System.out.println("This is a June");
//        } else if (n== 7) {
//            System.out.println("This is a July");
//        } else if (n== 8) {
//            System.out.println("This is a August");
//        } else if (n== 9) {
//            System.out.println("This is a September");
//        } else if (n== 10) {
//            System.out.println("This is a October");
//        } else if (n== 11) {
//            System.out.println("This is a November");
//        } else if (n == 12) {
//            System.out.println("This is a December");
//        }


//
//        System.out.println("nhập 3 góc :");
//        int goc1 = sc.nextInt();
//        int goc2 = sc.nextInt();
//        int goc3 = sc.nextInt();
//        int sum = goc1 + goc2 + goc3;
//        if (sum == 180 && goc1 > 0 && goc2 > 0 && goc3 > 0) {
//            System.out.println("Đây là tam giác");
//        } else {
//            System.out.println("Đây ko phải tam giác");
//    }



//        System.out.println("Nhập 3 cạnh");
//        int side1 = sc.nextInt();
//        int side2 = sc.nextInt();
//        int side3 = sc.nextInt();
//        if(side1 + side2 > side3){
//            System.out.println("Hợp lệ");
//        }else if(side2 + side3 >side1){
//            System.out.println("Hợp lệ");
//        }else if(side3 + side1 > side2){
//            System.out.println("Hợp lệ");
//        }else{
//            System.out.println("Không hợp lệ ");
//        }
        
        
//        int side1 = sc.nextInt();
//        int side2 = sc.nextInt();
//        int side3 = sc.nextInt();
//        if (side1 == side2 && side2 == side3) {
//            System.out.println("Tam giác đều.");
//        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
//            System.out.println("Tam giác cân");
//        } else {
//            System.out.println("Tam giác.");
//        }


//        System.out.println("Nhập a b c của pt bậc II");
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//        double delta;
//        double x;
//        double y;
//        delta = b*b - 4*a*c;
//        if(delta>0){
//            x = (-b + sqrt(delta))/2*a;
//            y = (-b - sqrt(delta))/2*a;
//        }else if(delta==0){
//            x = -b/2*a;
//            y = x;
//        }else{
//            System.out.println("Vô nghiệm");
//        }

        
//        System.out.println("Nhập giá bán");
//        int sell = sc.nextInt();
//        System.out.println("Nhập giá mua về");
//        int buy = sc.nextInt();
//        if(buy < sell){
//            System.out.println("Lời");
//        }else{
//            System.out.println("Lỗ");
//        }



//        System.out.println("Nhập điểm Toán");
//        double toan = sc.nextDouble();
//        System.out.println("Lý");
//        double ly = sc.nextDouble();
//        System.out.println("Hóa");
//        double hoa = sc.nextDouble();
//        System.out.println("Sinh");
//        double sinh = sc.nextDouble();
//        System.out.println("Tin");
//        double tin = sc.nextDouble();
//         double avg= 0;
//         avg = (toan + ly + hoa + sinh + tin)/5;
//         System.out.println("AVG " +avg);
//         if(avg >= 9){
//             System.out.println("A");
//         }else if(avg>=8 && avg<9){
//             System.out.println("B");
//         }else if(avg>=7 && avg<8){
//             System.out.println("C");
//         }else if(avg>=6 && avg<7){
//             System.out.println("D");
//         }




//        System.out.println("Nhập lương ban đầu");
//        int salary = sc.nextInt();
//        float hra, da, tot;
//        if (salary <= 10000) {
//            hra = salary * 0.2f;
//            da = salary * 0.8f;
//        } else if (salary <= 20000) {
//            hra = salary * 0.25f;
//            da = salary * 0.9f;
//        } else {
//            hra = salary * 0.3f;
//            da = salary * 0.95f;
//        }
//        System.out.println("Tổng lương : " + (salary + hra + da));


        
//        System.out.print("Nhập số unit đã dùng : ");
//        int unit = sc.nextInt();
//        double KWh;
//        double thue;
//        double Tong;
//        if (unit <= 50) {
//            KWh = unit * 0.50f;
//        } else if (unit <= 150) {
//            KWh = unit * 0.75f;
//        } else if (unit <= 250) {
//            KWh = unit * 1.20f;
//        } else {
//            KWh = unit * 1.50f;
//        }
//
//        thue = KWh * 0.2f;
//        Tong = KWh + thue;
//        System.out.println("Tiền phải trả là : " + Tong);




//        System.out.println("Nhập tên mặt hàng muốn mua");
//        String product = sc.next();
//        System.out.println("Nhập số lượng");
//        int items = sc.nextInt();
//        System.out.println("Nhập gía 1 món");
//        int price = sc.nextInt();
//        if(items >= 100){
//            System.out.println("Số tiền phải trả là" + (price-price*10/100));
//        }else{
//            System.out.println("Số tiền phải trả là: "+ price);
//        }



        System.out.print("Năm hiện tại : ");
        int present = sc.nextInt();
        System.out.print("Năm tham gia : ");
        int join = sc.nextInt();
        int count = present - join;
        if (count > 3) {
            System.out.println("Bonus of Rs : 2500 /-");
        } else {
            System.out.println("No Bonus");
        }
      }
}
