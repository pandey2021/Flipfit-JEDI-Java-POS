package com.flipfit.business;


import com.flipfit.dao.interfaces.*;
import com.flipfit.dao.classes.*;
import com.flipfit.bean.*;
import com.flipfit.business.interfaces.*;
import com.flipfit.business.interfaces.IFlipFitGymOwner;
import java.util.ArrayList;
import java.util.List;

public class FlipFitGymOwnerBusiness implements IFlipFitGymOwner {
    private  IFlipFitGymOwnerDAO flipFitGymOwnerDAO =new FlipFitGymOwnerDAOImpl();
    public FlipFitGymOwnerBusiness(FlipFitGymOwnerDAOImpl FFOwner){
        this.flipFitGymOwnerDAO= FFOwner;
    }
    public FlipFitGymOwnerBusiness() {
        // Constructor without DAO implementation
    }

    public FlipFitGymCentre addCentre(FlipFitGymCentre flipFitGymCentre){
        return flipFitGymOwnerDAO.addCentre(flipFitGymCentre);
    }

    public FlipFitSlots addSlot(FlipFitSlots flipFitSlot){
        FlipFitSlotDAOImpl flipFitSlotDAOImpl = new FlipFitSlotDAOImpl();
        flipFitSlotDAOImpl.addSlot(flipFitSlot);
        return flipFitSlot;
    }

    public List<FlipFitGymCentre> viewCentres(FlipFitGymOwner flipFitGymOwner) {
        System.out.println("Centres listed:> ");
        return flipFitGymOwnerDAO.viewCentresByOwnerID(flipFitGymOwner);
    }

    //    @Override
//    public List<FlipFitUser> viewFlipFitCustomers(FlipFitGymCentre flipFitGymCentre) {
//        return flipFitGymOwnerDAO.viewFlipFitCustomers(flipFitGymCentre);
//    }
    public List<FlipFitPayments> viewPayments() {
        System.out.println("Payments listed:> ");
        return null;
    }
    public FlipFitGymOwner editDetails(FlipFitGymOwner owner) {
        return flipFitGymOwnerDAO.editDetails(owner);
//        try
//        {
//
//                default: {
//                    throw new InvalidChoiceException("Invalid choice entered: " + choice);
//                }
//            }
//            return true;
//        }
//        catch (InvalidChoiceException e)
//        {
//            ExceptionHandler.InvalidChoiceEditDetailsMenu(e);
//            return false;
//        }
    }
    public FlipFitGymOwner registerOwner(FlipFitGymOwner GymOwner) {

        FlipFitUser user = new FlipFitUser();
        user.setPassword(GymOwner.getPassword());
        user.setEmailID(GymOwner.getEmailID());
        user.setPhoneNumber(GymOwner.getPhoneNumber());
        user.setUserName(GymOwner.getUserName());
        user.setRoleID(2);
        GymOwner.setRole(2);

        user=flipFitGymOwnerDAO.addUser(user);
        return flipFitGymOwnerDAO.addGymOwner(GymOwner, user);
    }
    @Override
    public FlipFitUser login(FlipFitUser flipFitUser) {
        FlipFitUserDAOImpl userDAO = new FlipFitUserDAOImpl();
        flipFitUser.setRoleID(2);

        userDAO.login(flipFitUser.getEmailID(), flipFitUser.getPassword());
        int userId= userDAO.getId(flipFitUser.getEmailID(), flipFitUser.getPassword());
        flipFitUser.setUserID(userId);
        return flipFitUser;
    }
}
