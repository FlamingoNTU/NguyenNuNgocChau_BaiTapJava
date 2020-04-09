/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyennungocchau_59130160_baitapjava_bai3;

/**
 *
 * @author Admin
 */
public class SinhVienIT extends SinhVienPoly{
    private double diemJava;
    private double diemCss;
    private double Html;

    public SinhVienIT() {
    }

    public SinhVienIT(double diemJava, double diemCss, double Html, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.Html = Html;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public double getHtml() {
        return Html;
    }

    public void setHtml(double Html) {
        this.Html = Html;
    }
    
    @Override
    public void getDiem(){
        
    }
}
