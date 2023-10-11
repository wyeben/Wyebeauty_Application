package org.example.service;

import org.example.models.WyebeautySalon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WyebeautySolonServiceTest {
    private WyebeautySalonService wyebeautySalonService;
    private WyebeautySalon newCustomer;

    @BeforeEach
    public void startWith(){
        wyebeautySalonService = new WyebeautySalonService();
        newCustomer = new WyebeautySalon();

    }

    @Test
    public void canBookAnAppointment(){
        newCustomer.setName("Blessing");

        assertEquals(1,  wyebeautySalonService.bookAppointment(newCustomer));
        assertEquals(1, wyebeautySalonService.getCustomerCount());
    }


}