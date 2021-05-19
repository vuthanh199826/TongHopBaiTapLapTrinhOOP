package BaiTapBoSung;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String congViec) {
        this.congViec = congViec;
    }

    public NhanVien(String name, int age, String address, String congViec) {
        super(name, age, address);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" + super.toString() +
                "congViec='" + congViec + '\'' +
                '}';
    }
}
