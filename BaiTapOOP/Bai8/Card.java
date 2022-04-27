package BaiTapOOP.Bai8;

public class Card {

    private String rentCode;
    private int rentDay;
    private int returnDay;
    private String bookCode;
    private Student student;

    public Card(String rentCode, int rentDay, int returnDay, String bookCode, Student student) {
        this.rentCode = rentCode;
        this.rentDay = rentDay;
        this.returnDay = returnDay;
        this.bookCode = bookCode;
        this.student = student;
    }

    public void setRentCode(String rentCode)
    {
        this.rentCode = rentCode;
    }

    public void setRentDay(int rentDay) {
        this.rentDay = rentDay;
    }

    public void setReturnDay(int returnDay) {
        this.returnDay = returnDay;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getRentCode() {
        return rentCode;
    }

    public int getRentDay() {
        return rentDay;
    }

    public int getReturnDay() {
        return returnDay;
    }

    public String getBookCode() {
        return bookCode;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return "Mã thẻ mượn: " + rentCode
                + "\n" + "Ngày mượn: " + rentDay
                + "\n" + "Ngày trả: " + returnDay
                + "\n" + "Mã sách: " + bookCode
                + "\n" + "Thông tin sinh viên"
                + "\n" + student.toString();

    }

}

























































