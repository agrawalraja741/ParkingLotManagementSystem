package Strategy;

import Models.Ticket;
import Models.Vehicle;

import java.time.LocalDateTime;

public interface FeeCalculationStrategy {

    public int calculateFee(Vehicle vehicle, Ticket ticket , LocalDateTime exitTime);
}
