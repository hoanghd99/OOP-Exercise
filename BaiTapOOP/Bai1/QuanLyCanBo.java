package BaiTapOOP.Bai1;
import java.util.ArrayList;

public class QuanLyCanBo {
    private ArrayList<CanBo> listCanBo;

    public QuanLyCanBo()
    {
        this.listCanBo = new ArrayList<CanBo>();
    }

    public void addCanBo(CanBo canBoIn) {
        listCanBo.add(canBoIn);
    }

    public void searchTheoTen(String name)
    {
        for(CanBo canBo : listCanBo) {
            if(canBo.getName().equals(name))
                System.out.println(canBo);
            else
                continue;
        }
        //System.out.println("Khong co can bo ten: " + name);

//        for (CanBo canBo : listCanBo) {
//            if (canBo.getName().equals(name) == false)
//                System.out.println("Khong can bo nao ten " + name);
//        }
    }

    public void displayCanBo() {
        for (CanBo canBo : listCanBo)
        {
            System.out.println(canBo);
            System.out.println();
        }
    }

    public void exitProgram() {
        System.out.println("Thoat chuong trinh");
        System.exit(0);
    }
}




































