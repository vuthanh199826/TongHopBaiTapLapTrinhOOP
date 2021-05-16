package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach ql = new QuanLySach();
        int choice;
        while (true){
            display();
            System.out.println("Nhap lua chon vao day");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    ql.addTaiLieu();
                    break;
                case 2:
                    ql.deleteTailieu();
                    break;
                case 3:
                    ql.displayTaiLieu();
                    break;
                case 4:
                    ql.searchTaiLieu();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
    public static void display(){
        System.out.println("=============Menu===============");
        System.out.println("1.Them moi tai lieu");
        System.out.println("2.Xoa tai lieu theo MATAILIEU");
        System.out.println("3.Hien thi thong tin tai lieu");
        System.out.println("4.Tim kiem tai lieu theo loai");
        System.out.println("0.Thoat");
        System.out.println("================================");
    }
}
