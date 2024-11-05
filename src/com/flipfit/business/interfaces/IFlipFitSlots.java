package com.flipfit.business.interfaces;

import com.flipfit.bean.FlipFitSlots;

//This interface defines the operations related to managing gym slots within the FlipFit Gym application.
public interface IFlipFitSlots {
    //Updates the availability status of a specified slot.
    public boolean updateAvailability(FlipFitSlots flipFitSlots);
    //Retrieves the detailed information of a specific slot.
    public void getSlotDetails();
}
