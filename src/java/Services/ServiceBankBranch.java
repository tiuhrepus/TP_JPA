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
 
        
    DAO<BankBranch> daoBankBranch;
    
    public ServiceBankBranch() {
        daoBankBranch = new DAO();
    }
    
    public void createBankBranch(String address) {
        BankBranch bankBranch = new BankBranch(address);
        daoBankBranch.create(bankBranch);
    }
    
    public void deleteBankBranch(BankBranch bankBranch) {
        daoBankBranch.remove(bankBranch);
    }
    
    public void saveBankBranch(BankBranch bankBranch) {
        daoBankBranch.update(bankBranch);
    }
    
    public BankBranch getBankBranch(String numAgency) {
        return daoBankBranch.get(BankBranch.class, numAgency);
    }
    
}