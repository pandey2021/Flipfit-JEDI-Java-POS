package com.flipfit.business;

import com.flipfit.bean.*;
import com.flipfit.business.interfaces.IFlipFitGymCustomer;

import java.util.ArrayList;
import java.util.List;


public class FlipFitGymCustomerBusiness implements IFlipFitGymCustomer {
    
    @Override
    public List<FlipFitBooking> viewBookedSlots(int userId) {

        System.out.println("Viewing booked slots:> ");
        List<FlipFitBooking> bookedSlots = new ArrayList<>();
        return bookedSlots;
    }

    @Override
    public FlipFitBooking checkBookingConflicts(int userId, int slotTime) {
        System.out.println("Checking conflict for slot " + slotTime);
        return new FlipFitBooking();
    }
    @Override
    public List<FlipFitGymCentre> viewCentres() {
        System.out.println("view centres called:> ");
        List<FlipFitGymCentre> viewCentres = new ArrayList<>();
        return viewCentres;
    }

    public boolean makePayment(int userId) {
        System.out.println("Make payment called:> ");

        return true;
    }
    public FlipFitGymCustomer editDetails(FlipFitGymCustomer flipFitGymCustomer){
        return new FlipFitGymCustomer();

    }
    @Override
    public FlipFitGymCustomer registerCustomer(FlipFitGymCustomer flipFitGymCustomer) {

        return new FlipFitGymCustomer();

    }
    @Override
    public FlipFitGymCustomer login(FlipFitUser flipFitUser) {

        return new FlipFitGymCustomer();
    }
}
