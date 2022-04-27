package BaiTapOOP.Bai5;

import java.util.Scanner;

public class TestBai5 {
    public static void main(String[] args) {

        KhachSan ks = new KhachSan();
        String input, cmnd;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("Phần mềm quản lý khách sạn.");
            System.out.println("[1]. Thêm mới khách");
            System.out.println("[2]. Xoá khách theo CMND");
            System.out.println("[3]. Tính tiền theo CMND");
            System.out.println("[4]. Thoát chương trình");
            System.out.print("Nhập lựa chọn từ [1-4]: ");

            input = sc.next();

            switch (input) {
                case "1":
                    System.out.println("Nhập thông tin khách hàng.");
                    ks.themKhach(themNguoi());
                    break;
                case "2":
                    System.out.println("Xoá khách hàng.");
                    System.out.print("Nhập số CMND: ");
                    cmnd = sc.next();
                    ks.xoaKhach(cmnd);
                    break;
                case "3":
                    System.out.println("Tính tiền phòng khách hàng.");
                    System.out.println("Nhập số cmnd");
                    cmnd = sc.next();
                    ks.tinhTienPhong(cmnd);
                    break;
                case "4":
                    System.out.println("Kết thúc chương trình");
                    System.exit(0);
                default:
                    System.out.println("Chọn từ [1-4]");
            }

        }while (input != "4");
    }

    public static NguoiThue themNguoi() {
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        String name, cmnd;
        int age, day;
        String input;

        System.out.print("Nhập tên khách hàng: ");
        name = sc.nextLine();
        System.out.print("Nhập tuối khách hàng: ");
        age = scInt.nextInt();
        System.out.print("Nhập số CMND khách hàng: ");
        cmnd = sc.nextLine();

        NguoiThue nguoiThue = new NguoiThue(name, age, cmnd);

        do {
            System.out.println("Nhập loại phòng thuê.");
            System.out.println("[1]. Phòng loại A - Giá: 500");
            System.out.println("[2]. Phòng loại B - Giá: 300");
            System.out.println("[3]. Phòng loại C - Giá: 100");
            System.out.println("Chọn từ [1-3].");

            input = sc.next();

            switch (input) {
                case "1":
                    System.out.println("Nhập số ngày muốn thuê");
                    day = sc.nextInt();
                    PhongLoaiA pA = new PhongLoaiA(day);
                    nguoiThue.setPhong(pA);
                    break;
                case "2":
                    System.out.println("Nhập số ngày muốn thuê");
                    day = sc.nextInt();
                    PhongLoaiB pB = new PhongLoaiB(day);
                    nguoiThue.setPhong(pB);
                    break;
                case "3":
                    System.out.println("Nhập số ngày muốn thuê");
                    day = sc.nextInt();
                    PhongLoaiC pC = new PhongLoaiC(day);
                    nguoiThue.setPhong(pC);
                    break;
                default:
                    System.out.println("Chỉ nhập giá trị từ [1-3]");
            }
        }
        while (input == "1" || input == "2" || input == "3");

        return nguoiThue;
    }

}





















































