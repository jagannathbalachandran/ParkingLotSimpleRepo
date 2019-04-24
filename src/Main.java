import parkinglot.Car;
import parkinglot.ParkingLot;

public class Main {

    public static void main(String[] args) throws Exception {

        ParkingLot parkingLot = new ParkingLot(5);
        Car car1 = new Car();
        car1.park(parkingLot);


        Car car2 = new Car();
        car2.park(parkingLot);

        Car car3 = new Car();
        car3.park(parkingLot);

        System.out.println("Is parking lot full " + parkingLot.isFull());

        Car car4 = new Car();
        car4.park(parkingLot);

        Car car5 = new Car();
        car5.park(parkingLot);


        System.out.println("Is parking lot full " + parkingLot.isFull());


        try
        {
            Car car6 = new Car();
            car6.park(parkingLot);
        }
        catch(Exception e){
            System.out.println("Parking lot is full , cannot park another car!!!!");
        }


        car4.unpark(parkingLot);

        try
        {
            Car car6 = new Car();
            car6.park(parkingLot);
        }
        catch(Exception e){
            System.out.println("Failed!!!! Should be able to park this car");
        }



    }
}
