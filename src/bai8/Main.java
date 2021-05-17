package bai8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerCard obj = new ManagerCard();
        int choice;
        while (true){
            displayMenu();
            System.out.println("Nhap lua chon");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Nhap ten");
                    String name = sc.nextLine();
                    System.out.println("Nhap tuoi");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap lop");
                    int classmate = sc.nextInt();
                    sc.nextLine();
                    Student student = new Student(name,age,classmate);
                    System.out.println("nhap id ");
                    String id = sc.nextLine();
                    System.out.println("Nhap ngay muon");
                    int borrowDate = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap ngay tra");
                    int paymentDate = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap ID sach");
                    int bookID = sc.nextInt();
                    sc.nextLine();
                    Card card = new Card(student,id,borrowDate,paymentDate,bookID);
                    obj.addCard(card);
                    break;
                case 2:
                    System.out.println("Nhap ID muon xoa");
                    id = sc.nextLine();
                    obj.deleteCard(id);
                    break;
                case 3:
                    obj.displayCards();
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
    public static void displayMenu(){
        System.out.println("Menu");
        System.out.println("1. Them the moi");
        System.out.println("2. Xoa the theo id");
        System.out.println("3. Hien thi danh sach the");
        System.out.println("0. Thoat");
    }
}
