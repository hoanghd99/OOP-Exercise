package BaiTapOOP.Bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {

    public ArrayList<BienLai> listBL;

    public QuanLy() {
        this.listBL = new ArrayList<>();
    }

    public ArrayList<BienLai> getListBL() {
        return listBL;
    }

    public void addBL(BienLai bienLai) {
        listBL.add(bienLai);
    }

    public BienLai addInfoKH() {
        Scanner sc = new Scanner(System.in);
        String name, address, electricID;

        System.out.print("Nhập tên chủ hộ: ");
        name = sc.nextLine();
        System.out.println("Nhập địa chỉ chủ hộ: ");
        address = sc.nextLine();
        System.out.println("Nhập mã số công tơ: ");
        electricID = sc.nextLine();

        BienLai bienLai = new BienLai(name, address, electricID);
        return bienLai;
    }

    public void delInfoKH(BienLai bienLai) {

        Scanner sc = new Scanner(System.in);
        String input;

        do {
            System.out.println("Xoá thông tin khách hàng.");
            System.out.println("[1]. Xoá tên chủ hộ.");
            System.out.println("[2]. Xoá địa chỉ.");
            System.out.println("[3]. Xoá mã công tơ.");
            System.out.println("[4]. Thoát.");
            System.out.println("Chọn [1-4]: ");

            input = sc.next();

            switch (input) {

                case "1": String name = "";
                          bienLai.setName(name);
                          System.out.println("Thông tin khách hàng sau khi xoá tên chủ hộ ");
                          System.out.println(bienLai.infoKH());
                          break;
                case "2": String address = "";
                          bienLai.setAddress(address);
                          System.out.println("Thông tin khách hàng sau khi xoá địa chỉ");
                          System.out.println(bienLai.infoKH());
                          break;
                case "3": String electricID = "";
                          bienLai.setElectricID(electricID);
                          System.out.println("Thông tin khách hàng sau khi xoá mã công tơ");
                          System.out.println(bienLai.infoKH());
                          break;
                case "4": break;
                default:
                          System.out.println("Chỉ chọn từ [1-4].");
            }

        }while (input == "4");

    }

    public void editInfoKH(BienLai bienLai) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String input;

        do {
            System.out.println("Xoá thông tin khách hàng.");
            System.out.println("[1]. sửa tên chủ hộ.");
            System.out.println("[2]. Sửa địa chỉ.");
            System.out.println("[3]. Sửa mã công tơ.");
            System.out.println("[4]. Thoát.");
            System.out.println("Chọn [1-4]: ");

            input = sc.next();

            switch (input) {

                case "1":
                    System.out.println("Thay đổi tên chủ hộ thành: ");
                    String name = sc2.nextLine();
                    bienLai.setName(name);
                    System.out.println("Thông tin khách hàng sau khi thay đổi tên chủ hộ ");
                    System.out.println(bienLai.infoKH());
                    break;
                case "2":
                    System.out.println("Thay đổi địa chỉ thành: ");
                    String address = sc2.nextLine();
                    bienLai.setAddress(address);
                    System.out.println("Thông tin khách hàng sau khi thay đổi địa chỉ");
                    System.out.println(bienLai.infoKH());
                    break;
                case "3":
                    System.out.println("Thay đổi mã công tơ thành: ");
                    String electricID = sc2.nextLine();
                    bienLai.setElectricID(electricID);
                    System.out.println("Thông tin khách hàng sau khi xoá mã công tơ");
                    System.out.println(bienLai.infoKH());
                    break;
                case "4": break;
                default:
                    System.out.println("Chỉ chọn từ [1-4].");
            }

        }while (input == "4");
    }
}





























