/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyennungocchau_59130160_bt1;

/**
 *
 * @author Admin
 */
public class HocSinh extends CaNhan{
    String lop;
    String nangKhieu;

    public HocSinh() {
    }

    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    @Override
    public void setSdt(String sdt) {
        super.setSdt(sdt); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSdt() {
        return super.getSdt(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDiaChi(String diaChi) {
        super.setDiaChi(diaChi); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDiaChi() {
        return super.getDiaChi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTuoi(int tuoi) {
        super.setTuoi(tuoi); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTuoi() {
        return super.getTuoi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHoTen(String hoTen) {
        super.setHoTen(hoTen); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHoTen() {
        return super.getHoTen(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
