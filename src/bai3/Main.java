package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh obj = new TuyenSinh();
        int option;
        while (true) {
            display();
            System.out.println("Nhap lua chon vao day");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    obj.addThiSinh();
                    break;
                case 2:
                    obj.displayThiSinh();
                    break;
                case 3:
                    obj.searchThiSinh();
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }

    public static void display() {
        System.out.println("Menu");
        System.out.println("1. Them moi thi sinh");
        System.out.println("2. Hien thi thong tin thi sinh va khoi thi");
        System.out.println("3. Tim kiem theo SBD");
        System.out.println("0. Thoat");
    }
}
