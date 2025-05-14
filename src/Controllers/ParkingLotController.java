package Controllers;

import Models.*;
import Strategy.SlotAllocationStrategy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Random;

public class ParkingLotController {

    public Ticket packVehicle(Vehicle vehicle , ParkingLot parkingLot)
    {
        SlotAllocationStrategy slotAllocationStrategy = parkingLot.getSlotAllocationStrategy();
        HashMap<VehicleType,Integer> allowedVehicle =  parkingLot.getAllowedVehicles();
        if(allowedVehicle.containsKey(vehicle.getVehicleType()) && allowedVehicle.get(vehicle.getVehicleType())>=1)
        {
            ParkingSlot parkingSlot =  slotAllocationStrategy.packVehicle( vehicle ,  parkingLot);
            return createTicket(vehicle , parkingLot , parkingSlot);

        }
        else {
            return null;
        }
    }

    private Ticket createTicket(Vehicle vehicle ,ParkingLot parkingLot ,ParkingSlot parkingSlot)
    {
        Random random = new Random();

        Ticket ticket = new Ticket( 1, random.nextInt(10000), LocalDateTime.now(),vehicle, parkingLot.getEntryGates().getFirst(), parkingLot.getEntryGates().getFirst().getOperator(), parkingSlot );

        return ticket;
    }


}
