package BaiTapBoSung2;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();
        quanLy.add(new Student("Name1",20,"HaNoi",6));
        quanLy.add(new Teacher("name2",45,"AI CAp","Toan"));
        quanLy.printData();
        quanLy.search("Name1");
        quanLy.remove("name2");
        quanLy.printData();
    }
}
