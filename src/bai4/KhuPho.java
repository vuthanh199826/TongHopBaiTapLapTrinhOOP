package bai4;

import java.util.Scanner;

public class KhuPho {
    private HoDanCu [] ho ;
    int index;

    public KhuPho() {
        this.ho = new HoDanCu[10];
        this.index = 0;
    }
    public void addHoDanCu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thanh vien");
        int soThanhVien = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap so nha");
        String soNha = sc.nextLine();
        ho[index] = new HoDanCu(soThanhVien,soNha);
        ho[index].setThanhVien();
        index++;
    }
    public void displayHoDanCu(){

    }
}
