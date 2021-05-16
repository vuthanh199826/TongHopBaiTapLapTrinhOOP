package bai5;

import java.util.Scanner;

public class KhachSan {
    final private int GIAPHONGLOAIA = 500;
    final private int GIAPHONGLOAIB = 300;
    final private int GIAPHONGLOAIC = 100;
    private final Nguoi[] phongA = new Nguoi[10];
    private final Nguoi[] phongB = new Nguoi[10];
    private final Nguoi[] phongC = new Nguoi[10];
    private int indexA = 0;
    private int indexB = 0;
    private int indexC = 0;

    public KhachSan() {
    }

    public void tinhTien(){
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Nhap so CMND ");
        int CMND = sc.nextInt();
        sc.nextLine();
        boolean finded = false;
        for (int i = 0; i < indexA; i++) {
            if(phongA[i].getCMND()==CMND){
                sum += phongA[i].getSoNgayThue()*GIAPHONGLOAIA;
                finded = true;
            }
        }
        for (int i = 0; i < indexB; i++) {
            if(phongB[i].getCMND()==CMND){
                sum += phongB[i].getSoNgayThue()*GIAPHONGLOAIB;
                finded = true;
            }
        }
        for (int i = 0; i < indexC; i++) {
            if(phongC[i].getCMND()==CMND){
                sum += phongC[i].getSoNgayThue()*GIAPHONGLOAIC;
                finded = true;
            }
        }
        if(finded){
            System.out.println("Tong tien phai tra la: " + sum + "$");
        }else {
            System.out.println("Khong tim thay CMND");
        }
    }

    public void displayPhong() {
        if(indexA>0){
        System.out.println("Danh sach phong loai A:");}
        for (int i = 0; i < indexA; i++) {
            System.out.println(phongA[i]);
            System.out.println("-------------------------------------");
        }
        if(indexB>0){
        System.out.println("Danh sach phong loai B:");}
        for (int i = 0; i < indexB; i++) {
            System.out.println(phongB[i]);
            System.out.println("-------------------------------------");
        }
        if(indexC>0){
        System.out.println("Danh sach phong loai C:");}
        for (int i = 0; i < indexC; i++) {
            System.out.println(phongC[i]);
            System.out.println("-------------------------------------");
        }
    }

    public void deleteKhach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap So CMND cua khach can xoa");
        int CMND = sc.nextInt();
        sc.nextLine();
        boolean finded = false;
        int indexOfDelete = -1;
        for (int i = 0; i < indexA; i++) {
            if(CMND==phongA[i].getCMND()){
                phongA[i]=null;
                indexOfDelete = i;
                finded = true;
            }
        }
        if(!finded){
            System.out.println("Khong tim thay tai phong loai A");
        }else {
            for (int i = indexOfDelete; i < indexA; i++) {
                phongA[i] = phongA[i + 1];
                phongA[i + 1] = null;
            }
            indexA--;
        }
        finded = false;
        indexOfDelete = -1;
        for (int i = 0; i < indexB; i++) {
            if(CMND==phongB[i].getCMND()){
                phongB[i]=null;
                indexOfDelete = i;
                finded = true;
            }
        }
        if(!finded){
            System.out.println("Khong tim thay tai phong loai B");
        }else {
            for (int i = indexOfDelete; i < indexB; i++) {
                phongB[i] = phongB[i + 1];
                phongB[i + 1] = null;
            }
            indexB--;
        }
        finded = false;
        indexOfDelete = -1;
        for (int i = 0; i < indexC; i++) {
            if(CMND==phongC[i].getCMND()){
                phongC[i]=null;
                indexOfDelete = i;
                finded = true;
            }
        }
        if(!finded){
            System.out.println("Khong tim thay tai phong loai C");
        }else {
            for (int i = indexOfDelete; i < indexC; i++) {
                phongC[i] = phongC[i + 1];
                phongC[i + 1] = null;
            }
            indexC--;
        }
    }

    public void addKhach() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap CMND");
        int CMND = sc.nextInt();
        sc.nextLine();
        System.out.println("Ban muon chon phong loai nao ???");
        System.out.println("1. LoaiA  2.LoaiB  3.LoaiC");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("Ban muon thue bao nhieu ngay???");
        int soNgay = sc.nextInt();
        switch (choice) {
            case 1:
                phongA[indexA] = new Nguoi(name, age, CMND,soNgay);
                indexA++;
                break;
            case 2:
                phongB[indexB] = new Nguoi(name, age, CMND,soNgay);
                indexB++;
                break;
            case 3:
                phongC[indexC] = new Nguoi(name, age, CMND,soNgay);
                indexC++;
                break;
        }
    }


    public int getGIAPHONGLOAIA() {
        return GIAPHONGLOAIA;
    }

    public int getGIAPHONGLOAIB() {
        return GIAPHONGLOAIB;
    }

    public int getGIAPHONGLOAIC() {
        return GIAPHONGLOAIC;
    }
}
