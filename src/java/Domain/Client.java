/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Client {
    
    @Id
    @Column(length = 8)
    @GeneratedValue
    private int numClient;
    private String nom;
    private String prenom;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateNaissance;
    
    
    

    public int getNumClient() {
        return numClient;
    }

    public void setNumClient(int numClient) {
        this.numClient = numClient;
    }
}
