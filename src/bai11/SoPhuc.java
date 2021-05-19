package bai11;

import java.util.Scanner;

public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public SoPhuc() {
        phanThuc = 0.0;
        phanAo = 0.0;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }
    public String sum(){
        SoPhuc obj1 = new SoPhuc();
        obj1.input();
        SoPhuc obj2 = new SoPhuc();
        obj2.input();
        SoPhuc obj3 = new SoPhuc();
        obj3.setPhanThuc(obj1.getPhanThuc()+obj2.getPhanThuc());
        obj3.setPhanAo(obj1.getPhanAo()+obj2.getPhanAo());
        return obj3.displaySoPhuc();
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Phan thuc");
        this.phanThuc = sc.nextDouble();
        sc.nextLine();
        System.out.println("Phan ao");
        this.phanAo = sc.nextDouble();
        sc.nextLine();
    }
     public String displaySoPhuc(){
        String soPhuc = ""+phanThuc+","+phanAo+"";
        return soPhuc;
    }


    @Override
    public String toString() {
        return "SoPhuc{" +
                "phanThuc=" + phanThuc +
                ", phanAo=" + phanAo +
                '}';
    }
}

