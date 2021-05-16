package bai5;

public class Nguoi {
    private String name;
    private int age;
    final private int CMND;
    private int soNgayThue;

    public Nguoi(String name, int age, int CMND,int soNgayThue) {
        this.name = name;
        this.age = age;
        this.CMND = CMND;
        this.soNgayThue = soNgayThue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCMND() {
        return CMND;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", CMND=" + CMND +
                ", soNgayThue=" + soNgayThue +
                '}';
    }
}
