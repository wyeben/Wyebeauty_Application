package org.example.service;

import org.example.models.WyebeautySalon;
import org.example.repository.Repository;
import org.example.repository.WyebeautySalonRepository;

public class WyebeautySalonService {

    Repository wyeBeautySalonRepository = new WyebeautySalonRepository();

    public int bookAppointment(WyebeautySalon customerName) {
//        WyebeautySalon wyebeautySalon = new WyebeautySalon();
        WyebeautySalon savedCustomer = wyeBeautySalonRepository.save(customerName);
        return savedCustomer.getId();

    }

    public int getCustomerCount() {

        return wyeBeautySalonRepository.totalNumberOfCustomers();
    }
}
