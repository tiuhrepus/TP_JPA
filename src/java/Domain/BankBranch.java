package Domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class BankBranch implements Serializable {

    @Id
    @GeneratedValue
    @Column(length = 5)
    private String numAgency;
    private String address;
    
    public BankBranch() { }
    
    public BankBranch(String address) {
        this.address = address;
    }

    public String getNumAgency() {
        return numAgency;
    }

    public void setNumAgency(String num) {
        this.numAgency = num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
