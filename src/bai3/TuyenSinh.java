package bai3;

import java.util.Scanner;

public class TuyenSinh {
    ThiSinh[] danhsach = new ThiSinh[10];
    private int index = 0;

    public TuyenSinh() {
    }

    public void searchThiSinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap SBD thi sinh muon tim vao day");
        int soBaoDanh = sc.nextInt();
        boolean finded = false;
        for (int i = 0; i < index; i++) {
            if (soBaoDanh == danhsach[i].getSoBaoDanh()) {
                System.out.println(danhsach[i]);
                finded = true;
                break;
            }
        }
        if (!finded) {
            System.out.println("Khong tim thay !");
        }
    }

    public void displayThiSinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon hien thi loai thi sinh nao?");
        System.out.println("0. Tat ca  1.Khoi A  2.Khoi B  3.Khoi C");
        int choice = sc.nextInt();
        boolean has = false;
        switch (choice) {
            case 0:
                for (int i = 0; i < index; i++) {
                    System.out.println(danhsach[i]);
                }
                break;
            case 1:
                for (int i = 0; i < index; i++) {
                    if (danhsach[i] instanceof ThiSinhKhoiA) {
                        System.out.println(danhsach[i]);
                        has = true;
                    }
                }
                if (!has) {
                    System.out.println("Khong co thi sinh nao thi khoi A");
                }
                break;
            case 2:
                for (int i = 0; i < index; i++) {
                    if (danhsach[i] instanceof ThiSinhKhoiB) {
                        System.out.println(danhsach[i]);
                        has = true;
                    }
                }
                if (!has) {
                    System.out.println("Khong co thi sinh nao thi khoi B");
                }
                break;
            case 3:
                for (int i = 0; i < index; i++) {
                    if (danhsach[i] instanceof ThiSinhKhoiC) {
                        System.out.println(danhsach[i]);
                        has = true;
                    }
                }
                if (!has) {
                    System.out.println("Khong co thi sinh nao thi khoi C");
                }
                break;
            default:
                System.out.println("invalid");
        }
    }

    public void addThiSinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon them thi sinh khoi nao ?");
        System.out.println("1.Khoi A   2.Khoi B  3.Khoi C");
        int choice = sc.nextInt();
        System.out.println("Nhap so bao danh");
        int sobaodanh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho va ten");
        String name = sc.nextLine();
        System.out.println("Nhap dia chi");
        String address = sc.nextLine();
        System.out.println("Nhap muc uu tien");
        String mucUuTien = sc.nextLine();
        switch (choice) {
            case 1:
                danhsach[index] = new ThiSinhKhoiA(sobaodanh, name, address, mucUuTien);
                index++;
                break;
            case 2:
                danhsach[index] = new ThiSinhKhoiB(sobaodanh, name, address, mucUuTien);
                index++;
                break;
            case 3:
                danhsach[index] = new ThiSinhKhoiC(sobaodanh, name, address, mucUuTien);
                index++;
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
