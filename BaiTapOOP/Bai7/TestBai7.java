package BaiTapOOP.Bai7;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBai7 {
    public static void main(String[] args) {

        TeacherStaff listTC = new TeacherStaff();
        Scanner sc = new Scanner(System.in);
        String input;

        do {

            System.out.println("Phần mềm quản lý giáo viên.");
            System.out.println("[1]. Thêm thông tin giáo viên");
            System.out.println("[2]. Xoá giáo viên");
            System.out.println("[3]. Tính lương giáo viên.");
            System.out.print("Chọn giá trị [1-3]: ");

            input = sc.next();

            switch (input) {

                case "1":   Teacher teacher = createTeacher();
                            listTC.addTeacher(teacher);
                            break;

                case "2":   delTeacher(listTC);
                            break;
                case "3":   searchSalary(listTC);
                            break;
                default:
                    System.out.println("Chỉ chọn giá trị từ [1-3].");
            }

        }while (input != "3");


    }

    public static Teacher createTeacher() {
        String name,town, teacherCode;
        int age;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println();
        System.out.print("Nhập tên giáo viên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi giáo viên: ");
        age =sc2.nextInt();
        System.out.print("Nhập quê quán giáo viên: ");
        town = sc.nextLine();
        System.out.print("Nhập mã giáo viên: ");
        teacherCode = sc.nextLine();

        Teacher teacher = new Teacher(name, age, town, teacherCode);

        System.out.print("Nhập lương cứng giáo viên: ");
        double baseSalary = sc2.nextDouble();
        System.out.println("Nhập lương thưởng giáo viên: ");
        double bonusSalary = sc2.nextDouble();
        System.out.println("Nhập lương phạt giáo viên: ");
        double negSalary = sc2.nextDouble();

        teacher.setBaseSalary(baseSalary);
        teacher.setBonusSalary(bonusSalary);
        teacher.setNegSalary(negSalary);
        teacher.calculateNetSalary();

        return teacher;
    }

    public static void delTeacher(TeacherStaff listIn)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã giáo viên cần xoá. ");
        String teacherCode = sc.nextLine();
        listIn.removeTeacher(teacherCode);
    }

    public static void searchSalary(TeacherStaff listIn)
    {
        Scanner sc = new Scanner(System.in);
        String teacherCode;
        ArrayList<Teacher> listTK = new ArrayList<>();
        System.out.print("Nhập mã giáo viên: ");
        teacherCode = sc.nextLine();

        for (Teacher teacher : listIn.getListTeacher()) {
            if (teacher.getTeacherCode().equals(teacherCode)) {
                listTK.add(teacher);
            }
        }

        if (listTK.isEmpty()) {
            System.out.println("Không có mã giáo viên này");
        }
        else
        {
            System.out.println("Lương thực nhận giáo viên là: " + listTK.get(0).getNetSalary());
        }
    }

}

































