package com.flipfit.dao.interfaces;

import com.flipfit.bean.FlipFitGymCentre;
import com.flipfit.bean.FlipFitGymCustomer;
import com.flipfit.bean.FlipFitGymOwner;
import com.flipfit.bean.FlipFitUser;

import java.util.List;

//This interface defines methods for managing gym owner operations within the FlipFit Gym application.
public interface IFlipFitGymOwnerDAO {
    //This method is used to add a new gym centre to the system.
    public FlipFitGymCentre addCentre(FlipFitGymCentre centre);
    //This method retrieves a list of all gym centres owned by a specific gym owner.
    public List<FlipFitGymCentre> viewCentresByOwnerID(FlipFitGymOwner owner);
//    List<FlipFitUser> viewFlipFitCustomers(FlipFitGymCentre centre);

    //This method updates the personal details of an existing gym owner.
    public FlipFitGymOwner editDetails(FlipFitGymOwner owner);
    //This method adds a new gym owner to the system along with user details.
    public FlipFitGymOwner addGymOwner(FlipFitGymOwner owner, FlipFitUser user);
    //This method adds a new user to the system.
    public FlipFitUser addUser(FlipFitUser user);
}