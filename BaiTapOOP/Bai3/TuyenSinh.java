package BaiTapOOP.Bai3;

import java.util.*;

public class TuyenSinh {
    ArrayList<ThiSinhKA> listKA;
    ArrayList<ThiSinhKB> listKB;
    ArrayList<ThiSinhKC> listKC;

    public TuyenSinh() {
        this.listKA = new ArrayList<>();
        this.listKB = new ArrayList<>();
        this.listKC = new ArrayList<>();
    }

    public void themThiSinh() {


        String soBaoDanh, hoTen, diaChi, mucUuTien;
        String input;
        Scanner sc = new Scanner(System.in);

        System.out.println("Chọn khối thi thêm thí sinh.");
        System.out.println("[1]. Thêm thí sinh khối A");
        System.out.println("[2]. Thêm thí sinh khối B");
        System.out.println("[3]. Thêm thí sinh khối C");
        System.out.print("Chọn [1-3]:  ");

        input = sc.next();

        switch (input) {
            case "1":
                System.out.println("Nhập thông tin thí sinh khối A.");
                soBaoDanh = nhapSBD();
                hoTen =  nhapHT();
                diaChi = nhapDC();
                mucUuTien = nhapUT();
                listKA.add(new ThiSinhKA(soBaoDanh, hoTen, diaChi, mucUuTien));
                break;

            case "2":
                System.out.println("Nhập thông tin thí sinh khối B");
                soBaoDanh = nhapSBD();
                hoTen = nhapHT();
                diaChi = nhapDC();
                mucUuTien = nhapUT();
                listKB.add(new ThiSinhKB(soBaoDanh, hoTen, diaChi, mucUuTien));
                break;

            case "3":
                System.out.println("Nhập thông tin khối C");
                soBaoDanh = nhapSBD();
                hoTen = nhapHT();
                diaChi = nhapDC();
                mucUuTien = nhapUT();
                listKC.add(new ThiSinhKC(soBaoDanh, hoTen,diaChi, mucUuTien));
                break;

            default:
                System.out.println("Chỉ nhập giá trị [1-3].");
        }
    }

    public void hienThiThiSinh() {

        System.out.println("Danh sách thí sinh khối A.");
        System.out.println();
        listKA.forEach(tsKa -> System.out.println(tsKa));
        System.out.println();

        System.out.println("Danh sách thí sinh khối B");
        System.out.println();
        listKB.forEach(tsKB -> System.out.println(tsKB));
        System.out.println();

        System.out.println("Danh sách thí sinh khối C");
        System.out.println();
        listKC.forEach(tsKC -> System.out.println(tsKC));
        System.out.println();
    }

    public void timKiemThiSinh() {
        String soBD;
        Scanner sc = new Scanner(System.in);
        List<ThiSinh> dsTK = new ArrayList<>();

        System.out.print("\nNhập số báo danh thí sinh cần tìm: ");
        soBD = sc.next();

        timKiem(dsTK, listKA, soBD);
        timKiem(dsTK, listKB, soBD);
        timKiem(dsTK, listKC, soBD);

        if (dsTK.isEmpty()) {
            System.out.println("Không có số báo danh đã nhập");
        }
        else {
            System.out.println("Thí sinh cần tìm là." + dsTK.get(0));
        }

    }

    public void thoatChuongTrinh() {
        System.out.println("Thoát chương trình");
        System.exit(0);
    }

    private void timKiem(List<ThiSinh> alist, ArrayList<? extends ThiSinh> bList, String sbd) {
        for (ThiSinh ts : bList) {
            if(ts.getSoBaoDanh().equals(sbd)) {
                alist.add(ts);
            }
        }
    }

    // Nhập số báo danh
    private String nhapSBD() {
        String sbd;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số báo danh: ");
        sbd = sc.next();
        return sbd;
    }

    // Nhập họ và tên
    private String nhapHT() {
        String ht;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập họ và tên: ");
        ht = sc.nextLine();
        return ht;
    }

    // nhập địa chỉ
    private String nhapDC() {
        String dc;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập địa chỉ: ");
        dc = sc.nextLine();
        return dc;
    }

    // nhập mức ưu tiên
    private String nhapUT() {
        String ut;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập mức độ ưu tiên");
        ut = sc.next();
        return ut;
    }

}




















































