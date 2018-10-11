/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Client implements Serializable {
    
    @Id
    @Column(length = 8)
    @GeneratedValue
    private int numClient;
    private String nom;
    private String prenom;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateNaissance;
    
    @ManyToMany
    @JoinTable(name = "ACCOUNT_CLIENT",
        joinColumns = @JoinColumn(name = "CLIENTNB", referencedColumnName = "NUMCLIENT"),
        inverseJoinColumns = @JoinColumn(name = "ACCOUNTNB", referencedColumnName = "ACCOUNTNB"))
    private Collection<Account> accounts;
    
    public Client() {
    }
    
    public Client(String nom,
            String prenom,
            Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.accounts = new ArrayList<>();
    }

    public int getNumClient() {
        return numClient;
    }

    public void setNumClient(int numClient) {
        this.numClient = numClient;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Collection<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Collection<Account> accounts) {
        this.accounts = accounts;
    }
    
    
}
