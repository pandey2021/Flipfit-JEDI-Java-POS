package com.flipfit.business;

import com.flipfit.bean.*;
import com.flipfit.business.interfaces.IFlipFitAdmin;


import java.util.ArrayList;
import java.util.List;

public class FlipFitAdminBusiness implements IFlipFitAdmin {

    public boolean adminLogin(FlipFitAdmin flipFitAdmin){
       return true;
    }
    public List<FlipFitGymOwner> getPendingOwnerList(){
        List<FlipFitGymOwner> pendingOwners = new ArrayList<>();
        return pendingOwners;
    }
    public List<FlipFitGymOwner> getApprovedOwnerList(){
        System.out.println("AdminUserBusiness.getApprovedOwnerList");
        List<FlipFitGymOwner> approvedOwnerList = new ArrayList<>();
        return approvedOwnerList;
    }
    public List<FlipFitGymCustomer> getUserList(){
        System.out.println("AdminUserBusiness.getUserList");
        List<FlipFitGymCustomer> userList = new ArrayList<>();
        return userList;
    }
    public boolean validateOwner(int ownerId){
        return true;
    }
    public boolean deleteOwner(int ownerId){
        System.out.println("AdminUserBusiness.deleteOwner" + ownerId);

        return true;
    }
    public List<FlipFitGymCentre> getGymCentreUsingOwnerId(int ownerId){
        System.out.println("AdminUserBusiness.getGymCentreUsingOwnerId "+ownerId);
        List<FlipFitGymCentre> gymCentreUsingOwnerId = new ArrayList<>();
        return gymCentreUsingOwnerId;
    }

}
