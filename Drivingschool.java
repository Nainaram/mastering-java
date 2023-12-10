import java.util.*;
// creating a car class that having cartype, model , licenseplate and car properties
class Car {
    private String carType;
    private String model;
    private String licensePlate;

    public Car(String carType, String model, String licensePlate) {
        this.carType = carType;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public void start() {
        System.out.println("Car started.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }

    public void drive() {
        System.out.println("Car is on the move.");
    } 
}
// creating a payment method that give the type of payment done!!
class Payment {
    private String paymentMethod;

    public Payment(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment() {
        System.out.println("Payment processed using " + paymentMethod);
    }
}
// create a class Driving class booking that takes the details of the customer!!!
class DrivingClassBooking {
    private String instructorName;
    private String date;
    private String time;

    public DrivingClassBooking(String instructorName, String date, String time) {
        this.instructorName = instructorName;
        this.date = date;
        this.time = time;
    }

    public void bookClass() {
        System.out.println("Driving class booked with instructor " + instructorName + " on " + date + " at " + time);
    }

    public void cancelBooking() {
        System.out.println("Booking canceled.");
    }
}
// create a class driving mode that gives the modes of driving to choosen either self or undered survilence
class DrivingMode {
    private String modeType;

    public DrivingMode(String modeType) {
        this.modeType = modeType;
    }

    public void switchMode() {
        System.out.println("Switching to " + modeType + " mode.");
    }
}
// Finally after  learning we need to print the message you got a license so ,
// will print the message
class LicenseManager {
    public void receiveLicense() {
        System.out.println("Congratulations! You have received your driving license.");
    }
}
// Driver code that runs up the Driving School
public class Drivingschool {
    public static void main(String[] args) {
        // Create objects for each class
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the  car model !!!");
        String  model = sc.nextLine();

        Car myCar = new Car("Sedan", model, "ABC123");
        Payment creditCardPayment = new Payment("Credit Card");
        DrivingClassBooking drivingClassBooking = new DrivingClassBooking("John Doe", "2023-12-15", "10:00 AM");
        DrivingMode selfDrivingMode = new DrivingMode("Self Driving");
        LicenseManager licenseManager = new LicenseManager();

        // Example usage
        myCar.start();
        myCar.drive();
        creditCardPayment.processPayment();
        drivingClassBooking.bookClass();
        selfDrivingMode.switchMode();
        licenseManager.receiveLicense();
        myCar.stop();
    }
}
