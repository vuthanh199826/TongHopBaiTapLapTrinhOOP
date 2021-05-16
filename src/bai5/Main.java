package bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhachSan ks = new KhachSan();
        int choice;
        while (true){
            display();
            System.out.print(" Nhap lua chon ");
            choice = sc.nextInt();
            System.out.println("=============================================");
            switch (choice){
                case 1:
                    ks.addKhach();
                    break;
                case 2:
                    ks.displayPhong();
                    break;
                case 3:
                    ks.deleteKhach();
                    break;
                case 4:
                    ks.tinhTien();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
    public static void display(){
        System.out.println("======================MENU===================");
        System.out.println("1. Them khach hang moi");
        System.out.println("2. Hien thi danh sach khach hang");
        System.out.println("3. Xoa khach hang theo CMND");
        System.out.println("4. Tinh tien cho khach theo CMND");
        System.out.println("0. Thoat");
        System.out.println("=============================================");
    }
}
