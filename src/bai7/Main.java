package bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CBGV ql =new CBGV();
        int choice;
        while (true){
            displayMenu();
            System.out.println("Nhap lua chon");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Nhap ten");
                    String name = sc.nextLine();
                    System.out.println("Nhap tuoi");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap dia chi");
                    String address = sc.nextLine();
                    System.out.println("Nhap ma giao vien");
                    int codeMember = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap luong cung");
                    double luongCung = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Nhap luong thuong");
                    double luongThuong = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Nhap tien phat");
                    double tienPhat = sc.nextDouble();
                    sc.nextLine();
                    ql.addGiaoVien(name,age,address,codeMember,luongCung,luongThuong,tienPhat);
                    break;
                case 2:
                    System.out.println("Nhap ma giao vien muon xoa");
                    codeMember =sc.nextInt();
                    ql.deleteGiaoVien(codeMember);
                    break;
                case 3:
                    ql.displayGiaoVien();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
    public static void displayMenu(){
        System.out.println("MENU");
        System.out.println("1. Them moi giao vien");
        System.out.println("2. Xoa mot giao vien");
        System.out.println("3. Hien thi danh sach giao vien");
        System.out.println("0. Thoat");
    }
}
