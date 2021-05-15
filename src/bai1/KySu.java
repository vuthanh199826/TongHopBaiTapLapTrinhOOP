package bai1;

public class KySu extends CanBo{
    private String nganhdaotao;

    public KySu(String name, int age, String gender, String address, String nganhDaoTao) {
        super(name, age, gender, address);
        this.nganhdaotao = nganhDaoTao;
    }

    public String getNganhdaotao() {
        return nganhdaotao;
    }

    public void setNganhdaotao(String nganhdaotao) {
        this.nganhdaotao = nganhdaotao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                " name = " + getName() +
                " tuoi = " + getAge() +
                " gioi tinh = " + getGender() +
                " dia chi = " + getAddress() +
                " nganhdaotao='" + nganhdaotao + '\'' +
                '}';
    }
}
