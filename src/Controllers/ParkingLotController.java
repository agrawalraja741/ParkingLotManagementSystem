package Controllers;

import Models.ParkingLot;
import Models.ParkingSlot;
import Models.Vehicle;
import Models.VehicleType;
import Strategy.SlotAllocationStrategy;

import java.util.HashMap;

public class ParkingLotController {

    public ParkingSlot packVehicle(Vehicle vehicle , ParkingLot parkingLot)
    {
        SlotAllocationStrategy slotAllocationStrategy = parkingLot.getSlotAllocationStrategy();
        HashMap<VehicleType,Integer> allowedVehicle =  parkingLot.getAllowedVehicles();
        if(allowedVehicle.containsKey(vehicle.getVehicleType()) && allowedVehicle.get(vehicle.getVehicleType())>=1)
        {
            return slotAllocationStrategy.packVehicle( vehicle ,  parkingLot);
        }
        else {
            return null;
        }
    }
}
