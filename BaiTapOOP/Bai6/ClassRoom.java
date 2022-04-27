package BaiTapOOP.Bai6;

import OOP.DefaultAndStatic.A;

import java.util.ArrayList;

public class ClassRoom {

    private ArrayList<Student> listST;

    public ClassRoom() {
        this.listST = new ArrayList<>();
    }

    public ArrayList<Student> getListST() {
        return listST;
    }

    public void addStudent(Student student) {
        listST.add(student);
    }


}

























