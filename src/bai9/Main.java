package bai9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ManageBienLai ql = new  ManageBienLai();
        int choice;
        while (true){
            System.out.println("Nhap lua chon");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Nhap ten khach hang moi");
                    String name = sc.nextLine();
                    System.out.println("Nhap so nha");
                    int soNha = sc.nextInt();
                    sc.nextLine();
                    KhachHang khachHang = new KhachHang(name,soNha);
                    BienLai bienLai = new BienLai(khachHang);
                    ql.addBienLai(bienLai);
                    break;
                case 2:
                    ql.displayBienLai();
                    break;




            }
        }
    }

}
