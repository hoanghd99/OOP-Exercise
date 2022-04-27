package BaiTapOOP.Bai7;

import OOP.DefaultAndStatic.A;

import java.util.ArrayList;

public class TeacherStaff {

    public ArrayList<Teacher> listTeacher;

    public TeacherStaff() {
        this.listTeacher = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        listTeacher.add(teacher);
    }

    public void removeTeacher(String teacherCodeIn) {

        ArrayList<Teacher> listDel = new ArrayList<>();

        for (int i = 0; i < listTeacher.size(); i++) {
            if (listTeacher.get(i).getTeacherCode().equals(teacherCodeIn)){
                listDel.add(listTeacher.get(i));
            }
        }

        if (listDel.isEmpty()) {
            System.out.println("Không có mã giáo viên này");
        }
        else {
            listDel.remove(0);
            System.out.println("Đã xoá giáo viên có mã " + teacherCodeIn);
        }
    }

    public ArrayList<Teacher> getListTeacher() {
        return listTeacher;
    }
}




















