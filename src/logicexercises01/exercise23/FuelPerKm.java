package logicexercises01.exercise23;

// Create an algorithm that calculates the amount of fuel (in liters) spent on a trip,
// knowing that the car gets 12 km per liter. The user must be provided with the time
// that will be spent on the trip, their average speed, the distance covered, and the
// amount of liters used to make the trip.
// Formula: distance = time × speed.
// liters used = distance / 12.
public class FuelPerKm {
    public static void main(String[] args) {

        final int KM_PER_LITER = 12;
        final int TIME_TRIP = 4;
        final int AVERAGE_SPEED = 80;
        final int DISTANCE_COVERED = TIME_TRIP * AVERAGE_SPEED;
        final int LITERS_USED = DISTANCE_COVERED / KM_PER_LITER;

        System.out.println("Time spend on trip: " + TIME_TRIP +" Hours");

        System.out.println("Your average speed: " + AVERAGE_SPEED + " Km/h");

        System.out.println("Distance covered: " + DISTANCE_COVERED +" Km");

        System.out.print("Amount of liters used in the trip: " + LITERS_USED + " L");


    }
}
