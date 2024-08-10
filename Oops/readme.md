> Objects: entities in the real world

> Classes: represents a group of objects having similar properties and behavior. 
> For example, the animal type Dog is a class while a particular dog named Tommy is an object of the Dog class.

> private - within class, rest no.
> Default - within class, within package.
> Protected - within class, within package, outside package by subclass only.
> public - within class, within package, outside package by subclass only, outside package

> Encapsulation: it is defined as the wrapping of data & methods under a single unit. it also implements data hiding.

> constructor is a special method which is invoked automatically at the time of object creation.
can have same name as class or structure, dont have return type not even void, they are only called once at object creation. Memory allocation occurs when constructors is called.

> types of constructor : non-parameterized ,parameterized , copy constructor.

> constructor overloading occurs when multiple constructors are defined in a class.

>copy constructors or shallow: are defined when properties of a object are transferred to another object. In this we refer to the reference of the data stored.Any changes in the old array will refelct in the new array.

>deep copy:  we make a different new array to store data. so that any changes in the old array won't refelct in the new array.

>Destructors: In java the garbage collector automatically does the work.

>Inheritance: when properties and methods of base class are passed on to a derived class.
>Types: 
       1. single level inheritance (base to derived  class)
       2. Multi level inheritance (base to derived class to derived class)
       3. Hierarchical inheritance (multiple derived class of single class) 
       4. Hybrid inheritance (it is combination of different inheritance)

>Polymorphism: it means many forms. when we try to achieve a similar thing in many forms.
types:  
      1. compile time polymorphism (Method Overloading) i.e. Multiple function with the same name but different parameters.
      2. Run time Polymorphism (Method overriding) i.e.
      parent and child classes both contain the same function with same parameters with a differnet defination.