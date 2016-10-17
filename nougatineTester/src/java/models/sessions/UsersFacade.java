/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.sessions;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import models.entities.Users;

/**
 *
 * @author kuungfu-sheep
 */
@Stateless
public class UsersFacade extends AbstractFacade<Users> {

    @PersistenceContext(unitName = "nougatineTesterPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsersFacade() {
        super(Users.class);
    }
    
    
    public Users findUserByPseudo(String pseudo){
        TypedQuery<Users> query = em.createNamedQuery("findByPseudo", Users.class);
        query.setParameter(0, pseudo);
        List<Users> results = query.getResultList();
        
        if(results.isEmpty()){
            return null;
        }
        return results.get(0);
    }
    
}
