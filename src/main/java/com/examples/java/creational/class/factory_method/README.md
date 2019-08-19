# Factory method (AKA: Virtual constructor)

Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses, in other words, it encapsulates the knowledge of which subclass to create and moves this knowledge out of the framework. [Show diagram](./factory_method.png) 

See also ([Abstract factory](./../object/abstract_factory/README.md))

### Classification

Purpose: 

Scope: Class

### Aplicability

Use this pattern when:

- A class can't anticipate the class of objects it must create.
- A class wants its subclasses to specify the objects it creates.
- Classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate

### Structure

[See structure diagram](./structure.png)

### Participants

- __ObjectType Interface__

Defines the interface of objects the factory method creates.

- __ConcreteImpl__

Implements the < ObjectType interface >.

- __Creator__

Declares the factory method, which returns an object of type < ObjectType >. Creator may also define a default implementation of the factory method that returns a default < ObjectType >.

May call the factory method to create a < ObjectType > object.

- __ConcreteCreator__ 

Overrides the factory method to return an instance of the concrete < ObjectType >.

### Collaborations

- Creator relies on its subclasses to define the factory method so that it returns an instance of the appropriate < ObjectType > object.

### Consequences

Factory methods eliminate the need to bind application-specific classes into your code. The code only deals with the < ObjectType > interface; therefore it can work with any user-defined < ObjectType > implementation classes.

A potential disadvantage of factory methods is that clients might have to subclass the < ObjectType > class just to create a particular < ObjectType > object. Subclassing is fine when the client has to subclass the Creator class anyway, but otherwise the client now must deal with another point of evolution.

Here are two additional consequences of the Factory Method pattern:

1. Provides hooks for subclasses. 

Creating objects inside a class with a factory method is always more flexible than creating an object directly. Factory Method gives subclasses a hook for providing an extended version of an object.

2. Connects parallel class hierarchies. 

Clients can find factory methods useful, especially in the case of parallel class hierarchies.

Parallel class hierarchies result when a class delegates some of its responsibilities to a separate class. [See class hierarchies diagram](./parallel_class_hierarchies.png)

### Implementation

Consider the following issues when applying the Factory Method pattern:

1. Two major varieties. 

The two main variations of the Factory Method pattern are (1) the case when the Creator class is an abstract class and does not provide an implementation for the factory method it declares, and (2) the case when the Creator is a concrete class and provides a default implementation for the factory method. It's also possible to have an abstract class that defines a default implementation, but this is less common.

The first case requires subclasses to define an implementation,because there's no reasonable default. It gets around the dilemma of having to instantiate unforeseeable classes. In the second case, the concrete Creator uses the fac- tory method primarily for flexibility. It's following a rule that says, "Create objects in a separate operation so that subclasses can override the way they're created." This rule ensures that designers of subclasses can change the class of objects their parent class instantiates if necessary.

2. Parameterized factory methods. Another variation on the pattern lets the fac- tory method create multiple kinds of products. The factory method takes a parameter that identifies the kind of object to create. All objects the factory method creates will share the Product interface. In the Document example, Application might support different kinds of Documents. You pass Create- Document an extra parameter to specify the kind of document to create.
                                                                                                                                                                     The Unidraw graphical editing framework [VL90] uses this approach for reconstructing objects saved on disk. Unidraw defines a C r e a t o r class with a factory method C r e a t e that takes a class identifier as an argument. The class identifier specifies the class to instantiate. When Unidraw saves an object to disk, it writes out the class identifier first and then its instance variables. When it reconstructs the object from disk, it reads the class identifier first.
                                                                                                                                                                     Once the class identifier is read, the framework calls Create, passing the identifier as the parameter. Create looks up the constructor for the corre- sponding class and uses it to instantiate the object. Last, Create calls the object's Read operation, which reads the remaining information on the disk and initializes the object's instance variables.
                                                                                                                                                                     A parameterized factory method has the following general form, where MyProduct and Y ourProduct are subclasses of Product:
                                                                                                                                                                     
                                                                                                                                                                   Overriding a parameterized factory method lets you easily and selectively extend or change the products that a Creator produces. Youcan introduce new identifiers for new kinds of products, or you can associate existing identifiers with different products.
                                                                                                                                                                   For example, a subclass MyCreator could swap MyProduct and YourProd- uct and support a new TheirProduct subclass
                                                                                                                                                                   Notice that the last thing this operation does is call Create on the parent class. That's because MyCreator : :Create handles only YOURS, MINE, and
                                                                                                                                                                   
                                                                                                                                                                   THEIRS differently than the parent class. It isn't interested in other classes. Hence MyCreator extends the kinds of products created, and it defers re- sponsibility for creating all but a few products to its parent.
                                                                                                                                                                   3. Language-specific variants and issues. Different languages lend themselves to other interesting variations and caveats.
                                                                                                                                                                   Smalltalk programs often use a method that returns the class of the object to be instantiated. A Creator factory method can use this value to create a product, and a ConcreteCreator may store or even compute this value. The result is an even later binding for the type of ConcreteProduct to be instantiated.
                                                                                                                                                                   A Smalltalkversion of the Document examplecan define a documentClass method on Application. The documentClass method returns the proper Document class for instantiating documents. The implementation of documentClass inMyApplicationreturnstheMyDocumentclass.Thus in class A pplication we have
                                                                                                                                                                   
                                                                                                                                                                   which returns the class MyDocument to be instantiated to Application.
                                                                                                                                                                   An even more flexible approach akin to parameterized factory methods is to store the class to be created as a class variable of Application. That way you don't have to subclass Application to vary the product.
                                                                                                                                                                   Factory methods in C++ are always virtual functions and are often pure vir- tual. Just be careful not to call factory methods in the Creator's constructor— the factory method in the ConcreteCreatorwon't be available yet.
                                                                                                                                                                   You can avoid this by being careful to access products solely through acces- sor operations that create the product on demand. Instead of creating the concrete product in the constructor, the constructor merely initializes it to 0. The accessor returns the product. But first it checks to make sure the product exists, and if it doesn't, the accessor creates it. This technique is sometimes called lazy initialization. The following code shows a typical implementa- tion:
                                                                                                                                                                   
                                                                                                                                                                   Using templates to avoid subclassing. As we've mentioned, another potential problem with factory methods is that they might force you to subclass just to create the appropriate Product objects. Another way to get around this in C++ is to provide a template subclass of Creator that's parameterized by the Product class:
With this template, the client supplies just the product class—no subclassing of Creator is required.

5. Naming conventions.It's good practice to use naming conventions that make it clear you're using factory methods. For example, the MacApp Macintosh application framework [App89] always declares the abstract operation that defines the factory method as Class* DoMakeClass ( ) , where Class is the Product class.
