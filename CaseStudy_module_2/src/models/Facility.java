package models;

import java.security.PublicKey;
import java.util.List;

public abstract class Facility {
    String serviceName;
    double usableArea;
    double rentalCosts;
    int maximumQuantity;
    int typeRent;
    public Facility() {
    }
    public Facility(String serviceName, double usableArea, double rentalCosts, int maximumQuantity, int typeRent) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumQuantity = maximumQuantity;
        this.typeRent = typeRent;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public int getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(int typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumQuantity=" + maximumQuantity +
                ", typeRent=" + typeRent +
                '}';
    }
}
