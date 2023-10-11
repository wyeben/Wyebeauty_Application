package org.example.repository;

import org.example.models.WyebeautySalon;

public class NedRepository implements Repository{
    WyebeautySalon[] customers = new WyebeautySalon[15];
    public WyebeautySalon save(WyebeautySalon customer){
        customers[1] = customer;
        return customer;
    }

    @Override
    public int totalNumberOfCustomers() {
        return 1;
    }
}
