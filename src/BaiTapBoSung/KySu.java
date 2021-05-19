package BaiTapBoSung;

public class KySu extends CanBo{
    private String chuyenNganh;

    public KySu(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public KySu(String name, int age, String address, String chuyenNganh) {
        super(name, age, address);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "KySu{" + super.toString() +
                "chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }
}
