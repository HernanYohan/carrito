/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.interfaces.ClaseFacadeLocal;
import com.mycompany.entity.Clase;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Hernan
 */
@Stateless
public class ClaseFacade extends AbstractFacade<Clase> implements ClaseFacadeLocal {
    @PersistenceContext(unitName = "persistence")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClaseFacade() {
        super(Clase.class);
    }
    
}
