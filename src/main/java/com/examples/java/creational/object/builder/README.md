# Builder

Separate the construction of a complex object from its representation so that the same construction process can create different representations. [Show diagram](./builder.png)

### Classification

Purpose: Creational

Scope: Object

## Aplicability

Use this pattern when:

- The algorithm for creating a complex object should be independent of the parts that make up the object and how they're assembled.
- The construction process must allow different representations for the object that's constructed.

### Participants

- __Builder__

Specifies an abstract interface for creating parts of an object.

- __ConcreteBuilder__

Constructs and assembles parts of the object by implementing the Builder interface.

Defines and keeps track of the representation it creates.

Provides an interface for retrieving the object.

- __Director__

Constructs an object using the Builder interface.

- __Object__

Represents the complex object under construction. ConcreteBuilder builds the object's internal representation and defines the process by which it's assembled.

Includes classes that define the constituent parts, including interfaces for assembling the parts into the final result.

### Collaborations

- The client creates the Director object and configures it with the desired Builder object.
- Director notifies the builder whenever a part of the object should be built.
- Builder handles requests from the director and adds parts to the object.
- The client retrieves the object from the builder.
- The following [interaction diagram](./interaction_diagram.png) illustrates how Builder and Director cooperate with a client.

### Consequences

1. It lets you vary a objects's internal representation. 

The Builder object provides the director with an abstract interface for constructing the object. The interface lets the builder hide the representation and internal structure of the object. It also hides how the object gets assembled. Because the object is constructed through an abstract interface, all you have to do to change the object's internal representation is define a new kind of builder.

2. It isolates code for construction and representation. 

The Builder pattern improves modularity by encapsulating the way a complex object is constructed and represented. Clients needn't know anything about the classes that define the object's internal structure; such classes don't appear in Builder's interface.

Each ConcreteBuilder contains all the code to create and assemble a particular kind of object. The code is written once; then different Directors can reuse it to build object variants from the same set of parts.

3. It gives you finer control over the construction process. 

Unlike creational patterns that construct objects in one shot, the Builder pattern constructs the object step by step under the director's control. Only when the object is finished does the director retrieve it from the builder. Hence the Builder interface reflects the process of constructing the object more than other creational patterns. This gives you finer control over the construction process and consequently the internal structure of the resulting object.

### Implementation

Typically there's an abstract Builder class that defines an operation for each component that a director may ask it to create. The operations do nothing by default. A ConcreteBuilder class overrides operations for components it's interested in creating. Here are other implementation issues to consider:

1. Assembly and construction interface. 

Builders construct their objects in step-by-step fashion. Therefore the Builder class interface must be general enough to allow the construction of objects for all kinds of concrete builders.

A key design issue concerns the model for the construction and assembly process. A model where the results of construction requests are simply appended to the object is usually sufficient.

2. Why no abstract class for objects? 

In the common case, the objects produced by the concrete builders differ so greatly in their representation that there is little to gain from giving different objects a common parent class. The client usually configures the director with the proper concrete builder, the client is in a position to know which concrete subclass of Builder is in use and can handle its objects accordingly.

3. Empty methods as default in Builder. 

In C++, the build methods are intentionally not declared pure virtual member functions. They're defined as empty methods instead, letting clients override only the operations they're interested in.
