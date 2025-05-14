package Models;

import java.util.HashMap;
import java.util.List;

public class ParkingFloor {

    private int id;
    private int floorNo;
    private int parkingLotId;
    private ParkingFloorStatus parkingFloorStatus;
    private List<ParkingSlot> parkingSlots;

    private HashMap<VehicleType , Integer> allowedVehicles;

    public ParkingFloor(int id, int floorNo, int parkingLotId, ParkingFloorStatus parkingFloorStatus, List<ParkingSlot> parkingSlots, HashMap<VehicleType, Integer> allowedVehicles) {
        this.id = id;
        this.floorNo = floorNo;
        this.parkingLotId = parkingLotId;
        this.parkingFloorStatus = parkingFloorStatus;
        this.parkingSlots = parkingSlots;
        this.allowedVehicles = allowedVehicles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public HashMap<VehicleType, Integer> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(HashMap<VehicleType, Integer> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }
}
