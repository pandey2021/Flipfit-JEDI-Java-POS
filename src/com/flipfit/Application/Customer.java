package com.flipfit.Application;

import com.flipfit.bean.*;
import com.flipfit.business.BookingsBusiness;
import com.flipfit.business.FlipFitGymCustomerBusiness;
import com.flipfit.dao.classes.FlipFitBookingDAOImpl;
import com.flipfit.dao.classes.FlipFitGymCentreDAOImpl;

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
                        "\n 1. Edit Profile" +
                        "\n 2. View Centres" +
                        "\n 3. Make Booking" +
                        "\n 4. View Booked Slots" +
                        "\n 5. View Payment History" +
                        "\n 6. Logout");
                choice = sc.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println("Edit Profile:");
                        System.out.println("Enter your email address:> ");
                        String emailID = sc.next();
                        System.out.println("Enter your phone number:> ");
                        String phoneNumber = sc.next();
                        System.out.println("Enter your city:> ");
                        String city = sc.next();
                        System.out.println("Enter your pin code:> ");
                        String pinCode = sc.next();
                        System.out.println("Enter your password:> ");
                        String password = sc.next();
                        System.out.println("Enter username: ");
                        String username = sc.next();

                        FlipFitGymCustomer flipFitGymCustomer = new FlipFitGymCustomer();
                        flipFitGymCustomer.setEmailID(emailID);
                        flipFitGymCustomer.setPassword(password);
                        flipFitGymCustomer.setPhoneNumber(phoneNumber);
                        flipFitGymCustomer.setUserName(username);
                        flipFitGymCustomer.setCity(city);
                        flipFitGymCustomer.setPinCode(pinCode);
                        flipFitGymCustomer.setRoleId(1);
                        flipFitGymCustomer.setUserId(userId);

                        FlipFitGymCustomerBusiness flipFitGymCustomerBusiness=new FlipFitGymCustomerBusiness();
                        // TO-DO other updates
                        flipFitGymCustomerBusiness.editDetails(flipFitGymCustomer);
                        System.out.println("Profile updated successfully.");
                        break;
                    }
                    case 2: {
                        System.out.println("View Centres");
                        //view all gymcentres
//                        List<FlipFitGymCentre> centreList = new ArrayList<>();
//                        for (FlipFitGymCentre centre : centreList) {
//                            System.out.println("CentreId is: " + centre.getCentreID() + " City is: " + centre.getCity() + " PinCode is: " + centre.getPincode());
//                        }
//                        System.out.println("Choose a centre (via centre ID) you want to book slot in");
//                        int centreId = sc.nextInt();
//                        List<FlipFitSlots> slotsList = new ArrayList<>();
//                        System.out.println("These are the available slots:");
//                        for (FlipFitSlots flipFitSlots : slotsList) {
//                            System.out.println("Slot Id is: " + flipFitSlots.getSlotId() + " Slot Timing is: " + flipFitSlots.getSlotTime() + " Availability is: " + flipFitSlots.getSeatsAvailable() + " CentreId is: " + flipFitSlots.getCentreId());
//                        }
//                        System.out.println("Give the startTime you wish to book via integer");
//                        int startTime = sc.nextInt();
//                        System.out.println("Give the centre ID: ");
//                        int centreID = sc.nextInt();
                        System.out.println("Enter city");
                        String city=sc.next();
                        FlipFitGymCentreDAOImpl flipFitGymCentreDAO=new FlipFitGymCentreDAOImpl();
                        ArrayList<FlipFitGymCentre> centreList=flipFitGymCentreDAO.viewCentres(city);
                        for (FlipFitGymCentre centre : centreList) {
                            System.out.println("centreid "+centre.getCentreID());
                            System.out.println("ownerid "+centre.getOwnerID());
                            System.out.println("capacity "+centre.getCapacity());
                            System.out.println();
                        }
                        break;
                    }
                    case 3: {
                        //view gymcentres>choose a gymcentre> choose slot from availableslot>>bookslot
                        System.out.println("Make Booking:");
                        System.out.println("Enter the city for booking:");
                        String city = sc.next();
                        FlipFitGymCentreDAOImpl flipFitGymCentreDAO=new FlipFitGymCentreDAOImpl();
                        ArrayList<FlipFitGymCentre> centreList=flipFitGymCentreDAO.viewCentres(city);
                        for (FlipFitGymCentre centre : centreList) {
                            System.out.println("centreid "+centre.getCentreID());
                            System.out.println("ownerid "+centre.getOwnerID());
                            System.out.println("capacity "+centre.getCapacity());
                            System.out.println();
                        }
                        System.out.println("Enter the centreId for booking:");
                        int centreId = sc.nextInt();
                        List<FlipFitSlots> flipFitSlotsList=flipFitGymCentreDAO.viewAvailableSlots(centreId);
                        for (FlipFitSlots slots : flipFitSlotsList) {
                            System.out.println("slotid "+slots.getSlotId());
                            System.out.println("slottime "+slots.getSlotTime());
                            System.out.println("seatsavailable "+slots.getSeatsAvailable());
                            System.out.println();
                        }
                        System.out.println("Enter the slot ID you want to book:");
                        int slotId = sc.nextInt();
                        System.out.println("Enter the slot time you want to book:");
                        int slotTime = sc.nextInt();
                        BookingsBusiness.makeBooking(userId, centreId, slotId,slotTime);
                        System.out.println("Booking successful.");
                        break;
                    }
                    case 4: {
                        //fetch all slots for given userid
                        System.out.println("View Booked Slots:");
                        FlipFitBookingDAOImpl flipFitBookingDAO=new FlipFitBookingDAOImpl();
                        List<FlipFitBooking> flipFitBookings=flipFitBookingDAO.getAllBookings(userId);
                        for (FlipFitBooking booking : flipFitBookings) {
                            System.out.println("bookingid "+booking.getBookingId());
                            System.out.println("slotid "+booking.getSlotId());
                            System.out.println("slottime "+booking.getSlotTime());
                            System.out.println();
                        }
                        System.out.println("Type 2. If you wish to cancel else type to go to menu");
                        choice = sc.nextInt();
                        if (choice == 2) {
                            System.out.println("Choose the booking ID you wish to cancel");
                            int bookingId = sc.nextInt();
                            boolean flag=false;
                            flag=flipFitBookingDAO.deleteBooking(bookingId);
                            if(flag){
                                System.out.println("Booking deleted successfully.");
                            }
                        }
                        break;
                    }
                    case 5: {
                        System.out.println("View Payment History:");
                        List<String> paymentHistory = FlipFitGymCustomerBusiness.getPaymentHistory(userId);
                        if (paymentHistory.isEmpty()) {
                            System.out.println("No payment history found.");
                        } else {
                            for (String payment : paymentHistory) {
                                System.out.println(payment);
                            }
                        }
                        break;
                    }
                    case 6:
                    {
                        System.out.println("successful logout");
                    }
                    default: {
                        throw new Error("Invalid choice entered: " + choice);
                    }
                }
            }
            while (choice != 6) ;
        } catch (Error e) {
            System.out.println("Please enter a valid choice");
        }
    }
}