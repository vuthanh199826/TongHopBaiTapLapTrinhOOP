package BaiTapBoSung2;

public class Teacher extends Person{
    private String chuyenNganh;

    public Teacher(String name, int age, String address, String chuyenNganh) {
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
        return "Teacher{" + super.toString()+
                "chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }
}
