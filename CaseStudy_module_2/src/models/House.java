package models;

public class House extends Facility {
    String roomStandard;
    int numberOfFloors;

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public House() {
    }

    public House(String serviceName, double usableArea, double rentalCosts, int maximumQuantity, int typeRent, String roomStandard, int numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, maximumQuantity, typeRent);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumQuantity=" + maximumQuantity +
                ", typeRent=" + typeRent +
                '}';
    }
}
