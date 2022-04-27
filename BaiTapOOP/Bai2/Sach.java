package BaiTapOOP.Bai2;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    //public Sach() {
        //super(documentCode, nhaXuatBan, soBan);

    //}

    public Sach(String documentCode, String nhaXuatBan, int soBan,
                String tenTacGia, int soTrang)
    {
        super(documentCode, nhaXuatBan, soBan);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public void setTenTacGia(String tenTacGia)
    {
        this.tenTacGia = tenTacGia;
    }

    public void setSoTrang(int soTrang)
    {
        this.soTrang = soTrang;
    }

    public String getTenTacGia()
    {
        return tenTacGia;
    }

    public int getSoTrang()
    {
        return soTrang;
    }

    @Override
    public String toString() {
        return super.toString() + "Tên tác giả: " + tenTacGia + "\n"
                + "Số trang: " + soTrang;
    }
}
























































