package BaiTapOOP.Bai2;

public class TaiLieu {
    private String documentCode;
    private String nhaXuatBan;
    private int    soBan;

    public TaiLieu(String documentCode, String nhaXuatBan, int soBan) {
        this.documentCode = documentCode;
        this.nhaXuatBan = nhaXuatBan;
        this.soBan = soBan;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public void setSoBan(int soBan)
    {
        this.soBan = soBan;
    }

    public String getDocumentCode()
    {
        return documentCode;
    }

    public String getNhaXuatBan()
    {
        return nhaXuatBan;
    }

    public int getSoBan()
    {
        return soBan;
    }

    @Override
    public String toString() {
        return "Mã tài liệu: " + documentCode + "\n" + "Nhà xuất bản " + nhaXuatBan
                + "\n" + "Số bản: " + soBan + "\n";
    }
}










































