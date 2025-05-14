package Strategy;

import Models.Ticket;
import Models.Vehicle;
import Models.VehicleType;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationBasedFeeCalculationStrategy implements FeeCalculationStrategy{

    public int calculateFee(Vehicle vehicle, Ticket ticket , LocalDateTime exitTime)
    {
        VehicleType vehicleType = vehicle.getVehicleType();
        LocalDateTime entryTime = ticket.getEntryDate();
        int basePrice = 0;
        if(vehicleType.equals(VehicleType.SMALL_FOUR_WHEELER))
        {
            basePrice = basePrice + 150;
        }
        else if(vehicleType.equals(VehicleType.BIG_FOUR_WHEELER))
        {
            basePrice = basePrice + 200;
        }
        else if(vehicleType.equals(VehicleType.TWO_WHEELER))
        {
            basePrice = basePrice + 50;
        }
        else if(vehicleType.equals(VehicleType.EIGHT_WHEELER))
        {
            basePrice = basePrice + 300;
        }

        Duration duration = Duration.between(entryTime, exitTime);
        long minutes = duration.toMinutes();
        if(minutes >= 300)
        {
            basePrice = basePrice + 500;
        }
        else if(minutes > 120)
        {
            basePrice = basePrice + 100;
        }

        return basePrice;

    }
}
