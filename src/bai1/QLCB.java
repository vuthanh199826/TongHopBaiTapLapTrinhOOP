package bai1;

import java.util.Scanner;

public class QLCB {
    private CanBo[] danhsach;
    private int index;

    public QLCB() {
        this.danhsach = new CanBo[10];
        this.index = 0;
    }
    public int getIndex() {
        return index;
    }

    public void searchCanBo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten muon tim");
        String name = sc.nextLine();
        boolean finded = false;
        int indexOfSearch = -1;
        for (int i = 0; i < index; i++) {
            if(name.equals(danhsach[i].getName())){
                finded = true;
                indexOfSearch = i;
                break;
            }
        }
        if(finded){
            System.out.println(danhsach[indexOfSearch]);
        }else {
            System.out.println("Không tìm thấy");
        }
    }

    public void addCanBo(int option) {
        Scanner sc = new Scanner(System.in);
        switch (option) {
            case 1:
                System.out.println("Nhap ten");
                String name = sc.nextLine();
                System.out.println("Nhap tuoi");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap gioi tinh");
                String gender = sc.nextLine();
                System.out.println("Nhap dia chi");
                String address = sc.nextLine();
                System.out.println("Nhap bac");
                int bac = sc.nextInt();
                this.danhsach[index] = new CongNhan(name, age, gender, address, bac);
                index++;
                break;
            case 2:
                System.out.println("Nhap ten");
                String name1 = sc.nextLine();
                System.out.println("Nhap tuoi");
                int age1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap gioi tinh");
                String gender1 = sc.nextLine();
                System.out.println("Nhap dia chi");
                String address1 = sc.nextLine();
                System.out.println("Nhap nganh dao tao");
                String nganhdaotao = sc.nextLine();
                this.danhsach[index] = new KySu(name1, age1, gender1, address1, nganhdaotao);
                index++;
                break;
            case 3:
                System.out.println("Nhap ten");
                String name2 = sc.nextLine();
                System.out.println("Nhap tuoi");
                int age2 = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap gioi tinh");
                String gender2 = sc.nextLine();
                System.out.println("Nhap dia chi");
                String address2 = sc.nextLine();
                System.out.println("Nhap cong viec");
                String congviec = sc.nextLine();
                this.danhsach[index] = new NhanVien(name2, age2, gender2, address2, congviec);
                index++;
                break;
        }
    }

    public void displayCanbo() {
        for (int i = 0; i < index; i++) {
            System.out.println(danhsach[i]);
        }
    }


}
