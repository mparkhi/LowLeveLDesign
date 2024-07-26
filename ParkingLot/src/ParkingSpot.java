import vehicletype.Vehicle;
import vehicletype.VehicleType;
public class ParkingSpot {
    private final int spotnumber;
    private final VehicleType vehicleType;

    private Vehicle parkedVehicle;

    public ParkingSpot(int spotnumber){
        this.spotnumber = spotnumber;
        this.vehicleType = VehicleType.CAR;
    }
    public synchronized boolean isAvailable(){
        return parkedVehicle == null;
    }

    public synchronized void parkVehicle(Vehicle vehicle){
        if(isAvailable() && vehicle.getType() == vehicleType){
            parkedVehicle = vehicle;
        }else{
            throw new IllegalArgumentException("The vehicle spot is already occupied");
        }
    }
    public synchronized void unparkVehicle(){
        parkedVehicle = null;
    }
    public VehicleType getVehicleType(){
        return vehicleType;
    }
    public Vehicle getParkedVehicle(){
        return parkedVehicle;
    }
    public int getSpotNumber(){
        return spotnumber;
    }
}
