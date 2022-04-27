package BaiTapOOP.Bai8;

import java.util.Scanner;

public class TestBai8 {
    public static void main(String[] args) {

        CardCollection cardCollection = new CardCollection();

        Scanner sc = new Scanner(System.in);
        String input;

        do {
            System.out.println("Phần mềm quản lý thư viện.");
            System.out.println("[1]. Thêm thông tin thẻ mượn.");
            System.out.println("[2]. Xoá thẻ mượn theo mã thẻ mượn.");
            System.out.println("[3]. Hiển thị thông tin các thẻ mượn.");
            System.out.println("[4]. Thoát chương trình.");
            System.out.print("Nhập lựa chọn [1-4]: ");

            input = sc.next();

            switch (input) {

                case "1":   cardCollection.addCard(createCard());
                            break;
                case "2":   delCard(cardCollection);
                            break;
                case "3":   System.out.println();
                            cardCollection.display();
                            break;
                case "4":
                            System.out.println("Kết thúc chương trình.");
            }
        }
        while (input != "4");

    }

    public static Card createCard() {
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        String rentCode, bookCode;
        int rentDay, returnDay;

        Student aStudent = createStudent();

        System.out.print("Nhập mã thẻ mượn: ");
        rentCode = sc.nextLine();

        do {
            System.out.print("Nhập ngày mượn: ");
            rentDay = scInt.nextInt();
            System.out.print("Nhập ngày trả: ");
            returnDay = scInt.nextInt();
        }
        while (rentDay < 0 || returnDay < 0);

        System.out.print("Nhập mã sách: ");
        bookCode = sc.nextLine();

        Card card = new Card(rentCode, rentDay, returnDay, bookCode, aStudent);
        return card;
    }

    public static Student createStudent()
    {
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        String name, classCourse;
        int age;

        System.out.print("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.println("Nhập lớp sinh viên: ");
        classCourse = sc.nextLine();
        System.out.println("Nhập tuổi sinh viên: ");
        age = scInt.nextInt();
        System.out.println();

        Student student = new Student(name, age, classCourse);
        return student;
    }

    public static void delCard(CardCollection listCardIn) {
        String rentCode;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã thẻ mượn: ");
        rentCode = sc.nextLine();
        listCardIn.removeCard(rentCode);
    }
}




































