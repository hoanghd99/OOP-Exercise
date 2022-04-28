package BaiTapOOP.Bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBai9 {
    public static void main(String[] args) {
        QuanLy listBL = new QuanLy();
        String input;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        do {
            System.out.println("Phần mềm quản lý hoá đơn điện.");
            System.out.println("[1]. Thêm thông tin biên lai.");
            System.out.println("[2]. Xoá thông tin hộ sử dụng.");
            System.out.println("[3]. Sửa thông tin hộ sử dụng.");
            System.out.println("[4]. Tính tiền điện.");
            System.out.println("[5]. Thoát.");
            System.out.print("Chọn từ [1-5]: ");

            input = sc.next();

            switch (input) {
                case "1": BienLai bienLai = new BienLai();
                          bienLai = listBL.addInfoKH();
                          System.out.print("Nhập số điện mới biên lai: ");
                          double newElectricNum = sc2.nextDouble();
                          bienLai.setNewElectricNum(newElectricNum);
                          System.out.print("Nhập số điện cũ biên lai: ");
                          double oldElectricNum = sc2.nextDouble();
                          bienLai.setOldElectricNum(oldElectricNum);
                          listBL.addBL(bienLai);
                          break;
                case "2": BienLai bienLai1 = searchBL(listBL);
                          listBL.delInfoKH(bienLai1);
                          break;
                case "3": BienLai bienLai2 = searchBL(listBL);
                          listBL.editInfoKH(bienLai2);
                          break;
                case "4": BienLai bienLai3 = searchBL(listBL);
                          bienLai3.setElectricFee();
                          System.out.println("Tiền điện: " + bienLai3.getElectricFee());
                          break;
                case "5": break;
                default:
                    System.out.print("Chỉ chọn giá trị từ [1-5]: ");
            }

        }while (input != "5");


    }

    public static BienLai searchBL(QuanLy listIn) {
        Scanner sc = new Scanner(System.in);
        String electricID;

        System.out.print("Nhập mã công tơ: ");
        electricID = sc.nextLine();

        ArrayList<BienLai> listTK = new ArrayList<>();
        for (BienLai bienLai : listIn.getListBL()) {
            if (bienLai.getElectricID().equals(electricID))
                listTK.add(bienLai);
        }
        return listTK.get(0);
    }
}
