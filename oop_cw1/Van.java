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
public class Van extends Vehicle {
    
    private double cargoVolume;
    
    public Van(String idPlate, String brand, String entryTime, String entryDate, double cargoVolume){
        
    }
    
    public double getCargoVolume(){
        return cargoVolume;
    }
    
    public void setCargoVolume(double cargoVolume){
        this.cargoVolume = cargoVolume;
    }
    
    
}
