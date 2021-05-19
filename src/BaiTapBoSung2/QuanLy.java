package BaiTapBoSung2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class QuanLy {
    private List<Person> personList = new LinkedList<>();

    public QuanLy() {
    }
    public void add(Person person){
        personList.add(person);
    }
    public void remove(String name){
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getName().equals(name)){
                personList.remove(personList.get(i));
            }
        }

    }
    public void search(String name){
//        Iterator<Person> iterator = personList.listIterator();
//        while (iterator.hasNext()){
//            if(iterator.next().getName().equals(name)){
//                System.out.println(iterator.next());
//            }
//        }
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getName().equals(name)){
                System.out.println(personList.get(i));
            }
        }
    }
    public void printData(){
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
