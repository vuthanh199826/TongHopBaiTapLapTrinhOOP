package bai4;

public class Nguoi{
    private String name;
    private int age;
    private String job;
    final private int CMND;

    public Nguoi(String name, int age, String job, int CMND) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.CMND = CMND;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getCMND() {
        return CMND;
    }


    @Override
    public String toString() {
        return "Nguoi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", CMND=" + CMND +
                '}';
    }
}
