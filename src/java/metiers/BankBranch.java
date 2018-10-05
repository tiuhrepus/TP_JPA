/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metiers;

import javax.persistence.JoinColumn;

/**
 *
 * @author tim-b
 */
public class BankBranch {

    @JoinColumn(nullable = false)
    private BankBranch bb;

    private String num;
    private String adresse;
    
    public BankBranch(String num, String adresse) {
        this.num = num;
        this.adresse = adresse;
    }
    
    
}
