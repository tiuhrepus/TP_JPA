/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metiers;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author tim-b
 */
@Entity
public class Client implements Serializable {
    
    @Id private int numClient;
    private String nom;
    private String prenom;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateNaissance;
    

    public int getNumClient() {
        return numClient;
    }

    public void setNumClient(int numClient) {
        this.numClient = numClient;
    }
}
