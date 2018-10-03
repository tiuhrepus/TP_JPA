/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tim-b
 */
public class DAO {
    
    @PersistenceContext(unitName = "BankManagerPU")
    private EntityManager em;
    
    public void create(Object entity){
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction();
        em.close();
    }
}
