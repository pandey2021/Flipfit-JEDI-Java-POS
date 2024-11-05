package com.flipfit.business.interfaces;

import com.flipfit.bean.FlipFitGymCentre;
import com.flipfit.bean.FlipFitSlots;

import java.util.List;

//This interface defines methods for managing gym centers within the FlipFit Gym application.
public interface IFlipFitGymCentre {
    //Updates the details of an existing gym center.
    public FlipFitGymCentre updateGymCentre(FlipFitGymCentre flipFitGymCentre);
    //Deletes an existing gym center based on the provided center ID.
    public boolean deleteGymCentre(int centreId);
    //Retrieves a list of available slots at a specified gym center.
    public List<FlipFitSlots> viewAvailableSlots(int centreId);
}
