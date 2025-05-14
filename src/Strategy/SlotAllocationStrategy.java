package Strategy;

import Models.ParkingLot;
import Models.ParkingSlot;
import Models.Vehicle;

public interface SlotAllocationStrategy {
    public ParkingSlot packVehicle(Vehicle vehicle , ParkingLot parkingLot);
}
