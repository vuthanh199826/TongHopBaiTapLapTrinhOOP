package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach ql = new QuanLySach();
        int choice;
        while (true) {
            display();
            System.out.println("Nhap lua chon vao day");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    TaiLieu obj;
                    System.out.println("Ban muon them loai tai lieu nao ???");
                    System.out.println("1.Sach  2.Tap chi  3.Bao");
                    int option = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap ma tai lieu");
                    int MATAILIEU = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap ten nha xuat ban");
                    String nhaXuatBan = sc.nextLine();
                    System.out.println("Nhap so ban phat hanh");
                    int soBanPhatHanh = sc.nextInt();
                    sc.nextLine();
                    switch (option) {
                        case 1:
                            System.out.println("Nhap ten tac gia");
                            String tenTacGia = sc.nextLine();
                            System.out.println("Nhap so trang");
                            int soTrang = sc.nextInt();
                            obj = new Sach(MATAILIEU, nhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
                            ql.addTaiLieu(obj);
                            break;
                        case 2:
                            System.out.println("Nhap so phat hanh");
                            int soPhatHanh = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Nhap thang phat hanh");
                            int thangPhatHanh = sc.nextInt();
                            obj = new TapChi(MATAILIEU, nhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh);
                            ql.addTaiLieu(obj);
                            break;
                        case 3:
                            System.out.println("Nhap ngay phat hanh");
                            String ngayPhatHanh = sc.nextLine();
                            obj = new Bao(MATAILIEU, nhaXuatBan, soBanPhatHanh, ngayPhatHanh);
                            ql.addTaiLieu(obj);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Nhap ma tai lieu muon xoa");
                    int maTaiLieu = sc.nextInt();
                    ql.deleteTailieu(maTaiLieu);
                    break;
                case 3:
                    ql.displayTaiLieu();
                    break;
                case 4:
                    System.out.println("Ban muon tim loai tai lieu nao ???");
                    System.out.println("1.Sach  2.Tap chi  3.Bao");
                    int type = sc.nextInt();
                    ql.searchTaiLieu(type);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    public static void display() {
        System.out.println("=============Menu===============");
        System.out.println("1.Them moi tai lieu");
        System.out.println("2.Xoa tai lieu theo MATAILIEU");
        System.out.println("3.Hien thi thong tin tai lieu");
        System.out.println("4.Tim kiem tai lieu theo loai");
        System.out.println("0.Thoat");
        System.out.println("================================");
    }
}
