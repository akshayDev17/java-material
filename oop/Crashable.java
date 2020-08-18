public abstract class Crashable {
    boolean carDrivable = true;

    public void youCrashed(){
        this.carDrivable = false;
    }

    public abstract void setCarStrength(int strength);
    public abstract int getCarStrength();
}