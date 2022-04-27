package BaiTapOOP.Bai4;

import java.util.ArrayList;

public class KhuPho {
    
    private ArrayList<HoGiaDinh> listGD;

    public KhuPho()
    {
        this.listGD = new ArrayList<>();
    }

    public void setListGD(ArrayList<HoGiaDinh> listGD) {
        this.listGD = listGD;
    }

    public ArrayList<HoGiaDinh> getListGD() {
        return listGD;
    }

    public void add(HoGiaDinh hoGiaDinh) {
        listGD.add(hoGiaDinh);
    }
}










































