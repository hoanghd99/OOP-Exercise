package BaiTapOOP.Bai3;
import OOP.DefaultAndStatic.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestBai3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;

        TuyenSinh dsTS = new TuyenSinh();

        do {
            System.out.println("Phần mềm quản lý tuyển sinh");
            System.out.println("[1]. Thêm mới thí sinh");
            System.out.println("[2]. Hiển thị thông tin và khối thi thí sinh");
            System.out.println("[3]. Tìm kiếm theo số báo danh");
            System.out.println("[4]. Thoát khỏi chương trình");
            System.out.print("Chọn [1-4]: ");
            input = sc.next();

            switch (input) {

                case "1": dsTS.themThiSinh();
                          break;

                case "2": dsTS.hienThiThiSinh();
                          break;
                case "3": dsTS.timKiemThiSinh();
                          break;

                case "4": dsTS.thoatChuongTrinh();
                          break;

                default:
                    System.out.println("Chỉ chọn giá trị [1-5]");
            }
        }
        while (input != "4");



    }
}
