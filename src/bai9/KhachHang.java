package bai9;

public class KhachHang {
    private String name;
    private int soNha;
    private int maSoCongToDien ;

    public KhachHang(String name, int soNha) {
        this.name = name;
        this.soNha = soNha;
        this.maSoCongToDien = (int) (Math.random() * 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public int getMaSoCongToDien() {
        return maSoCongToDien;
    }

    public void setMaSoCongToDien(int maSoCongToDien) {
        this.maSoCongToDien = maSoCongToDien;
    }



    @Override
    public String toString() {
        return "KhachHang{" +
                "name='" + name + '\'' +
                ", soNha=" + soNha +
                ", maSoCongToDien=" + maSoCongToDien +
                '}';
    }
}
