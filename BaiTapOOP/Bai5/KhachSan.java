package BaiTapOOP.Bai5;

import java.util.ArrayList;

public class KhachSan {

    private ArrayList<Phong> listPhong;
    private ArrayList<NguoiThue> listKhach;

    public KhachSan() {
        this.listPhong = new ArrayList<>();
        this.listKhach = new ArrayList<>();
    }

    public void themKhach(NguoiThue nguoiThue) {
        listKhach.add(nguoiThue);
    }

    public void xoaKhach(String cmnd) {
        for (NguoiThue nguoiThue : listKhach) {
            if (nguoiThue.getCmnd().equals(cmnd)) {
               listKhach.remove(nguoiThue);
                System.out.println("Xoá thành công.");
            }
        }
    }

    public void tinhTienPhong(String cmnd) {

        ArrayList<NguoiThue> listTK = new ArrayList<>();
        for (NguoiThue nguoiThue : listKhach) {
            if (nguoiThue.getCmnd().equals(cmnd)) {
                listTK.add(nguoiThue);
            }
        };

        if (listTK.isEmpty()) {
            System.out.println("Không có số CMND này");
        }
        else {
            double tienPhong = listTK.get(0).getPhong().tinhTien();
            System.out.println("Số tiền phòng của số " + cmnd + " là: " + tienPhong);
        }
    }
}

























