package BaiTapOOP.Bai9;

public class KhachHang {

    private String name;
    private String address;
    private String electricID;

    public KhachHang() {

    }

    public KhachHang(String name, String address, String electricID) {
        this.name = name;
        this.address = address;
        this.electricID = electricID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setElectricID(String electricID) {
        this.electricID = electricID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getElectricID() {
        return electricID;
    }

    @Override
    public String toString() {
        return "Tên chủ hộ: " + name
                + "\n" + "Số nhà: " + address
                + "\n" + "Mã công tơ điện: " + electricID;
    }
}


















































