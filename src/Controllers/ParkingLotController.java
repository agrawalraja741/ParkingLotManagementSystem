package Controllers;

import Models.*;
import Strategy.SlotAllocationStrategy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
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

    public Bill makeExit(Vehicle vehicle , Ticket ticket, ParkingLot parkingLot) {
        HashMap<VehicleType, Integer> updatedAllowedVehicle = parkingLot.getAllowedVehicles();
        updatedAllowedVehicle.put(vehicle.getVehicleType(), updatedAllowedVehicle.get(vehicle.getVehicleType()) + 1);
        parkingLot.setAllowedVehicles(updatedAllowedVehicle);

        ParkingFloor parkingFloor = null;

        for (ParkingFloor parkingFloor1 : parkingLot.getParkingFloors()) {

            if (parkingFloor1.getId() == ticket.getParkingSlot().getParkingFloorId()) {
                parkingFloor = parkingFloor1;
                break;
            }

        }


        HashMap<VehicleType, Integer> updatedFloorAllowedVehicle = parkingFloor.getAllowedVehicles();
        updatedFloorAllowedVehicle.put(vehicle.getVehicleType(), updatedFloorAllowedVehicle.get(vehicle.getVehicleType()) + 1);
        parkingFloor.setAllowedVehicles(updatedFloorAllowedVehicle);

        //free mark to slot

        ParkingSlot parkingSlot = ticket.getParkingSlot();
        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.FREE);

        int amount = parkingLot.getFeeCalculationStrategy().calculateFee(vehicle, ticket, LocalDateTime.now());
        Random random = new Random();

        Bill bill = new Bill(1, new String(random.nextInt(34567) + ""), ticket,
                LocalDateTime.now(), amount, parkingLot.getExitGates().getFirst().getOperator(),
                parkingLot.getExitGates().getFirst(), BillStatus.PAID, null);

        return bill;
    }
}
