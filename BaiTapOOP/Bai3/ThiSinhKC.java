package BaiTapOOP.Bai3;

public class ThiSinhKC extends ThiSinh{

    private final String van = "Văn";
    private final String su = "Sử";
    private final String dia = "Địa";

    public ThiSinhKC(String soBaoDanh, String hoTen, String diaChi, String mucUuTien)
    {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "Thí sinh khối C"
                + "\n" + super.toString()
                + "\n" + "Môn thi: " + this.van + ", " + this.su + ", " + this.dia;
    }

}





















































