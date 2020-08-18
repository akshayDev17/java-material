```bash
# run from vscode - press F5

# run from command line
javac filename.java # compile step
java filename # run step
```



# Javac<a name="javac"></a>

1. compiler for java
2. The **javac** tool reads class and interface definitions, written in the Java programming language, and compiles them into bytecode class files. 
3. It can also process annotations in Java source files and classes.
4. Source code file names must have `.java` suffixes, class file names must have `.class` suffixes, and both source and class files must have root names that identify the class. 
   1. For example, a class called `MyClass` would be written in a source file called `MyClass.java` and compiled into a bytecode class file called `MyClass.class`.
   2. Inner class definitions produce additional class files. These class files have names combining the inner and outer class names, such as `MyClass$MyInnerClass.class`.



`%-15s` :

* % - replaced by arguments given
* `-` = left-justified formatting
* `15` - if the result is less than 15 characters long, add spaces until it is 15 characters long
* `s` means: convert the parameter into a string with `toString` and use the result

In `%03d`:

- `0` means: pad with `0`s instead of spaces
- `3` means: make it at least 3 characters long
- `d` means: the argument will be an integer number, format it as a base-10 number.
- [flags can be found here](https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax) , only for the integer formatting is the **0** flag valid, for all other types of formats, no weird flags allowed, hence we can't print `["="*30]` like we did in python.

## Difference between println and printf

**println()** prints a new blank line and then your message.
**printf()** provides string formatting similar to the printf function in C.
printf() is primarily needed when you need to print big strings to avoid string concatenaion in println() which can be confusing at times.
(Although both can be used in almost all cases).

Eg.
int a = 10;int b = 20;

println("a: " + a + " b: " + b); //Tedious String Concatenation

printf("a: %d b: %d\n", a, b); // Output using string formatting.

While printf() enables you to print fractional outputs up to any decimal place in a single line, the same task using println() can get very complex.

Eg.
printf("%.6f",x); // prints x up to 6 decimal places.



## Static initialiser blocks

* executed before the `public static main` function

* Java does not care if this block is written after the `main` method or before the `main` method, it will be executed before the `main()` regardless.

* execute only one time

* many Static Initialization Blocks in a specific class

  * called in a manner in the order they are written in the program.

* block will not return anything

* cannot use the "this" keyword since it does not have any instance.

* multiple static blocks

  ```java
  package demo;  
  public class Demo  
  {  
     static  
     {  
         System.out.println("FIRST STATIC BLOCK");  
     }  
     static  
     {  
         System.out.println("SECOND STATIC BLOCK");  
     }  
     static  
     {  
         System.out.println("THIRD STATIC BLOCK");  
     }  
     public static void main(String[] args)  
     {  
     }  
  }  
  ```

* static blocks are executed before constructors

  ```java
  class Test { 
      static int i; 
      int j; 
      static { 
          i = 10; 
          System.out.println("static block called "); 
      } 
      Test(){ 
          // this is not a static block
          System.out.println("Constructor called"); 
      } 
      // this is just the initialiser block(no static)
      { 
          // This code is executed before every constructor. 
          System.out.println("Common part of constructors invoked !!"); 
      } 
  } 
    
  class Main { 
      public static void main(String args[]) { 
    
         // Although we have two objects, static block is executed only once. 
         Test t1 = new Test(); 
         Test t2 = new Test(); 
      } 
  } 
  ```

  ```bash
  Output:
  static block called
  Constructor called
  Constructor called
  ```

* 



**Strings are immutable, cannot be indexed like an array**

* to access a particular index, we need to write `str.charAt(ind)`

* stored in string-constant pool

* ```java
  String s = “GEEKS”;
  char [] ch = s.toCharArray();
  ```

* 

**Character arrays are mutable, and can be indexed like an array**

* ```java
  char[] a = {‘G’, ‘E’, ‘E’, ‘K’, ‘S’};
  String A = new String(a);
  ```

* stored in heap



Just like in C, arrays are pass-by-reference in Java

```java
public static void callee(String[] s){
	s[0] = "AkshaY";s[1]="prabhakant";
}
public static void caller(){
    String[] s = {"akshay", "bagde"};
    callee(s);
    System.out.println(Arrays.toString(s));
    // this will print AkshaY, prabhakant
}
```



## Pass-by

1. variables like int, String, char, etc. are pass-by-value, i.e. if we pass that variable into a function, and inside the function body, this variable is invoked to change, this will be reflected in the functional scope only
2. but classes and objects are pass-by-reference, i.e. if the function makes a change in any fields of the object, then the object is changed globally. for instance Arrays.