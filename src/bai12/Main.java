package bai12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("một");
        arrayList.add("hai");
        arrayList.add("ba");
        Iterator element = arrayList.iterator();
        while (element.hasNext()){
            System.out.println(element.next());
        }
    }


}
