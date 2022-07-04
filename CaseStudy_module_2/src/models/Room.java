package models;

public class Room extends Facility {
    String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, double usableArea, double rentalCosts, int maximumQuantity, int typeRent, String freeService) {
        super(serviceName, usableArea, rentalCosts, maximumQuantity, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public Room() {
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumQuantity=" + maximumQuantity +
                ", typeRent=" + typeRent +
                '}';
    }
}
