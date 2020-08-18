public class Cat extends Animals{
    // new field which the Animals 
    // class doesn't have access to
    public String favToy = "Yarn";

    public void playWith(){
        System.out.println("Yay " + favToy);
    }

    // @Override
    public void walkAround(){
        System.out.println(this.getName() + " purrs around");
    }

    public String getToy(){
        return this.favToy;
    }

    public Cat(){

    }

    public Cat(String name, String favFood, String favToy){
        super(name, favFood);
        this.favToy = favToy;
    }

}