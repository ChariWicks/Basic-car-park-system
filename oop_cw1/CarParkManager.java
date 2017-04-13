/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_cw1;

/**
 *
 * @author CHARITHA
 */
public interface CarParkManager {
    
    public abstract int addVehicle(Vehicle vehicle);
    public abstract void deleteVehicle();
    public abstract void vehicleList();
    public abstract void percentageOfVehicles();
    public abstract void lastParked();
    public abstract void longestParked();
    public abstract void listOfVehicleDate();
    public abstract void displayCharges();
    public abstract boolean runMenu();
    
}
