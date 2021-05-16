package bai2;

public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(int MATAILIEU, String nhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(MATAILIEU, nhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "Ma tai lieu: " + getMATAILIEU()+
                ", Nha xuat ban: "+ getNhaXuatBan()+
                ", So ban phat hanh: " +getSoBanPhatHanh()+
                ", soPhatHanh: " + getSoPhatHanh() +
                ", thangPhatHanh: " + getThangPhatHanh() +
                '}';
    }
}
