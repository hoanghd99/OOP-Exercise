package BaiTapOOP.Bai1;

public class NhanVien extends CanBo {
    private final String title = "Nhan Vien";
    private String job;

    public NhanVien(String name, String age, String sex,
                    String job)
    {
        super(name, age, sex);
        this.job = job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return title + "\n" + super.toString() + "Cong Viec: " + job;
    }
}




















































