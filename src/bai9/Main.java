package bai9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageBienLai ql = new ManageBienLai();
        int choice;
        while (true) {
            displayMenu();
            System.out.println("Nhap lua chon");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhap ten khach hang moi");
                    String name = sc.nextLine();
                    System.out.println("Nhap so nha");
                    int soNha = sc.nextInt();
                    sc.nextLine();
                    KhachHang khachHang = new KhachHang(name, soNha);
                    BienLai bienLai = new BienLai(khachHang);
                    ql.addBienLai(bienLai);
                    break;
                case 2:
                    ql.displayAllBienLai();
                    break;
                case 3:
                    System.out.println("Nhap ma so cong to dien vao day");
                    int maSoCongToDien = sc.nextInt();
                    if (ql.searchViTri(maSoCongToDien) >= 0) {
                        System.out.println(ql.getBienLai(maSoCongToDien));
                        System.out.println("Tong tien phai tra: " + ql.getBienLai(maSoCongToDien).tinhTienPhaiTra());
                    } else {
                        System.out.println("Invalid");
                    }
                    break;
                case 4:
                    System.out.println("Nhap ma so cong to dien vao day");
                    maSoCongToDien = sc.nextInt();
                    sc.nextLine();
                    if (ql.searchViTri(maSoCongToDien) >= 0) {
                        BienLai obj = ql.getBienLai(maSoCongToDien);
                        System.out.println("Ban muon thay doi thong tin nao ???");
                        System.out.println("1. Thay doi so dien cu va moi");
                        System.out.println("2. Thay doi thong tin ca nhan khach hang");
                        int option = sc.nextInt();
                        sc.nextLine();
                        switch (option) {
                            case 1:
                                System.out.println("Nhap so dien cu vao day");
                                int soDienCu = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Nhap so dien moi vao day");
                                int soDienMoi = sc.nextInt();
                                sc.nextLine();
                                obj.setSoDienMoi(soDienMoi);
                                obj.setSoDienCu(soDienCu);
                                ql.fixBienLai(maSoCongToDien, obj);
                                break;
                            case 2:
                                System.out.println("Nhap ten moi vao day");
                                String newName = sc.nextLine();
                                System.out.println("Nhap so nha moi vao day");
                                int newSoNha = sc.nextInt();
                                sc.nextLine();
                                obj.setKhachHang(newName, newSoNha);
                                ql.fixBienLai(maSoCongToDien, obj);
                                break;
                            default:
                                System.out.println("Invalid");
                        }
                    } else {
                        System.out.println("Invalid");
                    }
                    break;
                case 0:
                    System.exit(0);
            }

        }
    }

    public static void displayMenu() {
        System.out.println("Menu");
        System.out.println("1.Them Bien lai moi");
        System.out.println("2.Hien thi tat ca bien lai");
        System.out.println("3.Tinh tien dien theo ma cong to dien");
        System.out.println("4.Sua thong tin bien lai");
        System.out.println("0. Thoat");
    }

}
