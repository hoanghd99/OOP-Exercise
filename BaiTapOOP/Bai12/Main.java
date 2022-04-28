package BaiTapOOP.Bai12;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String id;
        String input;
        VehicleManagement vehicleManagement = new VehicleManagement();

        do {

            System.out.println("Phần mềm quản lý phương tiện");
            System.out.println("[1]. Thêm phương tiện");
            System.out.println("[2]. Xoá phương tiện");
            System.out.println("[3]. Tìm phương tiện theo nhà sản xuất");
            System.out.println("[4]. Tìm phương tiện theo màu");
            System.out.println("[5]. Thoát");
            System.out.println("Nhập lựa chọn từ [1-5].");

            input = sc.nextLine();

            switch (input) {
                case "1":
                         System.out.println();
                         System.out.println("Nhập loại xe muốn thêm: ");
                         System.out.println("[1]. Xe oto");
                         System.out.println("[2]. Xe máy");
                         System.out.println("[3]. Xe tải");
                         System.out.print("Chọn [1-3]: ");
                         String vehicleIn = sc2.next();
                         switch (vehicleIn) {
                             case "1": Car car = createCar();
                                        vehicleManagement.addVehicle(car);
                                        break;
                             case "2": MotorBike motorBike = createMotoBike();
                                       vehicleManagement.addVehicle(motorBike);
                                       break;
                             case "3": Truck truck = createTruck();
                                       vehicleManagement.addVehicle(truck);
                                       break;
                             default:
                                 System.out.print("Chỉ chọn giá trị từ [1-3] ");

                         }
                         break;
                case "2":
                         System.out.print("Nhập ID xe muốn xoá: ");
                         id = sc.nextLine();
                         vehicleManagement.removeVehicle(id);
                         break;
                case "3":
                         vehicleManagement.searchByManufacturer();
                         break;
                case "4": vehicleManagement.searchByColor();
                          break;
                case "5": break;
                default:
                    System.out.print("Chỉ nhập giá trị [1-5]: ");

            }
        }while (input != "5");



    }

    public static Car createCar() {
        String id, manufacturer, color;
        String input;
        int year;
        double price;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Nhập id xe : ");
        id = sc.nextLine();
        System.out.print("Nhập nhà sản xuất xe : ");
        manufacturer = sc.nextLine();
        System.out.print("Nhập năm sản xuất xe : ");
        year = sc2.nextInt();
        System.out.print("Nhập màu xe: ");
        color = sc.nextLine();
        System.out.print("Nhập giá xe: ");
        price = sc2.nextDouble();

        System.out.print("Nhập số ghế xe oto: ");
        int seatNumber = sc2.nextInt();
        System.out.print("Nhập kiểu động cơ xe oto: ");
        String typeMotor = sc.nextLine();
        Car car = new Car(id, manufacturer, year, price, color, seatNumber, typeMotor);
        return car;
    }

    public static MotorBike createMotoBike() {
        String id, manufacturer, color;
        int year;
        double price;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Nhập id xe : ");
        id = sc.nextLine();
        System.out.print("Nhập nhà sản xuất xe : ");
        manufacturer = sc.nextLine();
        System.out.print("Nhập năm sản xuất xe : ");
        year = sc2.nextInt();
        System.out.print("Nhập màu xe: ");
        color = sc.nextLine();
        System.out.print("Nhập giá xe: ");
        price = sc2.nextDouble();

        System.out.print("Nhập công suất xe máy: ");
        double power = sc2.nextDouble();
        MotorBike motorBike = new MotorBike(id, manufacturer,year, price, color, power);
        return motorBike;
    }

    public static Truck createTruck() {
        String id, manufacturer, color;
        int year;
        double price;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Nhập id xe : ");
        id = sc.nextLine();
        System.out.print("Nhập nhà sản xuất xe : ");
        manufacturer = sc.nextLine();
        System.out.print("Nhập năm sản xuất xe : ");
        year = sc2.nextInt();
        System.out.print("Nhập màu xe: ");
        color = sc.nextLine();
        System.out.print("Nhập giá xe: ");
        price = sc2.nextDouble();

        System.out.print("Nhập tải trọng xe tải: ");
        double weight = sc2.nextDouble();
        Truck truck = new Truck(id, manufacturer, year, price, color, weight);
        return truck;
    }
}












































