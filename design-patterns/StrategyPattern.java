public class StrategyPattern{
    public static void main(String[] args){
        Animal bear = new Animal();
        Bird sparrow = new Bird();
        Dog lab = new Dog();

        System.out.println(sparrow.tryToFly());

        // this gives an error since the animal class
        // has not by-default set its flyingType
        // System.out.println(bear.tryToFly());

        System.out.println(lab.tryToFly());
    }
}