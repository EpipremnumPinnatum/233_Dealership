import java.util.Scanner;

import models.Car;
import models.Dealership;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Car[] cars = new Car[] {
            new Car("Dodge", 7),
            new Car("Ferrari", 12000),
        };
        cars[1].setMake("Volkswagen");
        cars[1].setPrice(700);

        Dealership dealership = new Dealership(cars);

        System.out.println("\n************* JAVA DEALERSHIP *************");
        
       
        
        
        while (true) {

    
            System.out.println(dealership);
            if(dealership.isEmpty()==true){

                System.out.println("We're all soldout");
                break;

            }
            System.out.print("Enter the spot number of the car you want to buy: "); 
            
            
            

             if(!scan.hasNextInt()){
                scan.nextLine();
                System.out.println("Please enter either 0 or 1");
                continue;
             }
             
             
             int spot = scan.nextInt();
             scan.nextLine();

             if(dealership.getLength()-1<spot||spot<0){

                System.out.println("Please choose a valid parking spot.");
                continue;
             }

            
            
             if(dealership.getCar(spot) == null){

                System.out.println("Spot "+spot+" is empty.");
                continue;
             }
        
             
            dealership.sell(spot);

            

            System.out.println("Type 'yes' to continue shopping.");
            
            String userInput = scan.nextLine();

            if (userInput.equals("yes") ) {
                continue;
            }else{

                break;
            }
               
        }
        // Dealership - Part 2 At task 6 Have to rewrite the isEmpty method in dealership?
       //scan.close();

    }
}
