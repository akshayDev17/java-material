public class Animal{

    public String name;
    private double height;
    private double weight;
    private String favFood;
    private double speed;
    private String sound;

    // instance variable that is a
    // subclass of the interface
    public Flys flyingtype;

    public String getFavFood(){
        return this.favFood;
    }
    public double getSpeed(){
        return this.speed;
    }
    public String getSound(){
        return this.sound;
    }
    public String getName(){
        return this.name;
    }
    public double getHeight(){
        return this.height;
    }
    public double getWeight(){
        return this.weight;
    }

    public void setFavFood(String newFavFood){
        this.favFood = newFavFood;
    }
    public void setSpeed(double newSpeed){
        this.speed = newSpeed;
    }
    public void setSound(String newSound){
        this.sound = newSound;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setHeight(double newHeight){
        this.height = newHeight;
    }
    public void setWeight(double newWeight){
        this.weight = newWeight;
    }
    public String tryToFly(){
        return flyingtype.fly();
    }

    public void setFlyingAbility(Flys newFlyType){
        flyingtype = newFlyType;
    }
}