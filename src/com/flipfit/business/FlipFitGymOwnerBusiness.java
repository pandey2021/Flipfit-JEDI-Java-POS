package com.flipfit.business;

import com.flipfit.bean.*;
import com.flipfit.business.interfaces.IFlipFitGymOwner;
import java.util.ArrayList;
import java.util.List;

public class FlipFitGymOwnerBusiness implements IFlipFitGymOwner {

    public FlipFitGymOwnerBusiness() {
        // Constructor without DAO implementation
    }

    public FlipFitGymCentre addCentre(FlipFitGymCentre flipFitGymCentre) {
        System.out.println("Adding Centre:");
        return flipFitGymCentre; // Returning the provided object as a placeholder
    }

    public FlipFitSlots addSlot(FlipFitSlots flipFitSlot) {
        System.out.println("Adding Slot: " );
        return flipFitSlot; // Returning the provided object as a placeholder
    }

    public List<FlipFitGymCentre> viewCentres(FlipFitGymOwner flipFitGymOwner) {
        System.out.println("Listing Centres for owner: " + flipFitGymOwner.getUserName());
        return new ArrayList<>(); // Returning an empty list as a placeholder
    }

    public List<FlipFitPayments> viewPayments() {
        System.out.println("Payments listed:> ");
        return null;
    }

    public FlipFitGymOwner editDetails(FlipFitGymOwner owner) {
        System.out.println("Editing details for owner: " + owner.getUserName());
        return owner; // Returning the provided object as a placeholder
    }

    public FlipFitGymOwner registerOwner(FlipFitGymOwner GymOwner) {
        System.out.println("Registering Gym Owner: " + GymOwner.getUserName());
        GymOwner.setRole(2); // Setting the role as a placeholder
        return GymOwner; // Returning the provided object as a placeholder
    }

    @Override
    public FlipFitUser login(FlipFitUser flipFitUser) {
        System.out.println("Logging in User: " + flipFitUser.getEmailID());
        flipFitUser.setRoleID(2); // Setting role ID as a placeholder
        return flipFitUser; // Returning the provided object as a placeholder
    }
}
