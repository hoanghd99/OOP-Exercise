package BaiTapOOP.Bai1;

public class CongNhan extends CanBo{
    private final String title = "Cong Nhan";
    private String rank;

    public CongNhan(String name, String age,
                    String sex, String rank) {
        super(name, age, sex);
        this.rank = rank;
    }

    public void setRank(String ranks)
    {
        this.rank = rank;
    }

    public String getRank()
    {
        return rank;
    }

    @Override
    public String toString() {
        return title + "\n" + super.toString() +  "Bac: " + rank;
    }
}













