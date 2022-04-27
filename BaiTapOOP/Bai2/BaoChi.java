package BaiTapOOP.Bai2;

public class BaoChi extends TaiLieu{
    private String ngayPhatHanh;

    public BaoChi(String documentCode, String nhaXuatBan, int soBan,
                   String ngayPhatHanh)
    {
        super(documentCode, nhaXuatBan, soBan);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh)
    {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    @Override
    public String toString() {
        return super.toString() + "Ngay phat hanh " + ngayPhatHanh;
    }
}
