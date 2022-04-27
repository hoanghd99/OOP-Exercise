package BaiTapOOP.Bai2;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char input;
        QuanLySach listQuanLy = new QuanLySach();

        do {
            System.out.println("Chương trình quản lý tài liệu");
            System.out.println("[1]. Thêm mới tài liệu.");
            System.out.println("[2]. Xoá tài liệu theo mã tài liệu.");
            System.out.println("[3]. Hiển thị thông tin về tài liệu.");
            System.out.println("[4]. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo");
            System.out.println("[5]. Thoát chương trình");
            System.out.print("Nhập chức năng từ [1-5]: ");
            input = sc.next().charAt(0);
            switch(input)
            {
                case '1': listQuanLy.themTaiLieu();
                          break;
                case '2': listQuanLy.xoaTaiLieu();
                          break;
                case '3': listQuanLy.hienThiTaiLieu();
                          break;
                case '4': listQuanLy.timKiemTaiLieu();
                          break;
                case '5': listQuanLy.thoatChuongTrinh();
                          break;
                default:
                    System.out.print("Chỉ chọn các giá trị từ [1-5]: ");
            }
        }
        while (input != '5');

    }
}
