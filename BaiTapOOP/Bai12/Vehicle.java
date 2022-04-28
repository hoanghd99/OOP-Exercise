package BaiTapOOP.Bai12;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Vehicle {

    private String id;
    private String manufacturer;
    private int year;
    private double price;
    private String color;

    public Vehicle() {

    }

    public Vehicle(String id, String manufacturer, int year, double price, String color) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ID phương tiện: " + id
                + "\n" + "Hãng sản xuất: " + manufacturer
                + "\n" + "Năm sản xuất: " + year
                + "\n" + "Giá bán: " + price
                + "\n" + "Màu xe: " + color;
    }

}


















































