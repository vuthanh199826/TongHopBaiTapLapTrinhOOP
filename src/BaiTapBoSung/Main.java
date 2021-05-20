package BaiTapBoSung;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy ();
        NhanVien nhanVien = new NhanVien("thanh",20,"Ha noi","dev");
        KySu kySu = new KySu("Linh",20,"Hanoi","KeToan");
        quanLy.add(nhanVien);
        quanLy.add(kySu);
        quanLy.remove("thanh");
        quanLy.display();
        System.out.println("_______________");
        quanLy.search("thanh");
        Collections.sort(quanLy.list, new Comparator<CanBo>() {
            @Override
            public int compare(CanBo o1, CanBo o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        Collections.sort(quanLy.list, new Comparator<CanBo>() {
            @Override
            public int compare(CanBo o1, CanBo o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

    }




}
