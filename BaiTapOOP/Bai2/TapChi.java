package BaiTapOOP.Bai2;

public class TapChi extends TaiLieu{
    private String soPhatHanh;
    private String thangPhatHanh;

    public TapChi(String documentCode, String nhaXuatBan, int soBan,
                  String soPhatHanh, String thangPhatHanh)
    {
        super(documentCode, nhaXuatBan, soBan);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh)
    {
        this.soPhatHanh = soPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh)
    {
        this.thangPhatHanh = thangPhatHanh;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    @Override
    public String toString() {
        return super.toString() + "Số phát hành: " + soPhatHanh + "Tháng phát hành: " + thangPhatHanh;
    }
}
