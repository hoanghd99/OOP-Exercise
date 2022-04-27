package BaiTapOOP.Bai3;

public class ThiSinh {

        private String soBaoDanh;
        private String hoTen;
        private String diaChi;
        private String mucUuTien;

        public ThiSinh(String soBaoDanh, String hoTen, String diaChi, String mucUuTien)
        {
            this.soBaoDanh = soBaoDanh;
            this.hoTen = hoTen;
            this.diaChi = diaChi;
            this.mucUuTien = mucUuTien;
        }

        public String getSoBaoDanh() {
            return soBaoDanh;
        }

        public String getHoTen() {
            return hoTen;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public String getMucUuTien() {
            return mucUuTien;
        }

        @Override
        public String toString() {
            return "Số báo danh: " + soBaoDanh
                    + "\n" + "Họ tên: " + hoTen
                    + "\n" + "Địa chỉ: " + diaChi
                    + "\n" + "Mức ưu tiên: " + mucUuTien;
        }

}












































