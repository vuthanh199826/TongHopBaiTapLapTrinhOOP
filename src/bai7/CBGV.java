package bai7;

public class CBGV {
    private final Person[] giaoVien;
    private int index;

    public CBGV() {
        giaoVien = new Person[10];
        this.index = 0;
    }

    public void deleteGiaoVien(int codeMember) {
        int indexOfDelete = -1;
        boolean finded = false;
        for (int i = 0; i < index; i++) {
            if (giaoVien[i].getCodeMember() == codeMember) {
                finded = true;
                indexOfDelete = i;
                break;
            }
        }
        if (finded) {
            for (int i = indexOfDelete; i < index; i++) {
                giaoVien[i] = giaoVien[i + 1];
                giaoVien[i + 1] = null;
            }
            System.out.println("Success!");
            index--;
        } else {
            System.out.println("Invalid");
        }
    }

    public void addGiaoVien(String name, int age, String address, int codeMember, double luongCung, double luongThuong, double tienPhat) {
        giaoVien[index] = new Person(name, age, address, codeMember, luongCung, luongThuong, tienPhat);
        index++;
    }

    public void displayGiaoVien() {
        for (int i = 0; i < index; i++) {
            System.out.println(giaoVien[i]);
        }
    }
}
