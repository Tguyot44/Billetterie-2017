/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.JFrameUpdate;

/**
 *
 * @author tguyot
 */
public class CtrlUpdate {
    private CtrlPrincipal ctrlPrin;
    JFrameUpdate vue = new JFrameUpdate();
    public CtrlUpdate(CtrlPrincipal ctrlPrin) {
        this.ctrlPrin = ctrlPrin;
        
    }
    
    public JFrameUpdate getVue(){
        return vue;
    }
}
