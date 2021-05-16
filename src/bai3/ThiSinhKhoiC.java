package bai3;

public class ThiSinhKhoiC extends ThiSinh{
    final private String subject = "Van, Su, Dia";

    public ThiSinhKhoiC(int soBaoDanh, String name, String address, String mucUuTien) {
        super(soBaoDanh, name, address, mucUuTien);
    }

    public String getSubject() {
        return subject;
    }


    @Override
    public String toString() {
        return "ThiSinhKhoiC{" +
                "So bao danh: "+getSoBaoDanh()+
                ", Name: "+getName()+
                ", Address: "+getAddress()+
                ", Muc uu tien: "+getMucUuTien()+
                ", subject='" + getSubject() +
                '}';
    }
}
