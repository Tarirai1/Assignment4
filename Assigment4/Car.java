public class Car implements Vehicle {
    private boolean isInsuranceIncluded;

    public Car(boolean isInsuranceIncluded) {
        this.isInsuranceIncluded = isInsuranceIncluded;
    }

    @Override
    public void start() {
        System.out.println("Car started...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped...");
    }

    public boolean isInsuranceIncluded() {
        return isInsuranceIncluded;
    }
}

interface Vehicle {
    void start();

    void stop();
}