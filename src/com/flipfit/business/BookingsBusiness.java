package com.flipfit.business;

import com.flipfit.bean.FlipFitBooking;
import com.flipfit.bean.FlipFitSlots;

import java.util.List;


public class BookingsBusiness {


    public static FlipFitBooking makeBooking(int userID, int centreID, int startTime) {

        System.out.println("Making a booking for " + userID);


        return null;
    }

    public static List<Integer> getBookingsByCentreOwner(int userID) {
        //todo
        return null;
    }

    public static boolean deleteBooking(int bookingId) {
        System.out.println("Deleting a booking for " + bookingId);

        return true;
    }
}
