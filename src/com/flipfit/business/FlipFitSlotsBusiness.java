package com.flipfit.business;
import com.flipfit.bean.FlipFitSlots;
import com.flipfit.business.interfaces.IFlipFitSlots;


public class FlipFitSlotsBusiness implements IFlipFitSlots {

    public boolean updateAvailability(FlipFitSlots flipFitSlots) {
        System.out.println("Updating Slot Availability");
        return true;
    }

    public void getSlotDetails() {
        System.out.println("Getting Slot Details");
        return;
    }
}
