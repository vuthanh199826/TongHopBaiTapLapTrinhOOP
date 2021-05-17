package bai6;

public class School {
    private final Student[] students = new Student[10];
    private int index = 0;

    public School() {
    }

    public void addNewStudent(String name, int age,String address, int classmate){
        students[index]=new Student(name,age,address,classmate);
        index++;
    }
    public void displayStudents20YearOld(int age){
        boolean has = false;
        for (int i = 0; i < index; i++) {
            if(students[i].getAge()==age){
                System.out.println(students[i]);
                has = true;
            }
        }
        if(!has){
            System.out.println("Khong co học sinh nao " + age+ " tuoi");
        }
    }
    public int sumOfStudents(int age, String address){
        int sum = 0;
        for (int i = 0; i < index; i++) {
            if(students[i].getAge()==age && students[i].getAddress().equals(address)){
                sum++;
            }
        }
        return sum;
    }
}
