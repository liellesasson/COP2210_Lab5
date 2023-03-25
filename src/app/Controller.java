package app;


import cooling.AC;
import buildingunit.Room;
import building.House;




    //-----------------------------------------------------



public class Controller {


    public static void main(String[] args) {
        yourInfoHeader();


        AC.acStats();
        Room kitchen = new Room("Kitchen", "White", 15.5, 10.0, 78.0);
        kitchen.roomStats("");
        Room livingRoom = new Room("Living Room", "Tan", 25, 20.7, 76.5);
        livingRoom.roomStats("");
        Room bathroom = new Room("Bathroom", "White", 15, 10, 74.3);
        bathroom.roomStats("");
        Room bedroom = new Room("Bedroom", "Blue", 8, 8, 78);
        bedroom.roomStats("");

        House myHouse = new House(kitchen, livingRoom, bedroom, bathroom);
        myHouse.displayInfo();

        System.out.println("-------------------------------------------------");
        System.out.println("What is the house's total square feet: " + myHouse.getHouseSquareFeet());
        System.out.println("-------------------------------------------------");
        System.out.println();

        //-----------------------------------------------------

        AC.acStats();

        //-----------------------------------------------------
        //-----------------------------------------------------

        System.out.println("-------------------------------------------------");
        System.out.println("Call by Value ");
        System.out.println("-------------------------------------------------");
        System.out.println();

        AC.changeTemperatureDown(livingRoom.getTemperature(), 5);

        livingRoom.roomStats("");


        AC.changeTemperatureDown(myHouse.getKitchen().getTemperature(), 3);

        myHouse.getKitchen().roomStats("");

        AC.acStats();

        //-----------------------------------------------------
        //-----------------------------------------------------

        System.out.println("-------------------------------------------------");
        System.out.println("Call by Reference ");
        System.out.println("-------------------------------------------------");
        System.out.println();

        AC.changeTemperatureDown(livingRoom, 5);
        livingRoom.roomStats("");

        AC.changeTemperatureDown(myHouse.getKitchen(), 3);
        myHouse.getKitchen().roomStats("");

        AC.acStats();

    }

    public static void yourInfoHeader() {

        System.out.println("===============================================");
        System.out.println("PROGRAMMER: " + "Lielle Sasson");
        System.out.println("PANTHER ID: " + "6304972");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210 ");
        System.out.println("SECTION: \t " + "UO1");
        System.out.println("SEMESTER: \t " + "Spring 2022");
        System.out.println("CLASSTIME: \t " + "T/TH 9:30-12:15");
        System.out.println();
        System.out.println("Assignment: " + "Lab5");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person.");
        System.out.println("===============================================");
        System.out.println();

    }//end yourInfoHeader



}//end controller
