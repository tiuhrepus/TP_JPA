/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import infra.DAO;
import Domain.BankBranch;

/**
 *
 * @author tim-b
 */
public class ServiceBankBranch {
 
        
    DAO dao;
    
    public ServiceBankBranch() {
        dao = new DAO();
    }
    
    public void createBankBranch(String address) {
        BankBranch bankBranch = new BankBranch(address);
        dao.create(bankBranch);
    }
    
}
