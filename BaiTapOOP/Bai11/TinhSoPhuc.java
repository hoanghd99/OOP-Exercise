package BaiTapOOP.Bai11;

import java.util.Scanner;

public class TinhSoPhuc extends SoPhuc{

    public TinhSoPhuc() {

    }

    public TinhSoPhuc(double real, double imaginary) {
        super(real, imaginary);
    }

    public SoPhuc enterSP() {
        Scanner sc = new Scanner(System.in);
        double real, imaginary;
        System.out.println("Nhập phần thực: ");
        real = sc.nextDouble();
        System.out.println("Nhập phần ảo: ");
        imaginary = sc.nextDouble();
        SoPhuc soPhuc = new SoPhuc(real, imaginary);
        return soPhuc;
    }

    public void displaySP(SoPhuc soPhuc) {
        System.out.println("Hiển thị số phức:  " + soPhuc.toString());
    }

    public SoPhuc addSP(SoPhuc soPhuc, SoPhuc soPhuc2)
    {
        SoPhuc addResult = new SoPhuc();
        double realAdd = soPhuc.getReal() + soPhuc2.getReal();
        double imaginaryAdd = soPhuc.getImaginary() + soPhuc2.getImaginary();
        addResult = new SoPhuc(realAdd, imaginaryAdd);
        return addResult;
    }

    public SoPhuc multipleSP(SoPhuc soPhuc, SoPhuc soPhuc2) {

        SoPhuc mulResult = new SoPhuc();
        double realMul = soPhuc.getReal() * soPhuc2.getReal() - soPhuc.getImaginary() * soPhuc2.getImaginary();
        double imaginaryMul = soPhuc.getReal() * soPhuc2.getImaginary() + soPhuc.getImaginary() * soPhuc2.getReal();
        mulResult = new SoPhuc(realMul, imaginaryMul);
        return mulResult;
    }

}



































































