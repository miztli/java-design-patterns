# Visitor

The purpose of a Visitor pattern is to define a new operation without introducing the modifications to an existing object structure.

The only thing to to do is to add a function which accepts the visitor class to each element of the structure.

### Classification

Purpose: Behavioural

Scope: Object

### Aplicability

Use this pattern when:

- An object structure contains many classes of objects with differing interfaces, and you want to perform operations on these objects that depend on their concrete classes
- Many distinct and unrelated operations need to be performed on objects in an object structure, and you want to avoid "polluting" their classes with these operations. Visitor lets you keep related operations together by defining them in one class. When the object structure is shared by many applications, use Visitor to put operations in just those applications that need them
- The classes defining the object structure rarely change, but you often want to define new operations over the structure. Changing the object structure classes requires redefining the interface to all visitors, which is potentially costly. If the object structure classes change often, then it's probably better to define the operations in those classes

### Structure

[See structure diagram](tbd.png)

### Participants

- __Visitor__

    Declares a Visit operation for each class of ConcreteElement in the object structure. The operation's name and signature identifies the class that sends the Visit request to the visitor. That lets the visitor determine the concrete class of the element being visited. Then the visitor can access the element directly through its particular interface.

- __Concrete Visitor__
    
    Implements each operation declared by Visitor. Each operation implements a fragment of the algorithm defined for the corresponding class of object in the structure. Concrete Visitor provides the context for the algorithm and stores its local state. This state often accumulates results during the traversal of the structure.

- __Element__
    
    Defines an Accept operation that takes a visitor as an argument.
    
- __Concrete Element__
    
    Implements an Accept operation that takes a visitor as an argument.

- __Object  Structure__

    - Can enumerate its elements.
    - May provide a high-level interface to allow the visitor to visit its elements.
    - May either be a composite or a collection such as a list or a set.

### Collaborations

- A client that uses the Visitor pattern must create a Concrete Visitor object and then traverse the object structure, visiting each element with the visitor.
- When an element is visited, it calls the Visitor operation that corresponds to its class. The element supplies itself as an argument to this operation to let the visitor access its state, if necessary.

### Consequences

- Visitor makesa dding new operations easy.

    Visitors make it easy to add operations that depend on the components of complex objects. You can define a new operation over an object structure simply by adding a new visitor. In contrast, if you spread functionality over many classes, then you must change each class to define a new operation.

- A visitor gathers related operations and separates unrelated ones. 
    
    Related behavior isn't spread over the classes defining the object structure; it's localized in a visitor. Unrelated sets of behavior are partitioned in their own visitor subclasses. That simplifies both the classes defining the elements and the algorithms defined in the visitors. Any algorithm-specific data structures can be hidden in the visitor.

- Adding new Concrete Element classes is hard. The Visitor pattern makes it hard to add new subclasses of Element. Each new Concrete Element gives rise to a new abstract operation on Visitor and a corresponding implementation in every Concrete Visitor class. Sometimes a default implementation can be provided in Visitor that can be inherited by most of the ConcreteVisitors, but this is the exception rather than the rule.

    So the key consideration in applying the Visitor pattern is whether you are mostly likely to change the algorithm applied over an object structure or the classes of objects that make up the structure. The Visitor class hierarchy can be difficult to maintain when new ConcreteElement classes are added frequently. In such cases, it's probably easier just to define operations on the classes that make up the structure. If the Element class hierarchy is stable, but you are continually adding operations or changing algorithms, then the Visitor pattern will help you manage the changes.

- Visiting across class hierarchies. 

    An iterator can visit the objects in a structure as it traverses them by calling their operations. But an iterator can't work across object structures with different types of elements.

    This implies that all elements the iterator can visit have a common parent class Item.

    Visitor does not have this restriction. It can visit objects that don't have a common parent class. You can add any type of object to a Visitor interface.

- Accumulating state. 

    Visitors can accumulate state as they visit each element in the object structure. Without a visitor, this state would be passed as extra arguments to the operations that perform the traversal, or they might appear as global variables.

- Breaking encapsulation. 
    
    Visitor's approach assumes that the ConcreteElement interface is powerful enough to let visitors do their job. As a result, the pattern often forces you to provide public operations that access an element's internal state, which may compromise its encapsulation.
