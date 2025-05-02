package with.vehicle;

import with.Strategy.NormalDrive;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
