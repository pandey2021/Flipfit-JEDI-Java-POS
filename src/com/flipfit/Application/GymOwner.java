package com.flipfit.Application;


import com.flipfit.bean.FlipFitGymCentre;
import com.flipfit.bean.FlipFitGymOwner;
import com.flipfit.bean.FlipFitUser;
import com.flipfit.business.FlipFitAdminBusiness;
import com.flipfit.business.FlipFitGymCentreBusiness;
import com.flipfit.business.FlipFitGymOwnerBusiness;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GymOwner {
    public static void getFlipFitOwnerView(FlipFitUser gymOwner) throws Error {
        try {
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            do {
                System.out.println("Gym Owner Menu:> ");
                System.out.println("Choose an option:" +
                        "\n 1. Add Centre" +
                        "\n 2. View Centres" +
                        "\n 3. Logout");
                choice = sc.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println("Give details to add Centre : ");
                        Scanner scanner = new Scanner(System.in);
                        int ownerID = gymOwner.getUserID();
                        System.out.println("Enter Capacity: ");
                        int capacity = scanner.nextInt();
                        System.out.println("Enter City: ");
                        String city = scanner.next();
                        System.out.println("Enter State: ");
                        String state = scanner.next();
                        System.out.println("Enter Pincode: ");
                        String pincode = scanner.next();


                        FlipFitGymCentre flipFitGymCentre = new FlipFitGymCentre();

                        flipFitGymCentre.setOwnerID(ownerID);
                        flipFitGymCentre.setCapacity(capacity);
                        flipFitGymCentre.setCity(city);
                        flipFitGymCentre.setState(state);
                        flipFitGymCentre.setPincode(pincode);
                        flipFitGymCentre.setApproved(true);


                        System.out.println("Gym Centre created successfully.");
                        break;
                    }
                    case 2: {
                        System.out.println("View Centres for the owner : " + gymOwner.getUserID());
                        FlipFitGymOwner flipFitGymOwner = new FlipFitGymOwner();
                        flipFitGymOwner.setUserId(gymOwner.getUserID());
                        List<FlipFitGymCentre> centreList = new ArrayList<>();
                        for (FlipFitGymCentre centre : centreList) {
                            System.out.println("CentreID : " + centre.getCentreID() + " Capacity : " + centre.getCapacity() + " City : " + centre.getCity() + " State : " + centre.getState());
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Successful logout");
                    }
                    default: {
                        throw new Error("Invalid choice entered: " + choice);
                    }
                }
            }
            while (choice != 4);
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
    }
}
