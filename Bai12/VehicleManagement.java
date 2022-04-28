package BaiTapOOP.Bai12;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleManagement {

    ArrayList<Vehicle> listVehicle;

    public VehicleManagement() {
        this.listVehicle = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        listVehicle.add(vehicle);
    }

    public void removeVehicle(String id) {
        for (int i = 0; i < listVehicle.size(); i++) {
            if (listVehicle.get(i).getId().equals(id)) {
                listVehicle.remove(i);
                System.out.println("Đã xoá.");
            }
        }
    }

    public void searchByManufacturer() {
        ArrayList<Vehicle> listSearch = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String manufacturer;
        System.out.print("Nhập nhà sản xuất xe cần tìm: ");
        manufacturer = sc.nextLine();

        for (Vehicle vehicle : listVehicle) {
            if (vehicle.getManufacturer().equals(manufacturer)) {
                listSearch.add(vehicle);
            }
        }

        if (listSearch.isEmpty()){
            System.out.println("Không có nhà sản xuất này.");
        }
        else {
            listSearch.forEach(vehicle -> System.out.println(vehicle));
        }
    }

    public void searchByColor() {
        ArrayList<Vehicle> listSearch2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String color;
        System.out.print("Nhập màu xe cần tìm: ");
        color = sc.nextLine();

        for (Vehicle vehicle : listVehicle) {
            if (vehicle.getColor().equals(color)) {
                listSearch2.add(vehicle);
            }
        }

        if (listSearch2.isEmpty()){
            System.out.println("Không có màu này.");
        }
        else {
            listSearch2.forEach(vehicle -> System.out.println(vehicle));
        }
    }
}


















































