package BaiTapBoSung;

import java.util.ArrayList;
import java.util.Iterator;

public class QuanLy<T> implements ThaoTac<NhanVien> {
    private ArrayList<T> list;

    public QuanLy() {
        this.list = new ArrayList<>();
    }

    public void add(T e) {
        list.add(e);
    }

    public void remove(T e) {
        list.remove(e);
    }
    public void search(String name){
        Iterator<CanBo> iterator = (Iterator<CanBo>) list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getName().equals(name)){
            System.out.println(iterator.next());}
        }
    }

    public void display() {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
