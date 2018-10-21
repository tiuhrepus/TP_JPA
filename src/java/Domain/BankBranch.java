package Domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class BankBranch implements Serializable {

    @Id
    @GeneratedValue
    @Column(length = 5)
    private String idAgency;
    private String address;
    private int numAgency;
    
    public BankBranch() { }
    
    public BankBranch(String address, int numAgency) {
        this.address = address;
        this.numAgency = numAgency;
    }

    public int getNumAgency() {
        return numAgency;
    }

    public void setNumAgency(int num) {
        this.numAgency = num;
    }
    
    public String getIdAgency() {
        return idAgency;
    }

    public void setIdAgency(String id) {
        this.idAgency = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
