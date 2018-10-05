/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import infra.DAO;
import metiers.BankBranch;

/**
 *
 * @author tim-b
 */
public class Main {
   
    public static void main(String[] args){
        
        BankBranch bb1 = new BankBranch("12345", "12 avenue des Champs");
        DAO<BankBranch> daoBB1 = new DAO<>();
        daoBB1.create(bb1);
    }
}
