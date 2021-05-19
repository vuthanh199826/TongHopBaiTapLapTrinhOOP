package BaiTapBoSung;

public class Main {
    public static void main(String[] args) {
        QuanLy<CanBo> quanLy = new QuanLy ();
        NhanVien nhanVien = new NhanVien("thanh",20,"Ha noi","dev");
        KySu kySu = new KySu("Linh",20,"Hanoi","KeToan");
        quanLy.add(nhanVien);
        quanLy.add(kySu);
//        quanLy.remove(nhanVien);
        quanLy.display();
        System.out.println("_______________");
        quanLy.search("thanh");
    }




}
