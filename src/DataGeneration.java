import Models.*;
import Strategy.DurationBasedFeeCalculationStrategy;
import Strategy.RandomSlotAllocationStrategy;
import Strategy.SequenceSlotAllocationStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataGeneration {

    public static ParkingLot generateData()
    {
        ParkingSlot parkingSlot1 = new ParkingSlot(1,1,1, ParkingSlotStatus.FREE, SlotType.BIG_FOUR_WHEELER);
        ParkingSlot parkingSlot2 = new ParkingSlot(2,2,1, ParkingSlotStatus.FREE, SlotType.BIG_FOUR_WHEELER);
        ParkingSlot parkingSlot3 = new ParkingSlot(3,3,1, ParkingSlotStatus.FREE, SlotType.BIG_FOUR_WHEELER);
        ParkingSlot parkingSlot4 = new ParkingSlot(4,4,1, ParkingSlotStatus.FREE, SlotType.SMALL_FOUR_WHEELER);

        List<ParkingSlot> parkingSlots = new ArrayList<ParkingSlot>();
        parkingSlots.add(parkingSlot1);
        parkingSlots.add(parkingSlot2);
        parkingSlots.add(parkingSlot3);
        parkingSlots.add(parkingSlot4);

        HashMap<VehicleType, Integer> allowedVehicles = new HashMap<VehicleType, Integer>();
        allowedVehicles.put(VehicleType.BIG_FOUR_WHEELER,3);
        allowedVehicles.put(VehicleType.SMALL_FOUR_WHEELER,1);

        ParkingFloor parkingFloor1 = new ParkingFloor(1,1,1,ParkingFloorStatus.OPERATIONAL,parkingSlots, allowedVehicles);


        ParkingSlot parkingSlot11 = new ParkingSlot(5,1,2, ParkingSlotStatus.FREE, SlotType.SMALL_FOUR_WHEELER);
        ParkingSlot parkingSlot12 = new ParkingSlot(6,2,2, ParkingSlotStatus.FREE, SlotType.SMALL_FOUR_WHEELER);
        ParkingSlot parkingSlot13 = new ParkingSlot(7,3,2, ParkingSlotStatus.FREE, SlotType.BIG_FOUR_WHEELER);
        ParkingSlot parkingSlot14 = new ParkingSlot(8,4,2, ParkingSlotStatus.FREE, SlotType.BIG_FOUR_WHEELER);

        List<ParkingSlot> parkingSlots1 = new ArrayList<ParkingSlot>();
        parkingSlots1.add(parkingSlot11);
        parkingSlots1.add(parkingSlot12);
        parkingSlots1.add(parkingSlot13);
        parkingSlots1.add(parkingSlot14);

        HashMap<VehicleType, Integer> allowedVehicles1 = new HashMap<VehicleType, Integer>();
        allowedVehicles1.put(VehicleType.BIG_FOUR_WHEELER,2);
        allowedVehicles1.put(VehicleType.SMALL_FOUR_WHEELER,2);

        ParkingFloor parkingFloor2 = new ParkingFloor(2,2,1,ParkingFloorStatus.OPERATIONAL,parkingSlots1, allowedVehicles1);

        List<ParkingFloor> parkingFloors = new  ArrayList<>();
        parkingFloors.add(parkingFloor1);
        parkingFloors.add(parkingFloor2);

        HashMap<VehicleType, Integer> allowedVehiclesParkingLot = new HashMap<>();
        allowedVehiclesParkingLot.put(VehicleType.BIG_FOUR_WHEELER,5);
        allowedVehiclesParkingLot.put(VehicleType.SMALL_FOUR_WHEELER,3);

        //int id, String name, List<ParkingFloor> parkingFloors, ParkingLotStatus parkingLotStatus, List<Gate> entryGates, List<Gate> exitGates, HashMap<VehicleType, Integer> allowedVehicles, SlotAllocationStrategy slotAllocationStrategy,  feeCalculationStrategy) {


        Operator operator1 = new Operator(1,1,"Anil");
        Operator operator2 = new Operator(2,2,"Amit");
        Operator operator3 = new Operator(3,3,"Rahul");
        Operator operator4 = new Operator(4,4,"Kush");




        Gate entry1 = new Gate(1,1,GateType.ENTRY , operator1,GateStatus.OPEN);
        Gate entry2 = new Gate(2,2,GateType.ENTRY , operator2,GateStatus.OPEN);

        Gate exit1 = new Gate(3,1,GateType.EXIT , operator3,GateStatus.OPEN);
        Gate exit2 = new Gate(4,2,GateType.EXIT , operator4,GateStatus.OPEN);

        List<Gate> entryGates = new ArrayList<>();
        entryGates.add(entry1);
        entryGates.add(entry2);
        List<Gate> exitGates = new ArrayList<>();
        exitGates.add(exit1);
        exitGates.add(exit2);

        ParkingLot parkinglot = new ParkingLot(1,"MyParkingLot" ,parkingFloors , ParkingLotStatus.OPERATIONAL , entryGates , exitGates , allowedVehiclesParkingLot , new SequenceSlotAllocationStrategy(), new DurationBasedFeeCalculationStrategy());
        return parkinglot;
    }
}

