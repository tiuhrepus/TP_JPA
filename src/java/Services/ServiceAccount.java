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
import java.util.ArrayList;
import java.util.List;

public class ServiceAccount {
    
        DAO<Account> daoAccount;
    
    public ServiceAccount() {
        daoAccount = new DAO();
    }
    
    public void createAccount(String label, String iban, BankBranch bankBranch, ArrayList<Client> clients) {
        Account account = new Account(label,iban, bankBranch, clients);
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
    
    public List<Account> getAllAccounts(){
        return (List<Account>)daoAccount.findAllTuples(Account.class);
    }
    
}
