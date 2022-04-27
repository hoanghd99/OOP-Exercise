package BaiTapOOP.Bai6;

public class Student {

    private String name;
    private int age;
    private String town;

    public Student(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public void displayInfo() {
        System.out.println(this.toString());
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }

    @Override
    public String toString() {
        return "Họ và tên: " + name
                + "\n" + "Tuổi: " + age
                + "\n" + "Quê quán: " + town;
    }
}






















