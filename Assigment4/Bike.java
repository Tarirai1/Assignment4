public class Bike implements Vehicle {
    private boolean isInsuranceIncluded;

    public Bike(boolean isInsuranceIncluded) {
        this.isInsuranceIncluded = isInsuranceIncluded;
    }

    @Override
    public void start() {
        System.out.println("Bike started...");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped...");
    }

    public boolean isInsuranceIncluded() {
        return isInsuranceIncluded;
    }
}

public class Scooter implements Vehicle {
    private boolean isInsuranceIncluded;

    public Scooter(boolean isInsuranceIncluded) {
        this.isInsuranceIncluded = isInsuranceIncluded;
    }

    @Override
    public void start() {
        System.out.println("Scooter started...");
    }

    @Override
    public void stop() {
        System.out.println("Scooter stopped...");
    }

    public boolean isInsuranceIncluded() {
        returnisInsuranceIncluded;

    }

interface Vehicle {
}

interface Vehicle {
}

interface Vehicle {
}

interface Vehicle {
}
