# Inheritance<a name="inheritance"></a>

1. private - variable accessible only inside the object class
2. public - variable accessible outside of the class, i.e. by anybody using an instance of that class
3. protected -  method types for subclasses to be able to access a method of their superclass.
   1. `protected final` means that this method being created in the superclass cannot be changed by its subclasses(no `override` will work).
4. using the `@Override` annotation is a good practice among Java developers to notify which methods are being overridden by the subclass.
   1. If programmer makes any mistake such as wrong method name, wrong parameter types while overriding, you would get a compile time error. As by using this annotation you instruct compiler that you are overriding this method. If you don’t use the annotation then the sub class method would behave as a new method (not the overriding method) in sub class.
   2. It improves the readability of the code. So if you change the signature of overridden method then all the sub classes that overrides the particular method would throw a compilation error, which would eventually help you to change the signature in the sub classes. If you have lots of classes in your application then this annotation would really help you to identify the classes that require changes when you change the signature of a method.
   3. a **method signature** is the method name and the number, type and order of its parameters. Return types and thrown exceptions are not considered to be a part of the method signature.
5. Avoids code duplication
6. changes to the superclass code is instantly reflected in the subclass.



# Polymorphism<a name="poly"></a>

1. whenever a method is called for a specific object, java interpreter can detect whether the object belongs to a class and then whether it belongs to any of its subclass(es), and then call the method it if belongs to the subclass.

2. for instance, consider class **Animals** and **Cat** in `Animals.java` and `Cat.java`

3. the `tobby.walkAround()` method is proof that java checks for polymorphism and then returns the method appropriate for the subclass.

4. Another problem is with `*System.out.println(tobby.getToy());*` giving an error

   1. since this method doesn't exist in both the parent and subclass, and even the variable `favToy`  doesn't exist in both Cat and Animal, this error is thrown

   2. Java cannot figure out the methods present only in the subclass if the object declaration is done in this way

      ```java
      Animals tobby = new Cat("Tobby", "Salmon", "Ball");
      ```

   3. if we still want to access methods and variables specific to `Cat` then we have to cast(**typecast**) this Animals object as a Cat object 

5. ```java
   // to check whether a given object is of a given class
   objectName instanceof className
   ```
   
6. `public final` final is the keyword to denote that a variable cannot be changed by its subclasses(no override allowed).





# Interfaces<a name="interface"></a>

1. Java doesn't allow inheritance from multiple classes, hence interface is used.
2. any number of interfaces can be used to define a class
3. **only abstract methods allowed**
4. add functionality to a class that already inherits from another class
5. You use interfaces when you want to force the user to implement every method in the class.
6. normal practice to use **adjectives** for interface-names
7. interface can be thought of as an **empty class**, with only constants and methods declared
   1. the variables cannot be altered by any class that *implements this interface*
   2. the declaration of methods(and the arguments that they take) cannot be changed by any class that implements this interface.
8. if the interface is public, all methods declared are by default `public abstract`
9. and also in a class that implements this interface, we will need to specify `public <datatype> <methodName>` for the methods are already declared inside the interface.
10. The `Cloneable` interface lets you make clones of a particular class that implements it
   1. we still need to write the exception handling for clone not supported, even though its handled by the java compiler
   2. `Test14.java` confirms that on implementing a clone method for a superclass, all its subclasses also got that clone method, without themselves being direct implementations of `Cloneable` interface
   3. if we simply assign a object to another object, i.e. `Animal x = animal;` this just makes the variable x refer to the original object animal, but if `Animal x = (Animals) animal.clone(); ` will actually create a new object, which is the clone of the original one, but with a **different hashCode** .
11. classes from different inheritance trees can use a common interface



# Abstract Class<a name="abstract-class"></a>

1. You use an abstract when you only want the user to implement some of the methods.
2. this is a lot like an interface, but here we have to declare every method as public abstract, if we choose to not define it inside this abstract class
3. `Crashable` is the abstract class
   1. the method `youCrashed()` is already implemented
   2. other methods are only declared, hence they should be implemented by any other class that extends this class.
4. We cannot create any objects from an abstract class
5. there is no difference between `abstract public className`  and  `public abstract className` in terms of end-result.



* `hashCode()` - returns the integer hash code value of the object
  * An object hash code value can change in multiple executions of the same application.
  * If two objects are equal according to equals() method, then their hash code must be same.
  * If two objects are unequal according to equals() method, their hash code are not required to be different. Their hash code value may or may-not be equal.
  * [reference](https://www.journaldev.com/21095/java-equals-hashcode#:~:text=Java Object hashCode() is,of hashCode() method is%3A&text=An object hash code value,hash code must be same.) and [how is hashmap implemented in java](https://www.journaldev.com/11560/java-hashmap#how-hashmap-works-in-java)





# Encapsulation<a name="encapsulation"></a>

1. this is used to protect data inside an object

2. for instance, 2 classes, Animal and Dog, Dog inherits Animal

   ```java
   class Dog{
       String name;
       double height;
       private weight;
       
       public void setWeight(int newWeight){
           if(newWeight > 0){weight = newWeight;}
           else{ // throw some error}
       }
   }
   ```

   1. if suppose we were to allow someone to directly modify the weight field from outside, then the weight could be set to a negative value

3. instance variables - inside the class, but outside of the method, in the initialiser block of a class

4. local variables - inside a method





* for a non-static variable or a non-static method, it cannot be referenced/called inside a static-method
* a private method cannot be called, even inside the code-body of the class
  * we can create a public method inside the body of this class, that references this private method
  * and then from the outside, call this public method, but ![equation](https://latex.codecogs.com/gif.latex?%7B%5Ccolor%7BRed%7D%20%5Ctextrm%7Bthis%20defeats%20the%20whole%20purpose%20of%20keeping%20a%20private%20method%7D%7D)