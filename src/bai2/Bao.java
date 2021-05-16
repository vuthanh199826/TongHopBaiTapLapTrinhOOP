package bai2;

public class Bao extends TaiLieu{
    private String ngayPhatHanh;

    public Bao(int MATAILIEU, String nhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(MATAILIEU, nhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "Ma tai lieu: " + getMATAILIEU()+
                ", Nha xuat ban: "+ getNhaXuatBan()+
                ", So ban phat hanh: " +getSoBanPhatHanh()+
                ", ngayPhatHanh: " + getNgayPhatHanh() +
                '}';
    }
}
