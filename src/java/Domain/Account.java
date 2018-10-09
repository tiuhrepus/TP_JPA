package Domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

@Entity
public class Account implements Serializable {
    
    @Id
    @Column(length = 11)
    @GeneratedValue
    private String accountNb;
    @Column(length = 27, unique = true)
    private String iban;
    private String label;
    @Column(scale = 2)
    private int balance;
    @OneToMany
    @JoinColumn(name = "numAgency", nullable = false)
    private BankBranch bankBranch;
    @ManyToMany(mappedBy = "accounts")
    private Collection<Client> clients;
    
    public Account() {
    }
    
    public Account(String label, String iban, BankBranch bankBranch, Client client) {
        this.label = label;
        this.iban = iban;
        this.balance = 0;
        this.bankBranch = bankBranch;
        this.clients.add(client);
    }

    public String getAccountNb() {
        return accountNb;
    }

    public void setAccountNb(String accountNb) {
        this.accountNb = accountNb;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public BankBranch getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(BankBranch bankBranch) {
        this.bankBranch = bankBranch;
    }

    public Collection<Client> getClients() {
        return clients;
    }

    public void setClients(Collection<Client> clients) {
        this.clients = clients;
    }
    
    
}
