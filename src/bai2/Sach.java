package bai2;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach(int MATAILIEU, String nhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(MATAILIEU, nhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "Ma tai lieu: " + getMATAILIEU()+
                ", Nha xuat ban: "+ getNhaXuatBan()+
                ", So ban phat hanh: " +getSoBanPhatHanh()+
                ", tenTacGia='" + getTenTacGia() +
                ", soTrang=" + getSoTrang() +
                '}';
    }
}
