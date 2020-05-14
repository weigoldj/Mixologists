## Mixologists
Java Example using Spring Context


## Overview
This shows a few examples of how to setup and use spring context.  This project is build using gradle.

## Spring 

## Spring Autowire
Attempts to automatically figure how beans are connected.  Reduces the need for manual configuratinos

Types of Auto-wiring
* byType - works well for one bean of a one type.
* byName 
* constructor
* no  - says do not autowire 
* default - 

Any Explicit configuration overrides any auto-wiring


### Autowire byType 

**Bean definitions in AppContext.xml**
<bean id="car" class="foo.Car" />

<bean id="myVehiclesAutowired" class="foo.MyVehicles" autowire="byType" />

class MyVehicles {
  private Car car;
}

When you spring creates an instance of myVehicles class is will look for the bean defined as a car.

**how to use autowire btType in your class.**
MyVehicles myVehciles = appContext.getBean("myVehcilesAutowired", MyVehicles.class);


### Autowire byName

>**Bean definitions in AppContext.xml**
><bean id="ferrari" class="foo.Car" />

><bean id="myVehiclesByName" class="foo.MyVehicles" autowire="byName" />

>class MyVehicles {
>  private Car ferrari;
>}

Spring will look to match the bean id with the variable name being used in MyVehicles class.

>**how to use autowire btType in your class.**
>MyVehicles myVehciles = appContext.getBean("myVehcilesByName", MyVehicles.class);

 