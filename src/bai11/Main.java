package bai11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SoPhuc obj = new SoPhuc();
        int choice;
        while (true){
            displayMenu();
            System.out.println("Nhap lua chon vao day");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    obj.input();
                    break;
                case 2:
                    System.out.println(obj.displaySoPhuc());
                    break;
                case 3:
                    System.out.println(obj.sum());
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
    public static void displayMenu(){
        System.out.println("MenU");
        System.out.println("1.Nhap so phuc");
        System.out.println("2.Hien thi so phuc");
        System.out.println("3.Tinh tong 2 so phuc");
        System.out.println("0. Thoat");
    }
}
