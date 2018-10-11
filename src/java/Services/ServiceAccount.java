/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Domain.Account;
import Domain.BankBranch;
import Domain.Client;
import infra.DAO;

public class ServiceAccount {
    
        DAO<Account> daoAccount;
    
    public ServiceAccount() {
        daoAccount = new DAO();
    }
    
    public void createAccount(String label, String iban, BankBranch bankBranch, Client client) {
        Account account = new Account(label,iban, bankBranch, client);
        daoAccount.create(account);
    }
    
    public void deleteAccount(Account account) {
        daoAccount.remove(account);
    }
    
    public void saveAccount(Account account) {
        daoAccount.update(account);
    }
    
    public Account getAccount(String accountNb) {
        return daoAccount.get(Account.class, accountNb);
    }
    
}
