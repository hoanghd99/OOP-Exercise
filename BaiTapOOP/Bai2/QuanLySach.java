package BaiTapOOP.Bai2;

import OOP.DefaultAndStatic.A;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach{
    private ArrayList<Sach>    listSach;
    private ArrayList<TapChi>  listTapChi;
    private ArrayList<BaoChi>  listBaoChi;



    public QuanLySach() {
        this.listSach = new ArrayList<>();
        this.listBaoChi = new ArrayList<>();
        this.listTapChi = new ArrayList<>();
    }

    public void themTaiLieu()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Thêm tài liệu.");
        System.out.println("[1]. Sách ");
        System.out.println("[2]. Tạp chí");
        System.out.println("[3]. Báo");
        System.out.print("Nhập loại tài liệu muốn thêm [1]/ [2]/ [3]: ");
        String input = sc.next();

        switch(input)
        {
            case "1": Sach sachMoi = NhapSach();
                         listSach.add(sachMoi);
                         break;
            case "2": TapChi tapChiMoi = NhapTapChi();
                         listTapChi.add(tapChiMoi);
                         break;
            case "3": BaoChi baoMoi = NhapBao();
                         listBaoChi.add(baoMoi);
            default:     break;
        }

    }

    public void xoaTaiLieu() {
        String input;
        String documentCode;
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Xoá tài liệu.");
        System.out.println("[1]. Sách ");
        System.out.println("[2]. Tạp chí");
        System.out.println("[3]. Báo");
        System.out.print("Nhập loại tài liệu muốn xoá [1]/ [2]/ [3]: ");
        input = sc.next();

        switch(input)
        {
            case "1":    System.out.print("Nhập mã sách cần xoá: ");
                         documentCode = sc.next();
                         xoaTaiLieuS(listSach, documentCode);
                         break;

            case "2":    System.out.print("Nhập mã tạp chí cần xoá: ");
                         documentCode = sc.next();
                         xoaTaiLieuS(listTapChi, documentCode);
                         break;

            case "3":    System.out.println("Nhập mã báo chí cần xoá: ");
                         documentCode = sc.next();
                         xoaTaiLieuS(listBaoChi, documentCode);
                         System.out.println();
                         break;

            default:     break;
        }
    }

    public void hienThiTaiLieu() {
        String input;
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Hiển thị thông tin tài liệu.");
        System.out.println("[1]. Sách ");
        System.out.println("[2]. Tạp chí");
        System.out.println("[3]. Báo");
        System.out.println("Nhập loại tài liệu muốn hiển thị [1]/ [2]/ [3]: ");
        input = sc.next();

        switch(input)
        {
            case "1":
                System.out.println("Danh sách tài liệu sách.");
                System.out.println();
                hienThiTaiLieuS(listSach);
                break;

            case "2":
                System.out.println("Danh sách tài liệu tạp chí.");
                System.out.println();
                hienThiTaiLieuS(listTapChi);
                break;

            case "3":
                System.out.println("Danh sách tài liệu báo.");
                System.out.println();
                hienThiTaiLieuS(listBaoChi);
                break;

            default: break;
        }

    }

    public void timKiemTaiLieu() {

        String input;
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Tìm kiếm tài liệu theo loại tài liệu: ");
        System.out.println("[1]. Sách ");
        System.out.println("[2]. Tạp chí");
        System.out.println("[3]. Báo");
        System.out.print("Nhập loại tài liệu muốn tìm kiếm: [1]/ [2]/ [3]: ");
        input = sc.next();

        switch (input)
        {
            case "1": timSach();
                      break;
            case "2": timTapChi();
                      break;
            case "3": timBaoChi();
                      break;
        }
    }

    public void thoatChuongTrinh() {
        System.out.println();
        System.out.println("Thoát chương trình");
        System.exit(0);
    }


    private void xoaTaiLieuS(ArrayList<? extends TaiLieu> list, String documentCode) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getDocumentCode().equals(documentCode)) {
                list.remove(i);
            }
        }

    }

    private void hienThiTaiLieuS(ArrayList<? extends TaiLieu> list) {
        for (TaiLieu element : list) {
            System.out.println(element);
        }
    }

    private void timSach() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tìm kiếm tài liệu sách.");
        System.out.println("[1]. Tìm theo tên tác giả.");
        System.out.println("[2]. Tìm theo số trang");
        System.out.println("Nhập loại tìm kiếm [1]/ [2]: ");
        String input2 = sc.next();
        ArrayList<Sach> sachTimKiem = new ArrayList<>();
        switch (input2)
        {
            case "1":
                System.out.print("Nhập tên tác giả: ");
                String tenTacGia = sc.next();
                for (Sach sach : listSach) {
                    if(sach.getTenTacGia().equals(tenTacGia)) {
                        sachTimKiem.add(sach);
                    }
                }
                if (sachTimKiem.isEmpty()) {
                    System.out.println("Không có mã tài liệu này.");
                }
                else {
                    System.out.println("Tài liệu cần tìm là: ");
                    System.out.println();
                    sachTimKiem.forEach(sach -> System.out.println(sach));
                }
                break;

            case "2":
                System.out.print("Nhập số trang: ");
                int soTrang = sc.nextInt();
                for (Sach sach : listSach) {
                    if (sach.getSoTrang() == soTrang) {
                        sachTimKiem.add(sach);
                    }
                }
                if (sachTimKiem.isEmpty()) {
                    System.out.println("Không có sách có số trang này.");
                }
                else
                {
                    System.out.println("Tài liệu sách cần tìm là: ");
                    sachTimKiem.forEach(sach -> System.out.println(sach));
                }
                break;

            default: break;
        }
    }

    private void timTapChi() {

        Scanner sc = new Scanner(System.in);
        ArrayList<TapChi> tapChiTK = new ArrayList<>();
        System.out.println("Tìm kiếm tài liệu tạp chí.");
        System.out.println("[1]. Tìm kiếm theo số phát hành.");
        System.out.println("[2]. Tìm kiếm theo tháng phát hành.");
        System.out.println("Nhập loại tìm kiếm [1]/ [2]: ");
        String input2 = sc.next();
        switch (input2)
        {
            case "1":
                System.out.println("Nhập số phát hành: ");
                String soPH = sc.next();
                for (TapChi tapChi : listTapChi) {
                    if (tapChi.getSoPhatHanh().equals(soPH)) {
                        tapChiTK.add(tapChi);
                    }
                }
                if (tapChiTK.isEmpty()) {
                    System.out.println("Không có tạp chí nào có số phát hành này");
                }
                else {
                    System.out.println("Tạp chí tìm được theo số phát hành: " + soPH);
                    tapChiTK.forEach(tapChi -> System.out.println(tapChi));
                }
                break;

            case "2":
                System.out.println("Nhập tháng phát hành: ");
                String thangPH = sc.next();
                for (TapChi tapChi : listTapChi) {
                    if (tapChi.getThangPhatHanh().equals(thangPH)) {
                        tapChiTK.add(tapChi);
                    }
                }
                if (tapChiTK.isEmpty()) {
                    System.out.println("Không có tạp chí nào có tháng phát hành này");
                }
                else {
                    System.out.println("Tạp chí tìm được theo tháng phát hành");
                    tapChiTK.forEach(tapChi -> System.out.println(tapChi));
                }
                break;
        }
    }

    private void timBaoChi() {
        Scanner sc = new Scanner(System.in);

        ArrayList<BaoChi> baoChiTK = new ArrayList<>();
        System.out.println("Tìm kiếm tài liệu báo chí.");
        System.out.println("Tìm theo ngày phát hành.");
        System.out.println("Nhập ngày phát hành dạng dd/mm/yy: ");
        String ngayPH = sc.next();
        for (BaoChi baoChi : listBaoChi) {
            if (baoChi.getNgayPhatHanh().equals(ngayPH)) {
                baoChiTK.add(baoChi);
            }
        }
        if (baoChiTK.isEmpty()) {
            System.out.println("Không có báo có ngày phát hành này.");
        }
        else {
            System.out.println("Danh sách báo có ngày phát hành này.");
            baoChiTK.forEach(baoChi -> System.out.println(baoChi));
        }
    }

    private Sach NhapSach() {
        String documentCode, nhaXuatBan;
        int soBan;
        String tacGiaSach;
        int soTrangSach;
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        documentCode = nhapDocumentCode();
        nhaXuatBan =nhapNhaXuatBan();
        soBan = nhapSoBan();

        System.out.print("Nhập tác giả sách: ");
        tacGiaSach = sc.nextLine();
        System.out.print("Nhập số trang sách: ");
        soTrangSach = scInt.nextInt();

        Sach sachMoi = new Sach(documentCode, nhaXuatBan, soBan, tacGiaSach, soTrangSach);
        return sachMoi;
    }

    private TapChi NhapTapChi()
    {
        String documentCode, nhaXuatBan;
        int soBan;
        String soPhatHanh, thangPhatHanh;
        Scanner sc = new Scanner(System.in);

        documentCode = nhapDocumentCode();
        nhaXuatBan = nhapNhaXuatBan();
        soBan = nhapSoBan();

        System.out.println("Nhập số phát hành tạp chí: ");
        soPhatHanh = sc.next();
        System.out.println("Nhập tháng phát hành tạp chí: ");
        thangPhatHanh = sc.next();

        TapChi tapChiMoi = new TapChi(documentCode, nhaXuatBan, soBan, soPhatHanh, thangPhatHanh);
        return tapChiMoi;
    }

    private BaoChi NhapBao() {
        String documentCode, nhaXuatBan;
        int soBan;
        String ngayPH;
        Scanner sc = new Scanner(System.in);

        documentCode = nhapDocumentCode();
        nhaXuatBan = nhapNhaXuatBan();
        soBan = nhapSoBan();
        System.out.println("Nhập ngày phát hành dạng dd/mm/yy: ");
        ngayPH = sc.next();

        BaoChi baoMoi = new BaoChi(documentCode, nhaXuatBan, soBan, ngayPH);
        return baoMoi;
    }

    private String nhapDocumentCode() {
        String documentCodeIn;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã tài liệu: ");
        documentCodeIn = sc.next();
        return documentCodeIn;
    }

    private String nhapNhaXuatBan() {
        String nhaXbIn;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên nhà xuất bản: ");
        nhaXbIn = sc.nextLine();
        return nhaXbIn;
    }

    private int nhapSoBan() {
        int soBanIn;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số bản phát hành: ");
        soBanIn = sc.nextInt();
        return soBanIn;
    }

}















































