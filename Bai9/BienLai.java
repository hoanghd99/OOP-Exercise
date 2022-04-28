package BaiTapOOP.Bai9;

import java.lang.Math;

public class BienLai extends KhachHang{

    private double oldElectricNum;
    private double newElectricNum;
    private double  electricFee;

    public BienLai() {

    }

    public BienLai(String name, String address, String electricID) {
        super(name, address, electricID);
    }

    public BienLai(String name, String address, String electricID, double oldElectricNum, double newElectricNum, double electricFee) {
        super(name, address, electricID);
        this.oldElectricNum = oldElectricNum;
        this.newElectricNum = newElectricNum;
        this.electricFee = electricFee;
    }

    public void setOldElectricNum(double oldElectricNum) {
        this.oldElectricNum = oldElectricNum;
    }

    public void setNewElectricNum(double newElectricNum) {
        this.newElectricNum = newElectricNum;
    }

    public void setElectricFee() {
        this.electricFee = Math.abs(this.newElectricNum - this.oldElectricNum) * 5;
    }

    public double getOldElectricNum() {
        return oldElectricNum;
    }

    public double getNewElectricNum() {
        return newElectricNum;
    }

    public double getElectricFee() {
        return electricFee;
    }

    public String infoKH() {
        return super.toString();
    }
}



























































