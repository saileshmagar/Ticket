package com.dao;

import com.beans.Flights;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class FlightDao {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("customer");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public List<Flights> getAllFlights() {

        Query query = entityManager.createQuery("Select e from Flights e");
        List<Flights> list = query.getResultList();
        
        return list;


    }


}