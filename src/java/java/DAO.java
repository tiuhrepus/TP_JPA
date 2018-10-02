/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tim-b
 */
public class DAO<T> {
    
    @PersistenceContext(unitName = "JPA_unit")
    private EntityManager em;
    
    public void create(){
        
    }
}
