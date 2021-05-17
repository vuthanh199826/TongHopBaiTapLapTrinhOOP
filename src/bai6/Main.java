package bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School obj = new School();
        int choice = -1;
        while (choice!=0){
            displayMenu();
            System.out.println("Nhap lua chon vao day");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Nhap ten hoc sinh");
                    String name = sc.nextLine();
                    System.out.println("Nhap tuoi");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap dia chi");
                    String address = sc.nextLine();
                    System.out.println("Nhap lop hoc");
                    int classmate = sc.nextInt();
                    sc.nextLine();
                    obj.addNewStudent(name,age,address,classmate);
                    break;
                case 2:
                    System.out.println("Nhap do tuoi hoc sinh muon in");
                    age = sc.nextInt();
                    sc.nextLine();
                    obj.displayStudents20YearOld(age);
                    break;
                case 3:
                    System.out.println("Nhap tuoi");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap dia chi");
                    address = sc.nextLine();
                    int sum = obj.sumOfStudents(age,address);
                    System.out.println("Tong cac hoc sinh co tuoi "+age+ " que o "+address+ " la "+sum );
                    break;

            }
        }
    }

    public static void displayMenu(){
        System.out.println("======================MENU========================");
        System.out.println("1. Them hoc sinh moi");
        System.out.println("2. Hien thi cac hoc sinh 20 tuoi");
        System.out.println("3. Tinh so luong hoc sinh theo tuoi va que quan");
        System.out.println("0. Thoat");
        System.out.println("==================================================");
    }

}
