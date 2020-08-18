public class Animals implements Cloneable{
    private String name = "Animal";
    public String favFood = "Food";

    protected final void changeName(String newName){
        this.name = newName;
    }
    protected final String getName(){
        return this.name;
    }
    public void eatStuff(){
        System.out.println("Yum " + favFood);
    }
    public void walkAround(){
        System.out.println(this.name + " walks");
    }
    public Animals(){

    }
    public Animals(String name, String favFood){
        this.changeName(name);
        this.favFood = favFood; 
    }

    public Object clone(){
        Animals animal;
        try{
            animal = (Animals) super.clone();
        } catch (CloneNotSupportedException e){
            return null;
        }
        return animal;
    }
}