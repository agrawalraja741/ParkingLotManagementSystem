package Models;

public class Vehicle {

    private int id;
    private String registrationNumber;
    private String OwnerMobileNumber;
    private VehicleType vehicleType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getOwnerMobileNumber() {
        return OwnerMobileNumber;
    }

    public void setOwnerMobileNumber(String ownerMobileNumber) {
        OwnerMobileNumber = ownerMobileNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
