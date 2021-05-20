package BaiTapBoSung;

import java.util.ArrayList;
import java.util.Iterator;

public class QuanLy{
    public ArrayList<CanBo> list;

    public QuanLy() {
        this.list = new ArrayList<>();
    }

    public void add(CanBo canBo) {
        list.add(canBo);
    }

    public void remove(String name) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name)){
                list.remove(list.indexOf(list.get(i)));
            }
        }
    }

    public void search(String name) {
        Iterator<CanBo> iterator = (Iterator<CanBo>) list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(name)) {
                System.out.println(iterator.next());
            }
        }
    }

    public void display() {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
