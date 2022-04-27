package BaiTapOOP.Bai7;

public class Teacher {

    private String name;
    private int age;
    private String town;
    private String teacherCode;

    private double baseSalary;
    private double bonusSalary;
    private double negSalary;
    private double netSalary;

    public Teacher(String name, int age, String town, String teacherCode) {
        this.name = name;
        this.age = age;
        this.town = town;
        this.teacherCode = teacherCode;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public void setNegSalary(double negSalary) {
        this.negSalary = negSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public double getNegSalary() {
        return negSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void calculateNetSalary() {
        this.netSalary = getBaseSalary() + getBonusSalary() - getNegSalary();
    }

}































































































