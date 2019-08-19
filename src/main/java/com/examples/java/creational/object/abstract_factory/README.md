# Abstract Factory (AKA: Kit)

Provide an interface for creating families of related or dependent objects without specifying their concrete classes. [Show diagram](./abstract_factory.png)

---

### Classification

Purpose: Creational

Scope: Object

### Aplicability

Use this pattern when:

- A system should be independent of how its objects are created, composed, and represented.
- A system should be configured with one of multiple families of objects.
- A family of related objects is designed to be used together, and you need to enforce this constraint.
- You want to provide a class library of objects, and you want to reveal just their interfaces, not their implementations.

### Participants

- __AbstractFactory__

Declares an interface for operations that create abstract objects.

- __ConcreteFactory__

Implements the operations to create concrete objects.

- __AbstractObject__

Declares an interface for a type of object.

- __ConcreteObject__

Defines an object to be created by the corresponding concrete factory.
Implements the AbstractObject interface.

- __Client__

Uses only interfaces declared by AbstractFactory and AbstractObject classes.

### Collaborations

- Normally a single instance of a ConcreteFactory class is created at run-time. This concrete factory creates objects having a particular implementation. To create different objects, clients should use a different concrete factory.
- AbstractFactory defers creation of objects to its ConcreteFactory sub class.

### Consequences

The Abstract Factory pattern has the following benefits and liabilities:

1. It isolates concrete classes. 

The Abstract Factory pattern helps you control the classes of objects that an application creates. Because a factory encapsulates the responsibility and the process of creating objects, it isolates clients from implementation classes. Clients manipulate instances through their abstract interfaces. Object class names are isolated in the implementation of the concrete factory; they do not appear in client code.

2. It makes exchanging object families easy. 

The class of a concrete factory appears only once in an application, that is, where it's instantiated. This makes it easy to change the concrete factory an application uses. It can use different object configurations simply by changing the concrete factory. Because an abstract factory creates a complete family of objects, the whole object family changes at once.

### Implementation

1. Factories as singletons. 

An application typically needs only one instance of a ConcreteFactory per objects family. So it's usually best implemented as a Singleton.

2. Creating the objects. 

AbstractFactory only declares an interface for creating objects. It's up to ConcreteObject subclass to actually create them. The most common way to do this is to define a factory method for each object. A concrete factory will specify its objects by overriding the factory method for each. While this implementation is simple, it requires a new concrete factory subclass for each object family, even if the object families differ only slightly.
If many object families are possible, the concrete factory can be implemented using the Prototype pattern. The concrete factory is initialized with a prototypical instance of each object in the family, and it creates a new object by cloning its prototype. The Prototype-based approach eliminates the need for a new concrete factory class for each new object family.

3. Defining extensible factories. 

AbstractFactory usually defines a different operation for each kind of object it can produce. The kinds of objects are encoded in the operation signatures. Adding a new kind of object requires changing the AbstractFactory interface and all the classes that depend on it.
A more flexible but less safe design is to add a parameter to operations that create objects. This parameter specifies the kind of object to be created. It could be a class identifier, an integer, a string, or anything else that identifies the kind of object. In fact with this approach, AbstractFactory only needs a single "Make" operation with a parameter indicating the kind of object to create. This is the technique used in the Prototype and the class-based abstract factories discussed earlier.
