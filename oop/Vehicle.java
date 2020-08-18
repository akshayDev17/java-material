public class Vehicle extends Crashable implements Drivable, Cloneable{

    int numWheels = 2;
    double theSpeed = 0;
    int carStrength = 0;

    public int getWheel(){
        return this.numWheels;
    }
    public void setWheels(int numWheels){
        this.numWheels = numWheels;
    }

    public double getSpeed(){
        return this.theSpeed;
    }
    public void setSpeed(double speed){
        this.theSpeed = speed;
    }

    Vehicle(){}
    Vehicle(int numWheels, double speed){
        this.setSpeed(speed);
        this.setWheels(numWheels);
    }

    public void setCarStrength(int strength){
        this.carStrength = strength;
    }

    public int getCarStrength(){
        return this.carStrength;
    }

    public Object clone(){
        // this returns an object
        Vehicle car;
        // we have to catch a "clone not supported exception"
        try{
            car = (Vehicle) super.clone();
        } catch (CloneNotSupportedException e){
            return null;
        }
        return car;
    }
}