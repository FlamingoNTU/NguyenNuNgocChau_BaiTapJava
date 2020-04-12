/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyennungocchau_59130160_baitapjava_bai4;

/**
 *
 * @author Admin
 */
public class XeNoiThanh extends ChuyenXe {
    private int soTuyen;
    private int soKmDiDuoc;

    public XeNoiThanh() {
    }

    public XeNoiThanh(int soTuyen, int soKmDiDuoc, String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(int soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("So tuyen: " + soTuyen);
        System.out.println("So km di duoc: " + soKmDiDuoc);
    }

    
    
    
}
