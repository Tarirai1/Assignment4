public class VehicleRentalService {
    public Vehicle rentVehicle(int rentalDuration, VehicleType vehicleType) {
        return rentVehicle(rentalDuration, vehicleType, false);
    }

    public Vehicle rentVehicle(int rentalDuration, VehicleType vehicleType, boolean isInsuranceIncluded) {
        Vehicle vehicle = null;

        switch (vehicleType) {
            case CAR:
                vehicle = new Car(isInsuranceIncluded);
                break;
            case BIKE:
                vehicle = new Bike(isInsuranceIncluded);
                break;
            case SCOOTER:
                vehicle = new Scooter(isInsuranceIncluded);
                break;
            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }

        System.out.println("Renting " + vehicleType + " for " + rentalDuration + " days...");
        vehicle.start();

        return vehicle;
    }
}

enum VehicleType {
    CAR, BIKE, SCOOTER
}

class Vehicle {
    public void start() {

    }
}

class Car extends Vehicle {
    public Car(boolean isInsuranceIncluded) {
        super();
    }
}

class Bike extends Vehicle {
    public Bike(boolean isInsuranceIncluded) {
        super();
    }
}

class Scooter extends Vehicle {
    public Scooter(boolean isInsuranceIncluded) {
        super();
    }
}