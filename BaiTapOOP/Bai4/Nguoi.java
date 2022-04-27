package BaiTapOOP.Bai4;

public class Nguoi {

    private String name;
    private Integer age;
    private String job;
    private final String personalID;

    public Nguoi(String name, Integer age, String job, String personalID)
    {
        this.name = name;
        this.age = age;
        this.job = job;
        this.personalID = personalID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public String getPersonalID() {
        return personalID;
    }

    @Override
    public String toString() {
        return "Họ và tên: " + name
                + "\n" + "Tuổi: " + age
                + "\n" + "Nghề nghiệp: " + job
                + "\n" + "Số CMND: " + personalID;
    }

}
