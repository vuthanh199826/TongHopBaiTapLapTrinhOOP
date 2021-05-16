package bai3;

public class ThiSinhKhoiB extends ThiSinh{
    final private String subject = "Toan, Hoa, Sinh";

    public ThiSinhKhoiB(int soBaoDanh, String name, String address, String mucUuTien) {
        super(soBaoDanh, name, address, mucUuTien);
    }

    public String getSubject() {
        return subject;
    }


    @Override
    public String toString() {
        return "ThiSinhKhoiB{" +
                "So bao danh: "+getSoBaoDanh()+
                ", Name: "+getName()+
                ", Address: "+getAddress()+
                ", Muc uu tien: "+getMucUuTien()+
                ", subject='" + getSubject() +
                '}';
    }
}
