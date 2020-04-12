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
public class LopHoc {
    QLDS qldsHS = new QLDS();
    QLDS qldsGV = new QLDS();
    
    public LopHoc() {
    }        
    
    public int themHocSinh(HocSinh hs){
        qldsHS.them(hs);
        return 1;
    }
    
    public int themGVGD(GiaoVien gv){
        qldsGV.them(gv);
        return 1;
    }
    
    public int inDSHS(){
        qldsHS.inDS();
        return 1;
    }
    
    public int inDSGVGD(){
        qldsGV.inDS();
        return 1;
    }
}
