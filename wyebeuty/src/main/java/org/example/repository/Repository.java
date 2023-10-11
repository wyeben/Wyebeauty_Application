package org.example.repository;

import org.example.models.WyebeautySalon;

public interface Repository {
    public WyebeautySalon save(WyebeautySalon customer);
    public int totalNumberOfCustomers();
}
