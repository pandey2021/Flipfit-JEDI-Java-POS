package com.flipfit.Application;

import com.flipfit.bean.FlipFitGymCentre;
import com.flipfit.bean.FlipFitGymCustomer;
import com.flipfit.bean.FlipFitSlots;
import com.flipfit.bean.FlipFitUser;
import com.flipfit.business.BookingsBusiness;
import com.flipfit.business.FlipFitGymCentreBusiness;
import com.flipfit.business.FlipFitGymCustomerBusiness;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.List;

public class Customer {

    public static void getFlipFitCustomerMenu(FlipFitUser gymCustomer) throws Error {
        try {
            int userId = gymCustomer.getUserID();
            Scanner sc = new Scanner(System.in);
            int choice =0;
            do {
                System.out.println("FlipFit Customer Menu:> ");
                System.out.println("Choose an option:" +
                        "\n 1. View Booked Slots" +
                        "\n 2. View Centres" +
                        "\n 3. Logout");
                choice = sc.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println("View Booked Slots:");
                        System.out.println("Type 2. If you wish to cancel");
                        choice = sc.nextInt();
                        if (choice == 2) {
                            System.out.println("Choose the booking ID you wish to cancel");
                            int bookingId = sc.nextInt();
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("View Centres");
                        List<FlipFitGymCentre> centreList = new ArrayList<>();
                        for (FlipFitGymCentre centre : centreList) {
                            System.out.println("CentreId is: " + centre.getCentreID() + " City is: " + centre.getCity() + " Pincode is: " + centre.getPincode());
                        }
                        System.out.println("Choose a centre you want to book slot in");
                        int centreId = sc.nextInt();
                        List<FlipFitSlots> slotsList = new ArrayList<>();
                        System.out.println("These are the available slots:");
                        for (FlipFitSlots flipFitSlots : slotsList) {
                            System.out.println("Slot Id is: " + flipFitSlots.getSlotId() + " Slot Timing is: " + flipFitSlots.getSlotTime() + " Availability is: " + flipFitSlots.getSeatsAvailable() + " CentreId is: " + flipFitSlots.getCentreId());
                        }
                        System.out.println("Give the startTime you wish to book");
                        int startTime = sc.nextInt();
                        System.out.println("Give the centre ID: ");
                        int centreID = sc.nextInt();
                        break;
                    }
                    case 3:
                    {
                        System.out.println("successful logout");
                    }
                    default: {
                        throw new Error("Invalid choice entered: " + choice);
                    }
                }
            }
            while (choice != 4) ;
        } catch (Error e) {
            System.out.println("Please enter a valid choice");
        }
    }
}