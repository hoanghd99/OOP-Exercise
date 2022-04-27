package BaiTapOOP.Bai1;

public class CanBo {
    private String name;
    private String age;
    private String sex;

    public CanBo(String name, String age, String sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    // set attributes
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // get method
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Ho va ten: " + name + "\n" + "Tuoi: " + age
                + "\n" + "Gioi tinh: " + sex + "\n";
    }
}










































