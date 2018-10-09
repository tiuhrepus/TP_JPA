package Domain;

import javax.persistence.*;

@Entity
public class Account {
    
    @Id
    @Column(length = 11)
    @GeneratedValue
    private String accountNb;
    @Column(length = 27)
    @GeneratedValue
    private String iban;
    private String label;
    private int balance;
    
    public Account() {
        this.balance = 0;
    }
    
    public Account(String label) {
        this.label = label;
        this.balance = 0;
    }
    
    
}
