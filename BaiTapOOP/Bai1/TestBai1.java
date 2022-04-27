package BaiTapOOP.Bai1;

public class TestBai1 {
    public static void main(String[] args) {
        QuanLyCanBo danhsach = new QuanLyCanBo();

        CanBo canBo1 = new CanBo("Nguyen Van A", "25", "Nam");
        CanBo congNhan1 = new CongNhan("Nguyen Van B", "24", "Nam", "Bac 3");
        CanBo kysu1 = new KySu("Nguyen Van C", "23", "Nam", "DTVT");
        CanBo nhanVien1 = new NhanVien("Nguyen D", "24", "Nu", "Nhan su");

        // Test method addCanBo()
        danhsach.addCanBo(canBo1);
        danhsach.addCanBo(congNhan1);
        danhsach.addCanBo(kysu1);
        danhsach.addCanBo(nhanVien1);


        // Test method searchTheoTen
        System.out.println("Test searchTheoTen()");
        danhsach.searchTheoTen("Nguyen Van B");
        System.out.println();

        // Test displayCanBo()
        System.out.println("test displayCanBo()");
        danhsach.displayCanBo();
        System.out.println();

        // Test exitProgram()
        System.out.println("Test exitProgram()");
        danhsach.exitProgram();

    }
}
