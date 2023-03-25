package building;

import buildingunit.Room;

public class House {

    //----------------------------------------------------------------------------

    private Room kitchen;
    private Room livingRoom;
    private Room bedroom;
    private Room bathroom;

    //----------------------------------------------------------------------------
    //----------------------------------------------------------------------------

    public House(Room kitchen, Room livingRoom, Room bedroom, Room bathroom ){
        this.kitchen = kitchen;
        this.livingRoom = livingRoom;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
    }

    //----------------------------------------------------------------------------

    public Room getKitchen(){
        return kitchen;
}

    public Room getLivingRoom() {
        return livingRoom;
    }

    public Room getBedroom() {
        return bedroom;
    }

    public Room getBathroom() {
        return bathroom;
    }

    //----------------------------------------------------------------------------
    public void displayInfo(){
        System.out.println("========================");
        System.out.println("House DisplayInfo");
        System.out.println("========================");


        kitchen.roomStats("\t");
        System.out.println();
        livingRoom.roomStats("\t");
        System.out.println();
        bedroom.roomStats("\t");
        System.out.println();
        bathroom.roomStats("\t");

        System.out.println();

    }

    //----------------------------------------------------------------------------
    public double getHouseSquareFeet(){
        return calculateHouseSquareFeet();
    }

    //----------------------------------------------------------------------------
    private double calculateHouseSquareFeet(){

        double totalSquareFeet = 0.0;
        double kitchen = getKitchen().getLength() * getKitchen().getWidth();
        double livingRoom = getLivingRoom().getLength() * getLivingRoom().getWidth();
        double bathroom = getBathroom().getLength() * getBathroom().getWidth();
        double bedroom = getBedroom().getLength() * getBedroom().getWidth();
        totalSquareFeet += kitchen + livingRoom + bathroom + bedroom;
        return totalSquareFeet;
    }








}//end house
