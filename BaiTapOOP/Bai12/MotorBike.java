package BaiTapOOP.Bai12;

public class MotorBike extends Vehicle {

    private double power;

    public MotorBike() {

    }

    public MotorBike(String id, String manufacturer, int year, double price, String color, double power) {
        super(id, manufacturer, year, price,color);
        this.power = power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }
}






































