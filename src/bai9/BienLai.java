package bai9;

public class BienLai {
    private KhachHang khachHang;
    private int soDienCu;
    private int soDienMoi;
    private int soTienPhaiTra;

    public BienLai(KhachHang khachHang, int soDienCu, int soDienMoi) {
        this.khachHang = khachHang;
        this.soDienCu = soDienCu;
        this.soDienMoi = soDienMoi;
    }

    public BienLai(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public int getSoDienCu() {
        return soDienCu;
    }

    public void setSoDienCu(int soDienCu) {
        this.soDienCu = soDienCu;
    }

    public int getSoDienMoi() {
        return soDienMoi;
    }

    public void setSoDienMoi(int soDienMoi) {
        this.soDienMoi = soDienMoi;
    }

    public int getSoTienPhaiTra() {
        return soTienPhaiTra;
    }

    public void setSoTienPhaiTra(int soTienPhaiTra) {
        this.soTienPhaiTra = soTienPhaiTra;
    }
    public int tinhTienPhaiTra(){
       this.soTienPhaiTra = (this.soDienMoi - this.soDienCu)*5;
        return this.soTienPhaiTra;
    }

    @Override
    public String toString() {
        return "BienLai{" +
                "khachHang=" + khachHang +
                ", soDienCu=" + soDienCu +
                ", soDienMoi=" + soDienMoi +
                ", soTienPhaiTra=" + tinhTienPhaiTra() +
                '}';
    }
}
