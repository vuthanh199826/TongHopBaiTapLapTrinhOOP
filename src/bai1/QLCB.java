package bai1;

import java.util.Scanner;

public class QLCB {
    private CanBo[] canBo;
    private int index;

    public QLCB(int size) {
        this.canBo = new CanBo[size];
        this.index = 0;
    }

    public int getIndex() {
        return index;
    }


    public String searchCanBo(String name) {
        CanBo[]search = new CanBo[this.canBo.length];
        int indexOfSearch =0;
        boolean finded = false;
//        int indexOfSearch = -1;
        for (int i = 0; i < index; i++) {
            if (name.equals(canBo[i].getName())) {
                finded = true;
                search[indexOfSearch] = canBo[i];
                indexOfSearch++;
            }
        }
        String str = "";
        for (int i = 0; i < indexOfSearch; i++) {
            str += search[i].toString();
            System.out.println();
        }
        if (finded) {
            return str;
        } else {
            return "Không tìm thấy";
        }
    }

    public void addCanBo(String name, int age,String gender,String address) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn thêm cán bộ nào?");
        System.out.println("1.Công nhân   2.Kỹ Sư    3.Nhân Viên");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Nhập bậc");
                int bac = sc.nextInt();
                this.canBo[index] = new CongNhan(name, age, gender, address, bac);
                index++;
                break;
            case 2:
                System.out.println("Nhập ngành đào tạo");
                String nganhdaotao = sc.nextLine();
                this.canBo[index] = new KySu(name, age, gender, address, nganhdaotao);
                index++;
                break;
            case 3:
                System.out.println("Nhập công việc");
                String congviec = sc.nextLine();
                this.canBo[index] = new NhanVien(name, age, gender, address, congviec);
                index++;
                break;
        }
    }

    public void displayCanbo() {
        for (int i = 0; i < index; i++) {
            System.out.println(canBo[i]);
        }
    }
}

