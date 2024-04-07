public class main {
    public static void main(String[] args) {
        VehicleRentalService rentalService = new VehicleRentalService();

        Object VehicleType = null;
        Vehicle car = rentalService.finalize();
        System.out.println("Is insurance included? " + car.isInsuranceIncluded());

        Vehicle bike = rentalService.finalize(3, VehicleType.BIKE, true);
        System.out.println("Is insurance included? " + bike.isInsuranceIncluded());

        Vehicle scooter;
        scooter = rentalService.finalize(7, VehicleType.SCOOTER);
        System.out.println("Is insurance included? " + scooter.isInsuranceIncluded());
    }

    private static class SCOOTER {
    }
}

class VehicleRentalService {
    public void finalize() {
        return null;
    }
}

class Vehicle {
    public String isInsuranceIncluded() {
        return null;
    }
}

class BIKE {
}

class BIKE {
}

class BIKE {
}

class SCOOTER {
}

class BIKE {
}