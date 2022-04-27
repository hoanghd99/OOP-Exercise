package BaiTapOOP.Bai5;

public class NguoiThue {

    private String name;
    private int age;
    private final String cmnd;
    private Phong phong;

    public NguoiThue(String name, int age, String cmnd)
    {
        this.name = name;
        this.age = age;
        this.cmnd = cmnd;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public Phong getPhong() {
        return phong;
    }

    @Override
    public String toString() {
        return "Họ và tên: " + name
                + "\n" + "Tuổi: " + age
                + "\n" + "Số CMND: " + cmnd;
    }
}
































