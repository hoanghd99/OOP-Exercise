package BaiTapOOP.Bai5;

public class Phong{

    private String loaiPhong;
    private double giaPhong;
    private int soNgay;

    public Phong (String loaiPhong, double giaPhong, int soNgay) {
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.soNgay = soNgay;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public double tinhTien()
    {
        return giaPhong * soNgay;
    }
}
