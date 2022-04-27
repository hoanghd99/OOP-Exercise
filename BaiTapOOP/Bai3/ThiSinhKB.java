package BaiTapOOP.Bai3;

public class ThiSinhKB extends ThiSinh{

    private final String toan = "Toán";
    private final String hoaHoc = "Hoá";
    private final String sinhHoc = "Sinh";

    public ThiSinhKB(String soBaoDanh, String hoTen, String diaChi, String mucUuTien)
    {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String toString()
    {
        return "Thí sinh khối B"
                + "\n" + super.toString()
                + "\n" + "Môn thi: " + this.toan + ", " + this.hoaHoc + ", " + this.sinhHoc;
    }
}

























