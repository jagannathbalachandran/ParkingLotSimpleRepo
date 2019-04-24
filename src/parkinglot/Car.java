package parkinglot;

/**
 * Created by jaggu on 4/24/19.
 */
public class Car {
    public void park(ParkingLot parkingLot) throws Exception {
        parkingLot.addCar();
    }

    public void unpark(ParkingLot parkingLot) {
        parkingLot.removeCar();
    }
}
