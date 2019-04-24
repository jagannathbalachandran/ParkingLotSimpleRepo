package parkinglot;

/**
 * Created by jaggu on 4/24/19.
 */
public class ParkingLot {
    private int lots;
    private int noOfCars = 0;

    public ParkingLot(int capacity) {
        this.lots = capacity;
    }

    public void addCar() throws Exception {
        if(isFull()) throw new Exception("Parking lot full");
        noOfCars++;
    }


    public boolean isFull() {
        return lots == noOfCars;
    }

    public void removeCar() {
        noOfCars--;
    }
}
