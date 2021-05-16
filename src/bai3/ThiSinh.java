package bai3;

public class ThiSinh {
    private int soBaoDanh;
    private String name;
    private String address;
    private String mucUuTien;

    public ThiSinh(int soBaoDanh, String name, String address, String mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.name = name;
        this.address = address;
        this.mucUuTien = mucUuTien;
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(int soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(String mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "soBaoDanh=" + soBaoDanh +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mucUuTien='" + mucUuTien + '\'' +
                '}';
    }
}
