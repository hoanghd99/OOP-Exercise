package BaiTapOOP.Bai3;

public class ThiSinhKA extends ThiSinh{

    private final String toan = "Toán";
    private final String vatLy = "Lý";
    private final String hoaHoc = "Hoá";

    public ThiSinhKA(String soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "Thí sinh khối A"
                + "\n" + super.toString()
                + "\n" + "Môn thi: " + this.toan + ", " + this.vatLy + ", " + this.hoaHoc;
    }
}
