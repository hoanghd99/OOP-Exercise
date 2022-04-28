package BaiTapOOP.Bai11;

import java.util.Scanner;

public class TestBai11 {
    public static void main(String[] args) {

        String input;
        Scanner sc = new Scanner(System.in);
        TinhSoPhuc tinhSoPhuc = new TinhSoPhuc();

        System.out.println("Phần mềm tính số phức");
        System.out.println("[1]. Cộng 2 số phức.");
        System.out.println("[2]. Nhân 2 số phức.");

        input = sc.next();

        switch (input) {
            case "1":
                System.out.println("Nhập số phức thứ nhất.");
                SoPhuc soPhuc1 = tinhSoPhuc.enterSP();
                System.out.println("Nhập số phức thứ hai.");
                SoPhuc soPhuc2 = tinhSoPhuc.enterSP();
                SoPhuc addRes = tinhSoPhuc.addSP(soPhuc1, soPhuc2);
                System.out.println("Kết quả cộng hai số phức.");
                tinhSoPhuc.displaySP(addRes);
                break;
            case "2":
                System.out.println("Nhập số phức thứ nhất.");
                SoPhuc sp1 = tinhSoPhuc.enterSP();
                System.out.println("Nhập số phức thứ hai.");
                SoPhuc sp2 = tinhSoPhuc.enterSP();
                SoPhuc mulRes = tinhSoPhuc.multipleSP(sp1, sp2);
                System.out.println("Kết quả nhân hai số phức.");
                tinhSoPhuc.displaySP(mulRes);
                break;
            default: break;

        }

    }
}



























