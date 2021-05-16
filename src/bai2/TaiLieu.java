package bai2;

public class TaiLieu {
    final private int MATAILIEU;
    private String nhaXuatBan;
    private int soBanPhatHanh;


    public TaiLieu(int MATAILIEU, String nhaXuatBan, int soBanPhatHanh) {
        this.MATAILIEU = MATAILIEU;
        this.nhaXuatBan = nhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public int getMATAILIEU() {
        return MATAILIEU;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "MATAILIEU=" + MATAILIEU +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}
