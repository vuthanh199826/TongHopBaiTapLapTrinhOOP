package bai3;

public class ThiSinhKhoiA extends ThiSinh {
    final private String subject = "Toan, Ly, Hoa";

    public ThiSinhKhoiA(int soBaoDanh, String name, String address, String mucUuTien) {
        super(soBaoDanh, name, address, mucUuTien);
    }

    public String getSubject() {
        return subject;
    }


    @Override
    public String toString() {
        return "ThiSinhKhoiA{" +
                "So bao danh: " + getSoBaoDanh() +
                ", Name: " + getName() +
                ", Address: " + getAddress() +
                ", Muc uu tien: " + getMucUuTien() +
                ", subject='" + getSubject() +
                '}';
    }
}
