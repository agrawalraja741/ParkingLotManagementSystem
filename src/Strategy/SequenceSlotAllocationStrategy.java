package Strategy;

import Models.*;

import java.util.HashMap;

public class SequenceSlotAllocationStrategy implements SlotAllocationStrategy {

    public ParkingSlot packVehicle(Vehicle vehicle , ParkingLot parkingLot)
    {

        //fetch available Slot

        for(ParkingFloor parkingFloors : parkingLot.getParkingFloors())
        {
            if(parkingFloors.getParkingFloorStatus().equals(ParkingFloorStatus.OPERATIONAL))
            {
                for(ParkingSlot parkingSlot : parkingFloors.getParkingSlots())
                {
                    if(parkingSlot.getParkingSlotStatus().equals(ParkingSlotStatus.FREE) && parkingSlot.getSlotType().toString().equals(vehicle.getVehicleType().toString()))
                    {
                        //assign

                        ParkingSlot assignedParkingSlot = parkingSlot;
                        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.FILLED);

                        HashMap<VehicleType , Integer> updatedFloorAllowedVehicle = parkingFloors.getAllowedVehicles();
                        updatedFloorAllowedVehicle.put(vehicle.getVehicleType(),updatedFloorAllowedVehicle.get(vehicle.getVehicleType())-1);
                        parkingFloors.setAllowedVehicles(updatedFloorAllowedVehicle);
                        HashMap<VehicleType , Integer> updatedAllowedVehicle = parkingLot.getAllowedVehicles();
                        updatedAllowedVehicle.put(vehicle.getVehicleType(),updatedAllowedVehicle.get(vehicle.getVehicleType())-1);

                        parkingLot.setAllowedVehicles(updatedAllowedVehicle );

                        return assignedParkingSlot;
                    }
                }
            }
        }

        return null;
    }
}
