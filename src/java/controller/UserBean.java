/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import model.User;

@Stateless
public class UserBean {
    @PersistenceContext private EntityManager em;
    
     public void AddUser(User user){
        TypedQuery<User> query = (TypedQuery<User>) em.createQuery("Insert into User Values('"+ user.getUserName() +"','"+ user.getEmail() + "', '"+ user.getPassword()+"'), User.class");
        
     }
    
}
