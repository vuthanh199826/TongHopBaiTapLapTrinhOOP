package BaiTapBoSung2;

public class Student extends Person {
    private int classmate;

    public Student(String name, int age, String address, int classmate) {
        super(name, age, address);
        this.classmate = classmate;
    }

    public int getClassmate() {
        return classmate;
    }

    public void setClassmate(int classmate) {
        this.classmate = classmate;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "classmate=" + classmate +
                '}';
    }
}
