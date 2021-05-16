package bai2;

import java.util.Scanner;

public class QuanLySach {
    private TaiLieu[] danhsach;
    private int index;

    public QuanLySach() {
        this.danhsach = new TaiLieu[10];
        this.index = 0;
    }
    public void deleteTailieu(){
        Scanner sc = new Scanner(System.in);
        int indexOfXoa = -1;
        System.out.println("Nhap ma tai lieu muon xoa");
        int maTaiLieu = sc.nextInt();
        for (int i = 0; i < index; i++) {
            if(maTaiLieu==danhsach[i].getMATAILIEU()){
                indexOfXoa = i;
                break;
            }
        }
        if(indexOfXoa >= 0) {
            danhsach[indexOfXoa] = null;
            for (int i = indexOfXoa; i < index; i++) {
                danhsach[i] = danhsach[i+1];
                danhsach[i+1] = null;
            }
            this.index = this.index - 1;
        }else {
            System.out.println("Khong tim thay ma tai lieu nay");
        }
    }

    public void displayTaiLieu() {
        for (int i = 0; i < index; i++) {
            System.out.println(danhsach[i]);
        }
    }

    public void searchTaiLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon tim loai tai lieu nao ???");
        System.out.println("1.Sach  2.Tap chi  3.Bao");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                boolean hasSach = false;
                for (int i = 0; i < index; i++) {
                    if (danhsach[i] instanceof Sach) {
                        System.out.println(danhsach[i]);
                        hasSach = true;
                    }
                }
                if (!hasSach) {
                    System.out.println("Khong tim thay sach");
                }
                break;
            case 2:
                boolean hasTapChi = false;
                for (int i = 0; i < index; i++) {
                    if (danhsach[i] instanceof TapChi) {
                        System.out.println(danhsach[i]);
                        hasTapChi = true;
                    }
                }
                if (!hasTapChi) {
                    System.out.println("Khong tim thay tap chi");
                }
                break;
            case 3:
                boolean hasBao = false;
                for (int i = 0; i < index; i++) {
                    if (danhsach[i] instanceof Bao) {
                        System.out.println(danhsach[i]);
                        hasBao = true;
                    }
                }
                if (!hasBao) {
                    System.out.println("Khong tim thay bao");
                }
                break;
        }
    }

    public void addTaiLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon them loai tai lieu nao ???");
        System.out.println("1.Sach  2.Tap chi  3.Bao");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Nhap ma tai lieu");
                int MATAILIEU = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap ten nha xuat ban");
                String nhaXuatBan = sc.nextLine();
                System.out.println("Nhap so ban phat hanh");
                int soBanPhatHanh = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap ten tac gia");
                String tenTacGia = sc.nextLine();
                System.out.println("Nhap so trang");
                int soTrang = sc.nextInt();
                danhsach[index] = new Sach(MATAILIEU, nhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
                index++;
                break;
            case 2:
                System.out.println("Nhap ma tai lieu");
                int MATAILIEU1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap ten nha xuat ban");
                String nhaXuatBan1 = sc.nextLine();
                System.out.println("Nhap so ban phat hanh");
                int soBanPhatHanh1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap so phat hanh");
                int soPhatHanh = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap thang phat hanh");
                int thangPhatHanh = sc.nextInt();
                danhsach[index] = new TapChi(MATAILIEU1, nhaXuatBan1, soBanPhatHanh1, soPhatHanh, thangPhatHanh);
                index++;
                break;
            case 3:
                System.out.println("Nhap ma tai lieu");
                int MATAILIEU2 = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap ten nha xuat ban");
                String nhaXuatBan2 = sc.nextLine();
                System.out.println("Nhap so ban phat hanh");
                int soBanPhatHanh2 = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap ngay phat hanh");
                String ngayPhatHanh = sc.nextLine();
                danhsach[index] = new Bao(MATAILIEU2, nhaXuatBan2, soBanPhatHanh2, ngayPhatHanh);
                index++;
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
