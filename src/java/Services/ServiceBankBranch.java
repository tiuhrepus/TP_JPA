/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import infra.DAO;
import Domain.BankBranch;
import java.util.List;

/**
 *
 * @author tim-b
 */
public class ServiceBankBranch {
 
        
    DAO<BankBranch> daoBankBranch;
    
    public ServiceBankBranch() {
        daoBankBranch = new DAO();
    }
    
    public void createBankBranch(String address, String numAgency) {
        BankBranch bankBranch = new BankBranch(address, numAgency);
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
    
    public List<BankBranch> getAllBankBranch(){
        return (List<BankBranch>)daoBankBranch.findAllTuples(BankBranch.class);
    }
    
}
