import Controllers.ParkingLotController;
import Models.*;

public class Client {
    public static void main(String[] args) {

        ParkingLot parkingLot = DataGeneration.generateData();

        Vehicle vehicle1 = new Vehicle(1, "UP1212X1212", "2323121212", VehicleType.SMALL_FOUR_WHEELER);

        ParkingLotController parkingLotController = new ParkingLotController();
        Ticket ticket1 = parkingLotController.packVehicle(vehicle1, parkingLot);

        if (ticket1 != null)
        {
            System.out.println("Please go to " + ticket1.getParkingSlot().getParkingFloorId() + " floor " +ticket1.getParkingSlot().getSlotNumber() +" slot. " + ticket1.getEntryDate() + " is the entry time having ticket number +" + Math.abs(ticket1.getTicketNumber()));
        }
        else
        {
            System.out.println("No parking lots found");
        }

        Vehicle vehicle2 = new Vehicle(2, "UP1212X3322", "2324232212", VehicleType.EIGHT_WHEELER);

        Ticket ticket2 = parkingLotController.packVehicle(vehicle2, parkingLot);

        if (ticket2 != null)
        {
            System.out.println("Please go to " + ticket2.getParkingSlot().getParkingFloorId() + " floor " +ticket2.getParkingSlot().getSlotNumber() +" slot. " + ticket2.getEntryDate() + " is the entry time having ticket number +" + Math.abs(ticket2.getTicketNumber()));
        }
        else
        {
            System.out.println("No parking lots found");
        }

        Vehicle vehicle3 = new Vehicle(3, "UP6612X3322", "4523232323", VehicleType.SMALL_FOUR_WHEELER);

        Ticket ticket3 = parkingLotController.packVehicle(vehicle3, parkingLot);

        if (ticket3 != null)
        {
            System.out.println("Please go to " + ticket3.getParkingSlot().getParkingFloorId() + " floor " +ticket3.getParkingSlot().getSlotNumber() +" slot. " + ticket3.getEntryDate() + " is the entry time having ticket number +" + Math.abs(ticket3.getTicketNumber()));
        }
        else
        {
            System.out.println("No parking lots found");
        }


        //exit and generate bill, make payment

        Bill bill = parkingLotController.makeExit(vehicle1 , ticket1, parkingLot);

        System.out.println("You paid " + bill.getAmount());
        System.out.println("Thanks for parking with us ! ");

        Vehicle vehicle4 = new Vehicle(4, "UP66Y3322", "7372232332", VehicleType.SMALL_FOUR_WHEELER);

        Ticket ticket4 = parkingLotController.packVehicle(vehicle3, parkingLot);

        if (ticket4 != null)
        {
            System.out.println("Please go to " + ticket4.getParkingSlot().getParkingFloorId() + " floor " +ticket4.getParkingSlot().getSlotNumber() +" slot. " + ticket4.getEntryDate() + " is the entry time having ticket number +" + Math.abs(ticket4.getTicketNumber()));
        }
        else
        {
            System.out.println("No parking lots found");
        }
    }
}