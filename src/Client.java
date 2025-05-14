import Controllers.ParkingLotController;
import Models.ParkingLot;
import Models.ParkingSlot;
import Models.Vehicle;
import Models.VehicleType;

public class Client {
    public static void main(String[] args) {

        ParkingLot parkingLot = DataGeneration.generateData();

        Vehicle vehicle1 = new Vehicle(1, "UP1212X1212", "2323121212", VehicleType.BIG_FOUR_WHEELER);

        ParkingLotController parkingLotController = new ParkingLotController();
        ParkingSlot parkingSlot = parkingLotController.packVehicle(vehicle1, parkingLot);

        if (parkingSlot != null)
        {
            System.out.println("Please go to " + parkingSlot.getParkingFloorId() + " floor " +parkingSlot.getSlotNumber() +" slot");
        }
        else
        {
            System.out.println("No parking lots found");
        }

        Vehicle vehicle2 = new Vehicle(2, "UP4444X1000", "8876545446", VehicleType.BIG_FOUR_WHEELER);
        ParkingSlot parkingSlot2 = parkingLotController.packVehicle(vehicle2, parkingLot);
        if (parkingSlot2 != null)
        {
            System.out.println("Please go to " + parkingSlot2.getParkingFloorId() +  " floor " +parkingSlot2.getSlotNumber() +" slot");
        }
        else
        {
            System.out.println("No parking lots found");
        }

        Vehicle vehicle3 = new Vehicle(3, "UP443377V0", "43231212112", VehicleType.EIGHT_WHEELER);
        ParkingSlot parkingSlot3 = parkingLotController.packVehicle(vehicle3, parkingLot);
        if (parkingSlot3 != null)
        {
            System.out.println("Please go to " + parkingSlot3.getParkingFloorId() +  " floor " +parkingSlot3.getSlotNumber() +" slot");
        }
        else
        {
            System.out.println("No parking lots found");
        }

    }
}