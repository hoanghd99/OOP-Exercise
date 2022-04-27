package BaiTapOOP.Bai1;

public class KySu extends CanBo {
    private final String titile = "Ky Su";
    private String major;

    public KySu(String name, String age, String sex,
                String major)
    {
        super(name, age, sex);
        this.major = major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString()
    {
        return titile + "\n" + super.toString() + "Nganh dao tao: " + major;
    }

}









































