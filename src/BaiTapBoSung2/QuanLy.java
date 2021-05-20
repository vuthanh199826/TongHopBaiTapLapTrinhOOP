package BaiTapBoSung2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class QuanLy {
    private List<Person> personList = new LinkedList<>();

    public QuanLy() {
    }

    public void add(Person person) {
        personList.add(person);
    }

    public void remove(String name) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals(name)) {
                personList.remove(personList.get(i));
            }
        }
    }

    public int search(String name) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals(name)) {
                return personList.indexOf(personList.get(i));
            }
        }
        return -1;
    }
    public void edit(String name, Person person){
        if(search(name)!=-1){
            personList.set(search(name),person);
        }else {
            System.out.println("Invalid");
        }
    }

    public void printData() {
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
