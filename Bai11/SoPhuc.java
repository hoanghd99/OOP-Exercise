package BaiTapOOP.Bai11;

public class SoPhuc {
    public double real;
    public double imaginary;

    public SoPhuc() {

    }

    public SoPhuc(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return "Số phức: " + real + " + " + imaginary + "i";
    }
}












































