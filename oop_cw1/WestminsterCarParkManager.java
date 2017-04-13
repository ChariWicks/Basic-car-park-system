/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */

package oop_cw1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 
 * 
 * 
 * @author CHARITHA
 */
public class WestminsterCarParkManager implements CarParkManager{
    
    private ArrayList<Vehicle> vehicleList;
    private int numOfSlots;
    Scanner sc = new Scanner(System.in);
    
    public WestminsterCarParkManager(int listLength){
        this.numOfSlots = listLength;
        vehicleList = new ArrayList<Vehicle>();
    }
    
     public static void main(String[] args) {
        // TODO code application logic here
         
         CarParkManager obj = new WestminsterCarParkManager(20);
         boolean exit = false;
         
         while(!exit){
             exit = obj.runMenu();
         }
         
         
         
    }
     
    @Override
    public boolean runMenu(){
        
         boolean exit = false;
        
         System.out.println("****************************************");
         System.out.println(" Westminster Car Park Mnagement System ");
         System.out.println("****************************************");
         System.out.println();
         System.out.println("             -- Menu --                 ");
         System.out.println();
         System.out.println("   1. Add a new vehicle");
         System.out.println("   2. Delete a vehicle");
         System.out.println("   3. Display the list of currently parked vehicles");
         System.out.println("   4. Display the percentage of parked vehicles");
         System.out.println("   5. Display the last parked vehicle");
         System.out.println("   6. Display the vehicle parked for the longest time");
         System.out.println("   7. Display the list of vehicles on a specified date");
         System.out.println("   8. Display parking charges");
         System.out.println("   9. Exit");
         
         int choice = sc.nextInt();
         System.out.println();
         
         if(numOfSlots >  0 && numOfSlots < 21){
             
             System.out.println(" Number of free slots:- " + numOfSlots);
             System.out.println();
             
           switch(choice){
             
             case 1:
                 System.out.println(" Press 1 to add a car: ");
                 System.out.println(" Press 2 to add a van: ");
                 System.out.println(" Press 3 to add a motorbike: ");
                 
                 int choice2 = sc.nextInt();
                 sc.nextLine();
                 
                 System.out.println(" Enter the ID plate of vehicle: ");
                 String idPlate1 = sc.nextLine();
                 
                 System.out.println(" Enter the brand of vehicle: ");
                 String brand1 = sc.nextLine();
                 
                 System.out.println(" Enter the entry time of vehicle: ");
                 String entryTime1 = sc.nextLine();
                 
                 System.out.println(" Enter the entry date of vehicle: ");
                 String entryDate1 = sc.nextLine();
                 
                 switch(choice2){
                     
                     case 1:
                         System.out.println(" Enter number of doors: ");
                         int numberOfDoors1 = sc.nextInt();
                         
                         System.out.println(" Enter color of the car: ");
                         String color1 = sc.next();
                         
                         Car carObj = new Car(idPlate1, brand1, entryTime1, entryDate1, numberOfDoors1, color1);
                         Car carObj2 = new Car(idPlate1,entryTime1);
                         
                         numOfSlots--;
                         
                         this.addVehicle(carObj);
                         break;
                         
                     case 2:
                         System.out.println(" Enter cargo volume of the van: ");
                         double cargoVolume1 = sc.nextDouble();
                         
                         Van vanObj = new Van(idPlate1, brand1, entryTime1, entryDate1, cargoVolume1);
                         
                         numOfSlots = numOfSlots - 2;
                         
                         this.addVehicle(vanObj);
                         break;
                         
                     case 3:
                         System.out.println(" Enter size of the engine: ");
                         double engineSize1 = sc.nextDouble();
                         
                         Motorbike bikeObj = new Motorbike(idPlate1, brand1, entryTime1, entryDate1, engineSize1);
                         
                         numOfSlots--;
                         
                         this.addVehicle(bikeObj);
                         break;
                     
                 }
                 break;
                 
             case 2:
                 this.deleteVehicle();
                 break;
                 
             case 3:
                 this.vehicleList();
                 break;
                 
             case 4:
                 this.percentageOfVehicles();
                 break;
                 
             case 5:
                 this.lastParked();
                 break;
                 
             case 6:
                 this.longestParked();
                 break;
                 
             case 7:
                 this.listOfVehicleDate();
                 break;
                 
             case 8:
                 this.displayCharges();
                 break;
                 
             case 9:
                 exit = true;
         }
             
             
             
         }
         else{
             
              System.out.println(" No more space in the list");
              System.out.println();
         }
         

         
         return exit;
             
    }
    
    @Override
    public int addVehicle(Vehicle vehicle){
        
        
        if(numOfSlots >=  0 && numOfSlots <= 20){
            vehicleList.add(vehicle);
            System.out.print(vehicleList.toString());
        }
        else{
           
        }
        return numOfSlots;  
    }
    
    @Override
    public void deleteVehicle(){
        
                
                
    }
    
    @Override
    public void vehicleList(){
        
    }
     
    @Override
    public void percentageOfVehicles(){
        
    }
     
    @Override
    public void lastParked(){
        
    }
     
    @Override
    public void longestParked(){
        
    }
    
    @Override
    public void listOfVehicleDate(){
        
    }
    
    @Override
    public void displayCharges(){
        
    }
     
     
}
