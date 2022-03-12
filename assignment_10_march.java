
/*"Revise  OOPS concepts


Prepare interview questions from :
  
https://www.softwaretestinghelp.com/oops-interview-questions-and-answers/
  
1.  Object Oriented Programming in Java?

Answer: OOP deals with objects, like real-life entities such as pen, 
mobile, bank account which has state (data) and behavior (methods).
With help of access, specifiers access to this data and methods is made secured.
Concepts of encapsulation and abstraction offer data hiding and access to essentials,
inheritance, and polymorphism help code reuse and overloading/overriding of methods and 
constructors, making applications platform-independent, secured and robust using languages like Java.

2.  Is Java a pure Object Oriented language?

Answer: Java is not an entirely pure object-oriented programming language. 
The following are the reasons:
Java supports and uses primitive data types such as int, float, double, char, etc.
Primitive data types are stored as variables or on the stack instead of the heap.
In Java, static methods can access static variables without using an object, contrary to object-oriented concepts.

3.    class and object in Java?

Answer: Class and object play an integral role in object-oriented programming languages like Java.
Class is a prototype or a template that has state and behavior supported by an object and used in the creation of objects.
The object is an instance of the class, for example, Human is a class with the state as having a vertebral system, brain, color, and height and has behavior such as canThink(), ableToSpeak(), etc.

4.  differences between class and objects in Java?

Answer: Following are a few major differences between class and objects in Java:

Class	                                                Object
Class is a logical entity	                                        Object is physical entity
Class is a template from which object can be created	            Object is an instance of the class
Class is a prototype that has the state and behavior of similar     objects	Objects are entities that exist in real life such as mobile, mouse, or intellectual objects such as bank account
Class is declared with class key word like class Classname { }	    Object is created via new keyword as Employee emp = new Employee();
During class creation, there is no allocation of memory	During object creation, memory is allocated to the object
There is only one-way class is defined using the class keyword	Object creation can be done many ways such as using new keyword, newInstance() method, clone() and factory method.
Real-life examples of Class can be a
•A recipe to prepare food.
•Blue prints for an automobile engine.
Real-life examples of Object can be
•A food prepared from recipe.
•Engine constructed as per blue-prints.
5 Why is a need for Object-oriented programming?

Answer: OOP provides access specifiers and data hiding features for more security and control data access, overloading can be achieved with function and operator overloading, Code Reuse is possible as already created objects in one program can be used in other programs.

Data redundancy, code maintenance, data security, and advantage of concepts such as encapsulation, abstraction, polymorphism, and inheritance in object-oriented programming provide an advantage over previously used procedural programming languages.


Give some real-time examples and explain Inheritance.

Answer: Inheritance means one class (sub class) acquiring properties of another class (super class) by inheritance. In real life, take an example of inheritance of a normal bicycle where it is a parent class and a sports bike can be a child class, where sports bike has inherited properties and behavior of rotating wheels with pedals via gears that of a normal bike.

Q #8) How polymorphism works in Java, explain with real-life examples?

Answer: Polymorphism is an ability to have multiple forms or capability of the method to do different things. In real life, the same person performing different duties behaves differently. In-Office he is an employee, at home, he is a father, during or in after school tuitions he is a student, on weekends he plays cricket and is a player in the playground.

In Java, there are two types of polymorphism

Compile-time polymorphism: This is achieved by method overloading or operator overloading.
Runtime polymorphism: This is achieved by method overriding.
Q #9) How many types of inheritance are present?

Answer: Various types of inheritance are listed below:

Single Inheritance: Single child class inherits characteristics of the single-parent class.
Multiple Inheritance: One class inherits features of more than one base class and is not supported in Java, but the class can implement more than one interface.
Multilevel Inheritance: A class can inherit from a derived class making it a base class for a new class, for example, a Child inherits behavior from his father, and the father has inherited characteristics from his father.
Hierarchical Inheritance: One class is inherited by multiple subclasses.
Hybrid Inheritance: This is a combination of single and multiple inheritances.
Q #10) What is Interface?

Answer: Interface is similar to the class where it can have methods and variables,
but its methods do not have a body, just a signature known as the abstract method.
Variables declared in the interface can have public, static, and final by default. 
Interface is used in Java for abstraction and multiple inheritances, where the class 
can implement multiple interfaces.

13) What are different access modifiers in Java?

Answer: Access modifiers in Java controls access scope of class, constructor, variable, method, or data member. Various types of access modifiers are as follows:

Default access modifier is without any access specifier data members, class and methods, and are accessible within the same package.
Private access modifiers are marked with the keyword private, and are accessible only within class, and not even accessible by class from the same package.
Protected access modifiers can be accessible within the same package or subclasses from different packages.
Public access modifiers are accessible from everywhere.

Constructor is a method without a return type and has its name the same as the class name. When we create an object, a default constructor allocates memory for an object during the compilation of Java code. Constructors are used to initializing objects and set initial values for object attributes.

Q #17) How many types of constructors can be used in Java? Please explain.

Answer: There are basically three types of constructors in Java.

These are: 

Default constructor: This constructor is without any parameter and invokes every time you create an instance of a class (object). If a class is an Employee, then the syntax of the default constructor will be Employee().
No-arg constructor: As the name implies, a constructor without any argument is called a no-arg constructor.
Parameterized constructor: Constructor with a number of parameters is called a parameterized constructor. You are required to provide arguments, i.e. initial values with respect to the data type of parameters in that constructor.

18) Why new keyword is used in Java?

Answer: When we create an instance of class, i.e. objects, we use the Java keyword new. It allocates memory in the heap area where JVM reserve space for an object. Internally, it invokes the default constructor as well.

Syntax:

Class_name obj = new Class_name();

19.  When do you use this keyword?

Answer: this keyword in Java refers to the current object in the constructor or in the method.

When class attributes and parameterized constructors both have the same name, this keyword is used.
Keywords this invokes the current class constructor, method of the current class, return the object of the current class, pass an argument in the constructor, and method call.


20.  When do you use the super keyword?

Answer: Super is a Java keyword used to identify or refer parent (base) class.

We can use super to access super class constructor and call methods of the super class.
When method names are the same in super class and sub class, to refer super class, the super keyword is used.
To access the same name data members of parent class when they are present in parent and child class.
Super can be used to make an explicit call to no-arg and parameterized constructors of the parent class.
Parent class method access can be done using super, when child class has method overridden.


23) What is method overloading?

Answer: When two or more methods with the same name have either a different number of parameters or different types of parameters, these methods may have or may not have different return types, then they are overloaded methods, and the feature is method overloading. Method overloading is also called compile-time polymorphism.

24) What is method overriding?

Answer: When a method of sub class (derived, child class) has the same name, parameters (signature), and same return type as the method in its super class (base, parent class) then the method in the subclass is said to be overridden the method in the superclass. This feature is also known as runtime polymorphism.

25) Explain constructor overloading.

Answer: More than one constructor having different parameters so that different tasks can be carried out with each constructor is known as constructor overloading. With constructor overloading, objects can be created in different ways. Various Collection classes in Java API are examples of constructor overloading.

26.  Can you explain base class, subclass, and superclass?

Answer: Base class, sub class, and super class in Java are explained as follows:

Base class or parent class is a super class and is a class from which sub class or child class is derived.
Sub class is a class that inherits attributes (properties) and methods (behavior) from the base class.

30) When the finalize method is used?

Answer: finalize method is called just before the object is about to be garbage collected. This method overrides to minimize memory leaks, undertake cleanup activities by removing system resources.

31) Explain about Tokens.

Answer: Tokens in the Java program are the smallest elements that the compiler recognizes. Identifiers, keywords, literals, operators, and separators are examples of tokens.

*/

  