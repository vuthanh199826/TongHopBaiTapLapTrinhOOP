package bai6;

class Student {
    private String name;
    private int age;
    private String address;
    private int classmate;

    public Student(String name, int age, String address, int classmate) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getClassmate() {
        return classmate;
    }

    public void setClassmate(int classmate) {
        this.classmate = classmate;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", classmate=" + classmate +
                '}';
    }
}
