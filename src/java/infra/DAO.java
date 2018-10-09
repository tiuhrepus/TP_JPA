/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

import Domain.Client;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tim-b
 */
public class DAO {
    
    //@PersistenceContext(unitName = "BankManagerPU")
    private EntityManager em;
    //emf.createEntityManager();
    
    public DAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BankManagerPU");
        this.em = emf.createEntityManager();
    }
    
    public void create(Client entity){
        em.persist(entity);
    }
}
