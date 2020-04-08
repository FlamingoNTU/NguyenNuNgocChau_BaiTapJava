/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyennungocchau_59130160_bt1;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLDS implements IQLDS {
    
    ArrayList<CaNhan> dscanhan;

    public QLDS() {
    }

    public QLDS(ArrayList<CaNhan> dscanhan) {
        this.dscanhan = dscanhan;
    }

    public ArrayList<CaNhan> getDscanhan() {
        return dscanhan;
    }

    public void setDscanhan(ArrayList<CaNhan> dscanhan) {
        this.dscanhan = dscanhan;
    }
    
    @Override
    public int them(CaNhan p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int xoa(String ten) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inDS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
