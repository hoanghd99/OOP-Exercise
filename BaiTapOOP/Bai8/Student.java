package BaiTapOOP.Bai8;

public class Student {

    private String name;
    private int age;
    private String classCourse;

    public Student(String name, int age, String classCourse) {
        this.name = name;
        this.age = age;
        this.classCourse = classCourse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassCourse(String classCourse) {
        this.classCourse = classCourse;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassCourse() {
        return classCourse;
    }

    @Override
    public String toString() {
        return "Họ và tên: " + name
                + "\n" + "Tuổi: " + age
                + "\n" + "Lớp học: " + classCourse;
    }
}






















