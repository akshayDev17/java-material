public class Tut15{
    public static void main(String[] args){
        Vehicle car = new Vehicle(4, 100.00);
        System.out.println(car.getSpeed());

        car.setCarStrength(10); 
        System.out.println(car.getCarStrength());

        car.youCrashed();
        System.out.println(car.carDrivable);

        Object superCar = new Vehicle();
        Vehicle superTruck = new Vehicle();
        // this will throw an error: method undefined for Object
        // System.out.println(superCar.getWheel());
        // on casting, this will work
        // System.out.println( ((Vehicle)superCar).getWheel());
        System.out.println(superTruck.equals(superCar)); // false

        System.out.println("Truck = " + superTruck.hashCode() + ", Car = " + superCar.hashCode());

        System.out.println(superTruck.getClass().getSuperclass());

        superTruck.setWheels(6);

        Vehicle superTruck_tesla = (Vehicle)superTruck.clone();
        System.out.println(superTruck_tesla.getWheel());

        System.out.println(superTruck.equals(superTruck_tesla));
        System.out.println(
            "Tesla = " + superTruck_tesla.hashCode() 
            + ", Truck = " + superCar.hashCode()
        );
    }
}