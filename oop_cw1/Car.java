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
public class Car extends Vehicle {
    
    private int numberOfDoors;
    private String carColor;
    
    public Car(String idPlate1, String brand1, String entryTime1, String entryDate1, int numberOfDoors1, String color1){
        
        idPlate = idPlate1;
        brand = brand1;
        entryTime = entryTime1;
        entryDate = entryDate1;
        numberOfDoors = numberOfDoors1;
        carColor = color1;
     
        System.out.printf("", this);
        
    }
    
    public Car(String idPlate1,String entryTime1){
        idPlate = idPlate1;
        entryTime = entryTime1;
        
        System.out.printf("", this);
    }
    
    public String toString(){
        
        return String.format("%s-%s-%s-%s-%d-%s" + "\n", idPlate,brand,entryTime,entryDate,numberOfDoors,carColor);
       // return idPlate + "   " + entryTime;
    }
    
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    
    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }
    
    public String getCarColor(){
        return carColor;
    }
    
    public void setCarColor(String carColor){
        this.carColor = carColor;
    }
}
