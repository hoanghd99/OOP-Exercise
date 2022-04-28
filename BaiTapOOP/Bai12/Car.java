package BaiTapOOP.Bai12;

public class Car extends Vehicle {

    private int seatNumber;
    private String typeMotor;


    public Car(String id, String manufacturer, int year, double price,
               String color, int seatNumber, String typeMotor) {
        super(id, manufacturer, year, price, color);
        this.seatNumber = seatNumber;
        this.typeMotor = typeMotor;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setTypeMotor(String typeMotor) {
        this.typeMotor = typeMotor;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getTypeMotor() {
        return typeMotor;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n" + "Số chỗ ngồi: " + seatNumber
                + "\n" + "Kiểu động cơ: " + typeMotor;
    }

}


























