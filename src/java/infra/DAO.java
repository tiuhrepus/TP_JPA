/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tim-b
 */
public class DAO<T> {

    private EntityManager em;
    
    public DAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BankManagerPU");
        this.em = emf.createEntityManager();
    }
    
    public T get(Class<T> entityClass, Object primaryKey) {
        T entity;
        
        em.getTransaction().begin();
        entity = em.find(entityClass, primaryKey);
        em.getTransaction().commit();
        
        return entity;
    }
    
    public void remove(T entity) {
        em.getTransaction().begin();
        em.remove(entity);
        em.getTransaction().commit();
    }

    public void update(T entity) {
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
    }
    
    public void create(T entity){
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
    }

    /**
     * Méthode qui permet de récupérer tous les 
     * tuples d'une table
     * @param entity : nom de la table qui contient les tuples à récupérer
     * @return : liste de tous les tuples contenus dans la table
     */
    public  List<T> findAllTuples(Class<T> entityClass){
        List result =  em.createQuery(String.format("SELECT t FROM %s t", entityClass.getName()),entityClass).getResultList();
        return result;
    }
    
}
