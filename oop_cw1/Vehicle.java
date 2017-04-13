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
public abstract class Vehicle {
    
    protected String idPlate;
    protected String brand;
    protected String entryDate;
    protected  String entryTime;
    
    public String toString(){
        return null; 
    }
    
    public String getIdPlate(){
        return idPlate;
    }
    
    public void setIdPlate( String idPlate){
        this.idPlate = idPlate;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public String getEntryDate(){
        return entryDate;
    }
    
    public void setEntryDate(String entryDate){
        this.entryDate = entryDate;
    }
    
    public String setEntryTime(){
        return entryTime;
    }
    
    public void getEntryTime(String entryTime){
        this.entryTime = entryTime;
    }
}
