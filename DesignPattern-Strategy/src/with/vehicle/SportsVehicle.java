package with.vehicle;

import with.Strategy.SportsDrive;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsDrive());
    }
}
