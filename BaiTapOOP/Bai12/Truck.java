package BaiTapOOP.Bai12;

public class Truck extends Vehicle {
    private double weight;

    public Truck() {

    }

    public Truck(String id, String manufacturer, int year, double price, String color, double weight) {
        super(id, manufacturer, year, price, color);
        this.weight = weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

}

















