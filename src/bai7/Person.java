package bai7;

public class Person {
    private String name;
    private int age;
    private String address;
    private int codeMember;
    private double luongCung;
    private double luongThuong;
    private double tienPhat;
    private double luongThucLinh = luongCung+luongThuong-tienPhat;

    public Person(String name, int age, String address, int codeMember, double luongCung, double luongThuong, double tienPhat) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.codeMember = codeMember;
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCodeMember() {
        return codeMember;
    }

    public void setCodeMember(int codeMember) {
        this.codeMember = codeMember;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", codeMember=" + codeMember +
                ", luongCung=" + luongCung +
                ", luongThuong=" + luongThuong +
                ", tienPhat=" + tienPhat +
                ", luongThucLinh=" + luongThucLinh +
                '}';
    }
}
