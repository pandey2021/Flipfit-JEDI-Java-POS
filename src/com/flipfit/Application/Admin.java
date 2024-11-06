package com.flipfit.Application;

import com.flipfit.bean.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
    public static void getAdminView() throws Error {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. View Pending Requests");
            System.out.println("2. View Approved Owners");
            System.out.println("3. View all FlipFit Customers");
            System.out.println("4. View all Centres Using OwnerId");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    List<FlipFitGymOwner> flipFitGymOwnerList = new ArrayList<>();
                    for (FlipFitGymOwner flipFitGymOwner : flipFitGymOwnerList) {
                        System.out.println("Owner ID :" + flipFitGymOwner.getUserId() + " Aadhar :" + flipFitGymOwner.getAadharNumber());
                    }
                    System.out.println("Type the ownerId of owner you wish to approve");
                    String ownerId = sc.next();
                    // TODO  Approve owner

                }
                case 2: {
                    System.out.println("Printing list of Approved Owners");
                    List<FlipFitGymOwner> flipFitGymOwnerList = new ArrayList<>();
                    for (FlipFitGymOwner flipFitGymOwner : flipFitGymOwnerList) {
                        System.out.println("Owner ID :" + flipFitGymOwner.getUserId() + " Aadhar :" + flipFitGymOwner.getAadharNumber());
                    }
                    break;
                }
                case 3: {
                    List<FlipFitGymCustomer> customersList = new ArrayList<>();
                    for (FlipFitGymCustomer customers : customersList) {
                        System.out.println("CustomerID: " + customers.getUserId() + " CustomerName :" + customers.getUserName());
                    }

                    break;
                }
                case 4: {
                    System.out.println("Type the ownerId of owner for which you wish to view Centres");
                    Scanner in = new Scanner(System.in);
                    int ownerId = in.nextInt();
                    List<FlipFitGymCentre> flipFitGymCentres = new ArrayList<>();
                    if (flipFitGymCentres.isEmpty()) {
                        System.out.println("No centres found for owner ID " + ownerId);
                    } else {
                        System.out.println("Printing All Centres of Owner");
                        for (FlipFitGymCentre gymCentre : flipFitGymCentres) {
                            System.out.println("CentreID: " + gymCentre.getCentreID() + " City :" + gymCentre.getCity() + " Capacity: " + gymCentre.getCapacity());
                        }
                    }
                    break;
                }
                default: {
                    throw new Error("Invalid choice entered: " + choice);
                }
            }
        } catch (Error e) {
            System.out.println("Please enter a valid choice");
        }
    }
}
