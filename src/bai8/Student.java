package bai8;

public class Student {
    private String name;
    private int age;
    private int classmate;

    public Student(String name, int age, int classmate) {
        this.name = name;
        this.age = age;
        this.classmate = classmate;
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

    public int getClassmate() {
        return classmate;
    }

    public void setClassmate(int classmate) {
        this.classmate = classmate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classmate=" + classmate +
                '}';
    }
}
