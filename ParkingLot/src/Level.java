import java.util.List;
import java.util.ArrayList;
import vehicletype.Vehicle;

public class Level {
    private final int floor;
    private final List<ParkingSpot> parkingSpots;
    public Level(int floor, int numSpots){
        this.floor = floor;
        parkingSpots = new ArrayList<>(numSpots);
        for(int i = 0; i < numSpots; i++){
            parkingSpots.add(new ParkingSpot(i));
        }
    }
    public synchronized boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot : parkingSpots){
            if(spot.isAvailable() && spot.getVehicleType() == vehicle.getType()){
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }
    public synchronized boolean unparkVehicle(Vehicle vehicle){
        for(ParkingSpot spot : parkingSpots){
            if(!spot.isAvailable() && spot.getParkedVehicle().equals(vehicle)){
                return true;
            }
        }
        return false;
    }
    public void displayAvailability(){
        for(ParkingSpot spot: parkingSpots){
            System.out.println("Spot " + spot.getSpotNumber() + ": " + (spot.isAvailable() ? "Available" : "Occupied"));
        }
    }
}
