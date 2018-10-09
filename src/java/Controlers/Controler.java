/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers;

import infra.DAO;

/**
 *
 * @author tim-b
 */
public class Controler {

    private DAO DAOBankBranch;
    
    public Controler() {
        this.DAOBankBranch = new DAO();
    }
    
}
