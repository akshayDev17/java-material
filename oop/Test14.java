public class Test14{

    public static void main(String[] args){
        Animals animal = new Animals();
        System.out.println(animal.getName());
        System.out.println(animal.favFood);

        Cat morris = new Cat("Morris", "tuna", "Rubber Mouse");
        System.out.println(morris.getName());
        System.out.println(morris.favFood);
        System.out.println(morris.getToy());
        
        // since Cat is a subclass of Animals
        Animals tobby = new Cat("Tobby", "Salmon", "Ball");
        tobby.walkAround(); // this was overridden by Cat
        // hence this is an example of polymorphism
        // this will print out Cat
        System.out.println(tobby.getClass().getName());

        Cat tempCat = (Cat) tobby;
        System.out.println(tempCat.getToy());

        if(tempCat instanceof Cat){
            System.out.println("YES");
        }

        Animals new_animal_clone = animal;
        System.out.println(new_animal_clone.equals(animal));
        System.out.println(
            "Animal = " + animal.hashCode() + 
            ", new animal = " +  new_animal_clone.hashCode()
        );

        animal.changeName("Brute");
        System.out.println(new_animal_clone.getName());

        // // this is of type Object, hence wont work
        // // Animals new_animal = animal.clone();

        // // the above object, on type-casting, will work
        // Animals new_animal = (Animals) animal.clone();
        // System.out.println(
        //     "animal is equal to new_animal is " + 
        //     animal.equals(new_animal)
        // );

        // System.out.println(
        //     "animal = " + animal.hashCode() + 
        //     ", new animal = " + new_animal.hashCode()
        // );

        // Cat kitty = (Cat) morris.clone();
        // System.out.println(
        //     "morris is equal to kitty is " + 
        //     morris.equals(kitty)
        // );

        // System.out.println(
        //     "morris = " + morris.hashCode() + 
        //     ", new kitty = " + kitty.hashCode() + 
        //     " " + kitty.getClass().getName()
        // );

        // System.out.println(
        //     "Morris and kitty have the same name is " + 
        //     (morris.getName() == kitty.getName())
        // );
    }
}