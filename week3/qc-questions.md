## Java Basics
* What is Java? / Why Java?
* What is JRE / JDK / JVM?
* What is an object / class?
* What is the root class from which every class extends?
* What are the primitive data types in Java?
* Where are Strings stored?
* Explain stack vs heap?
* What are annotations?
* What is a POJO? What is a bean?
* How can you force garbage collection in Java?
* Why are strings immutable in java?
* What is the difference between `String`, `StringBuilder`, and `StringBuffer`?
* What are the access modifiers in Java? Explain them.
* What are the non-access modifiers in Java?
* What is the difference between `static` and `final` variables?
* What are the default values for all data types in Java?
* What is a wrapper class?
* What is autoboxing / unboxing?
* Is Java pass-by-value or pass-by-reference?
* If two objects are equal, do they have the same hashcode? If not equal?
* What data types are supported in switch statements?
* List all non-access modifiers?
* How to pass multiple values with a single parameter into a method?
* Can we access static/non-static variables from static/non-static methods (see example)?
```java
public class A {
  public static int x = 1;
  public int y = 2;

  public static void doStuff() {
    System.out.println(y);
  }

  public void doMoreStuff() {
    System.out.println(x);
  }
}
```
* What is static block?
* What is static imports?
* What methods are available in the Object class?
* What is the difference between `==` and `.equals()`?
* What is an enhanced for loop and what is a `forEach` loop?
* What are 3 usages of `super` keyword?
  
## OOP
* What are the 4 pillars of OOP / Explain each?
* Is this allowed? Is this an example of method overloading or overriding?
```java
public abstract class Super {
  public abstract Collection getCollection();
}

public abstract class Sub extends Super {
  public abstract List getCollection();
}
```
* What is the difference between an abstract class and an interface?
* What are the implicit modifiers for interface variables?
* What is the difference between method overloading and overriding?
* Can you overload / override a main method? static method? a private method? a default method? a protected method?
*  Explain the difference
```java
List<String> mylist = new ArrayList<>();
ArrayList<String> list2 = new ArrayList<>();
```
* Difference between extends and implements?
* What are enumerations (enums)?
* What are the implicit modifiers for interface variables / methods?
* First line of constructor?
* Can you instantiate this class? Why or why not?
```java
public class Hello {}
```
## Exceptions
* What is the difference between `final`, `.finalize()`, and `finally`?
* `throw` vs `throws` vs `Throwable`?
* What is try-with-resources? What interface must the resource implement to use this feature?
* Do you need a catch block? Can have more than 1? Order of them?
* What is base class of all exceptions? What interface do they all implement?
* List some checked and unchecked exceptions?
* Multi-catch block - can you catch more than one exception in a single catch block?
* Is this an example of a checked or unchecked exception?
```java
public class MyException extends RuntimeException {}
```
