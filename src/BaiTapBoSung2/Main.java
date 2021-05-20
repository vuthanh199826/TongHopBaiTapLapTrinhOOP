package BaiTapBoSung2;

import javafx.print.Collation;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();
        quanLy.add(new Student("Name1",20,"HaNoi",6));
        quanLy.add(new Teacher("name2",45,"AI CAp","Toan"));
        quanLy.printData();
        quanLy.search("Name1");
        quanLy.remove("name2");
        quanLy.printData();
        quanLy.edit("Name1", new Student("Thanh",20,"HD",10));
        quanLy.printData();

    }
}
