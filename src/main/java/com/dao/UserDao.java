package com.dao;

import com.beans.User;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserDao {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("customer");
    EntityManager entityManager = factory.createEntityManager();
/*    public Set<User> retrieveUser(){
        Set<User> users = new HashSet<User>();
        Query createQuery = entityManager.createQuery("select t from User t");
        return (Set<User>) createQuery.getResultList();

    }*/
//register the user
    public void commitDB(User usr) {
        EntityTransaction rt = entityManager.getTransaction();
        rt.begin();
        entityManager.persist(usr);
        rt.commit();
        entityManager.close();
    }

    //login
    public List<User> login(){
        Query query=entityManager.createQuery("Select a from User a");
        List<User> list = query.getResultList();
        return  list;
    }



}


