package com.flipfit.business;

import com.flipfit.bean.FlipFitBooking;
import com.flipfit.bean.FlipFitSlots;


public class BookingsBusiness {


    public FlipFitBooking makeBooking(int userID, int centreID, int startTime) {

        System.out.println("Making a booking for " + userID);


        return null;
    }

    public boolean deleteBooking(int bookingId) {
        System.out.println("Deleting a booking for " + bookingId);

        return true;
    }
}
