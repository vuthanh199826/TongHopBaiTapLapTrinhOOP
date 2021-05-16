package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       KhuPho obj = new KhuPho();
       int choice;
       while (true){
           display();
           System.out.println("Nhap lua chon");
           choice = sc.nextInt();
           switch (choice){
               case 1:
                   obj.addHoDanCu();
                   break;
               case 2:
                   obj.displayHoDanCu();
                   break;
               case 3:
                   obj.searchHoDanCu();
                   break;
               case 0:
                   System.exit(0);
           }
       }

    }
    public static void display(){
        System.out.println("Menu");
        System.out.println("1. Them ho dan cu moi");
        System.out.println("2. Hien thi ho dan cu");
        System.out.println("3. Tim ho dan cu theo so thanh vien");
        System.out.println("0. Thoat");
    }
}
