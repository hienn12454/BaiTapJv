/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedbt;

/**
 *
 * @author TUF
 */
/**
 * @param the command line arguments
 */

//Bài 1
//    public class Computer {
//
//        class Processor {
//
//            public void displayDetails() {
//                System.out.println("Asus Tuf Gaming A15");
//                System.out.println("100km/h");
//            }
//        }
//
//        //Tạo 1 void để chứa cái displayDetails
//        // Lúc này void như là 1 cái biến để chứa biến trong processor
//        void show() {
//            Processor pro = new Processor();
//            pro.displayDetails();
//        }
//
//        public static void main(String[] args) {
//            // TODO code application logic here
//            Computer com = new Computer();
//            com.show();
//        }
//
////    }




//Bài 2
//public class University {
//
//    static class Department {
//
//        private String departmentName;
//        private String departmentSubject;
//
//        public Department(String departmentName, String departmentSubject) {
//            this.departmentName = "Nguyễn Minh Nam Hô";
//            this.departmentSubject = "Java Basic";
//        }
//        
//
//        public void displayinfo() {
//            System.out.println("Giáo viên: " + departmentName);
//            System.out.println("Môn: "+ departmentSubject);
//
//        }
//    }
//
//    public static void main(String[] args) {
//        University.Department test = new University.Department("Nam","Java");
//        test.displayinfo();
//    }
//}





//Bài 3
//public class Car {
//
//    public void startEngine() {
//        class Engine {
//
//            public void run() {
//                System.out.println("Engine is running");
//            }
//        }
//
//        Engine en = new Engine();
//        en.run();
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println("");
//        Car car = new Car();
//        car.startEngine();
//
//    }
//}



//Bài 4
//public class Main {
//
//    public static void main(String[] args) {
//        Greeting greeting = new Greeting() {
//            @Override
//            public void sayHello() {
//                System.out.println("Hello World");
//            }
//        } ;  //Tại vì nó là lớp vô danh nên phải ; để hoàn thành định nghĩa 
//    }
//}



//Bài 5   ------ Bài này không dùng chat t chế sao nó ra mẹ luôn giờ đọc lại cứ ngáo ngáo
//Cách 1 dùng getter setter 
// Library.Book để tham chiếu đến lớp Book trong lớp Library
//public class Library {
//
//    String libraryName;
//
//    public Library(String libraryName) {
//        this.libraryName = libraryName;
//    }
//
//    public String getLibraryName() {
//        return libraryName;
//    }
//
//    public void setLibraryName(String libraryName) {
//        this.libraryName = libraryName;
//    }
//
//    public class Book {
//        public void getLibraryName() {
//            System.out.print("Thư viện tên là: ");
//        }
//
//       
//    }
//    public static void main(String[] args) {
//       Library li = new Library("Hien");
//       Library.Book bo = li.new Book();
//       bo.getLibraryName();
//       li.setLibraryName("Hien");
//        System.out.println(li.getLibraryName());
//    }
//}



//Cách 2 là ở class Book không dùng void mà dùng hàm trả về String 
//Library.Book bo là tham chiếu đến lớp Book trong lớp Library
//public class Library {
//
//    String libraryName;
//
//    public Library(String libraryName) {
//        this.libraryName = libraryName;
//    }
//
//
//
//    public String getLibraryName() {
//        return libraryName;
//    }
//
//    public void setLibraryName(String libraryName) {
//        this.libraryName = "Nam Hô";
//    }
//    public class Book {
//
//        public String getLibraryName() {
//            System.out.println("Thư viện tên là: ");
//            return libraryName;
//        }
//    }
//    public static void main(String[] args) {
//        Library li = new Library("");
//        Library.Book bo = li.new Book();
//         li.setLibraryName("Hien");
//        System.out.println(bo.getLibraryName() );
//       
//    }
//}




//Bài 6
//public class MathUtil{
//    static class Calculator{
//        static int add(int a, int b){
//            return a + b;
//        }
//    }
//    public static void main(String[] args){
//        int show;
//    MathUtil math = new MathUtil();
//     show = MathUtil.Calculator.add(5, 9);
//        System.out.println(show);
//    }
//}






//Bài 7
//public class House {
//
//    double length = 2.0;
//    double width = 1.0;
//
//    public void calculateArea() {
//        class Room {
//
//            public double getArea() {
//                return length * width;
//            }
//
//            public Room() {
//            }
//        }
//        Room room = new Room();
//        double area;
//        area = room.getArea();
//        System.out.println("Diện tích" + area);
//    }
//
//    public static void main(String[] args) {
//        House Ho = new House();
//        Ho.calculateArea();
//    }
//
//}



//Bài 8
//Cách 1: tạo lớp ảo ngoài hàm main
//public class Cat{
//    Animal animal = new Animal(){
//        @Override
//        public void makeSound() {
//            System.out.println("Cat say Meow Meow");
//        }
//        
//    };
//    public static void main(String[] args){
//        Cat cat = new Cat();
//        cat.animal.makeSound();
//    }
//}
////Cách 2: tạo lớp ảo trong hàm main
//public class Cat{
//    public static void main (String[] args){
//        Animal animal = new Animal(){
//            @Override
//            public void makeSound() {
//                System.out.println("Cat kêu cặc cặc");
//            }
//            
//        }; // phải có ; khi tạo lớp ẩn danh 
//        animal.makeSound();
//    }
//}
//



//Bài 9
public class Person {

    class Address {

        String city;
        String state;

        public Address(String city, String state) {
            this.city ="HCM";
            this.state = "VIET NAM";
        }
        void Display(){
            System.out.println("city " + city);
            System.out.println("state "+ state);
        }

    }


public static void main(String[] args){
        Person per = new Person();
       Person.Address add = per.new Address("Nam", "Minh");
        add.Display();
    }
}
