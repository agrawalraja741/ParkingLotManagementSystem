package Models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Ticket {

    private int id;
    private int ticketNumber;
    private LocalDateTime entryDate;
    private Vehicle vehicle;
    private Gate gate;
    private Operator operator;
    private ParkingSlot parkingSlot;


    public Ticket(int id, int ticketNumber, LocalDateTime entryDate, Vehicle vehicle, Gate gate, Operator operator, ParkingSlot parkingSlot) {
        this.id = id;
        this.ticketNumber = ticketNumber;
        this.entryDate = entryDate;
        this.vehicle = vehicle;
        this.gate = gate;
        this.operator = operator;
        this.parkingSlot = parkingSlot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public LocalDateTime getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }
}
