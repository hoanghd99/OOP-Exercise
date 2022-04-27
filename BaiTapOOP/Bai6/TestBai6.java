package BaiTapOOP.Bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBai6 {
    public static void main(String[] args) {

        ClassRoom classRoom = new ClassRoom();
        String input;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Phần mềm quản lý học sinh.");
            System.out.println("[1]. Thêm học sinh mới.");
            System.out.println("[2]. Hiển thị các học sinh 20 tuổi.");
            System.out.println("[3]. Hiển thị các học sinh có tuổi là 23 và quê ở Đà Nẵng.");
            System.out.println("[4]. Thoát chương trình.");
            System.out.print("Chọn [1-4]: ");

            input = sc.next();

            switch (input) {
                case "1":   System.out.println();
                            classRoom.addStudent(createStudent());
                            break;

                case "2":   System.out.println();
                            display20(classRoom.getListST());
                            break;

                case "3":   System.out.println();
                            display23DN(classRoom.getListST());
                            break;
                case "4":
                            System.out.println("Kết thúc chương trinh");

                default:
                    System.out.print("Chọn giá trị từ [1-4]: ");
            }
        }
        while (input != "4");

    }

    public static Student createStudent() {
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        String name,town;
        int age;

        System.out.println();
        System.out.print("Nhập tên học sinh: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi học sinh: ");
        age = scInt.nextInt();
        System.out.print("Nhập quê quán học sinh: ");
        town = sc.nextLine();

        Student student = new Student(name, age, town);
        return student;

    }

    public static void display20(ArrayList<Student> list) {
        ArrayList<Student> list20 = new ArrayList<>();
        for (Student student : list) {
            if (student.getAge() == 20) {
                list20.add(student);
            }
        }

        if (list20.isEmpty()) {
            System.out.println("Không có học sinh nào 20 tuổi");
        }
        else {
            for (Student student : list20) {
                System.out.println(student);
                System.out.println();
            }
        }
    }

    public static void display23DN(ArrayList<Student> list) {

        ArrayList<Student> listTK = new ArrayList<>();

        for (Student student : list) {
            if (student.getAge() == 23 && student.getTown().equals("Đà Nẵng")) {
                listTK.add(student);
            }
        }

        if (listTK.isEmpty()) {
            System.out.println("Không có học sinh nào thoả mãn yêu cầu");
        }
        else {
            for (Student student : listTK){
                System.out.println(student);
                System.out.println();
            }
        }
    }
}























































