package bai4;

import java.util.Scanner;

public class HoDanCu {
    private int soThanhVien;
    private String soNha;
    private Nguoi [] thanhVien;

    public HoDanCu(int soThanhVien, String soNha) {
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
        this.thanhVien = new Nguoi[soThanhVien];
    }
    public void getThanhVien(){
        for (int i = 0; i < soThanhVien; i++) {
            System.out.println(thanhVien[i]);
        }
    }

    public void setThanhVien(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < soThanhVien; i++) {
            System.out.println("Nhap ten thanh vien thu " + i);
            String name = sc.nextLine();
            System.out.println("Nhap tuoi thanh vien thu "+i);
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap cong viec thanh vien thu "+i);
            String job = sc.nextLine();
            System.out.println("Nhap CMND thanh vien thu " +i);
            int CMND = sc.nextInt();
            sc.nextLine();
            thanhVien[i] = new Nguoi(name,age,job,CMND);
        }

    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    @Override
    public String toString() {
        return "HoDanCu{" +
                "soThanhVien=" + soThanhVien +
                ", soNha='" + soNha + '\'' +
                '}';
    }
}
