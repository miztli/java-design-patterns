# Factory method (AKA: Virtual constructor)

Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses, in other words, it encapsulates the knowledge of which subclass to create and moves this knowledge out of the framework. [Show diagram](factory_method.png) 

See also ([Abstract factory](./../object/abstract_factory/README.md))

### Classification

Purpose: Creational

Scope: Class

### Aplicability

Use this pattern when:

- A class can't anticipate the class of objects it must create.
- A class wants its subclasses to specify the objects it creates.
- Classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate

### Structure

[See structure diagram](structure.png)

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

Parallel class hierarchies result when a class delegates some of its responsibilities to a separate class. [See class hierarchies diagram](parallel_class_hierarchies.png)

### Implementation

Consider the following issues when applying the Factory Method pattern:

1. Two major varieties. 

The two main variations of the Factory Method pattern are (1) the case when the Creator class is an abstract class and does not provide an implementation for the factory method it declares, and (2) the case when the Creator is a concrete class and provides a default implementation for the factory method. It's also possible to have an abstract class that defines a default implementation, but this is less common.

The first case requires subclasses to define an implementation,because there's no reasonable default. It gets around the dilemma of having to instantiate unforeseeable classes. In the second case, the concrete Creator uses the factory method primarily for flexibility. It's following a rule that says, "Create objects in a separate operation so that subclasses can override the way they're created." This rule ensures that designers of subclasses can change the class of objects their parent class instantiates if necessary.

2. Parameterized factory methods. Another variation on the pattern lets the factory method create multiple kinds of products. The factory method takes a parameter that identifies the kind of object to create. All objects the factory method creates will share the Product interface. In the Document example, Application might support different kinds of Documents. You pass Create- Document an extra parameter to specify the kind of document to create.

    Using templates to avoid subclassing. As we've mentioned, another potential problem with factory methods is that they might force you to subclass just to create the appropriate Product objects. Another way to get around this in C++ is to provide a template subclass of Creator that's parameterized by the Product class:
With this template, the client supplies just the product class—no subclassing of Creator is required.
