package Domain;

import javax.persistence.*;

@Entity
public class BankBranch {

    @Id
    @GeneratedValue
    @Column(length = 5)
    private String num;
    private String address;
    
    public BankBranch(String num, String address) {
        this.num = num;
        this.address = address;
    }
    
    
}
