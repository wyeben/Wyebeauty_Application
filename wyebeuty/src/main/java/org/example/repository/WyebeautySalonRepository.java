package org.example.repository;

import org.example.models.WyebeautySalon;

import java.util.ArrayList;
import java.util.List;

public class WyebeautySalonRepository implements Repository {
    List<WyebeautySalon> customers = new ArrayList<>();
    int idCounter= 1;

    public WyebeautySalon save(WyebeautySalon customer){
        customer.setId(idCounter);
        customers.add(customer);
        idCounter++;
        return customer;
    }

    public int totalNumberOfCustomers(){
        return customers.size();
    }
}
