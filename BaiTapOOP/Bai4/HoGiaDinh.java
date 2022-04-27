package BaiTapOOP.Bai4;

import java.util.ArrayList;

public class HoGiaDinh {

    private String soNha;
    private ArrayList<Nguoi> listTV;

    public HoGiaDinh(String soNha, ArrayList<Nguoi> listTV) {
        this.soNha = soNha;
        this.listTV = listTV;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public void setListTV(ArrayList<Nguoi> listTV) {
        this.listTV = listTV;
    }

    public String getSoNha(String soNha) {
        return soNha;
    }

    public ArrayList<Nguoi> getListTV() {
        return listTV;
    }

    @Override
    public String toString() {
        return "Hộ gia đình " + soNha
                + "\n" + "Danh sách thành viên."
                + "\n" + listTV;
    }


}















































