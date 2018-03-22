/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.JFrameAuthentification;

/**
 *
 * @author tguyot
 */
public class CtrlLoginBdd {
    JFrameAuthentification vue = new JFrameAuthentification();
    private CtrlPrincipal ctrlPrin;

    public CtrlLoginBdd(CtrlPrincipal ctrlPrin) {
        this.ctrlPrin = ctrlPrin;
    }
    
    public JFrameAuthentification getVue(){
        return vue;
    }
}
