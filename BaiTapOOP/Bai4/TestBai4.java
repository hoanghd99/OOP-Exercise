package BaiTapOOP.Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBai4 {

    public static void main(String[] args) {

        String input;
        Scanner sc = new Scanner(System.in);
        KhuPho khuPho = new KhuPho();

        do {
            System.out.println("Phần mềm quản lý khu phố.");
            System.out.println("[1]. Thêm hộ gia đình.");
            System.out.println("[2]. Hiển thị số hộ gia đình.");
            System.out.println("[3]. Thoát.");
            System.out.println("Nhập giá trị từ [1-3]: ");
            input = sc.next();

            switch (input) {
                case "1":   khuPho.add(themGiaDinh());
                            break;
                case "2":
                            System.out.println("Nhập số hộ gia đình hiển thị.");
                            int soLuong = sc.nextInt();
                            hienThi(soLuong, khuPho);
                            break;
                case "3":
                            System.out.println("Kết thúc chương trình");
                            System.exit(0);

                default:
                            System.out.println("Chỉ nhập giá trị lựa chọn [1-3].");
            }
        }
        while(input != "3");


    }

    public static HoGiaDinh themGiaDinh() {
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        String diaChi;

        System.out.print("Nhập địa chỉ nhà: ");
        diaChi = sc.nextLine();

        int soTV;
        ArrayList<Nguoi> listTV = new ArrayList<>();

        System.out.print("Nhập số thành viên: ");
        soTV = scInt.nextInt();

        int i = 1;

        do {
            System.out.println();
            System.out.print("Nhập tên thành viên thứ " + i + " : ");
            String name = sc.nextLine();
            System.out.print("Nhập tuối thành viên: ");
            String age = scInt.next();
            Integer age1 = Integer.parseInt(age);
            System.out.print("Nhập nghề nghiệp thành viên: ");
            String job = sc.nextLine();
            System.out.print("Nhập số CMND: ");
            String cmt = sc.nextLine();

            System.out.println();

            Nguoi thanhVien = new Nguoi(name, age1, job, cmt);
            listTV.add(thanhVien);
            i++;
            soTV--;
        }
        while (soTV != 0);

        HoGiaDinh giaDinh = new HoGiaDinh(diaChi, listTV);
        return  giaDinh;
    }

    public static void hienThi(int soLuong, KhuPho khuPho) {
        ArrayList listGD = khuPho.getListGD();
        for (int i = 0; i < soLuong; i++) {
            System.out.println(listGD.get(i));
            System.out.println();
        }
    }
}








































