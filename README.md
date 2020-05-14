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
When you spring creates an instance of myVehicles class is will look for the bean defined as a car.

**Bean definitions in AppContext.xml**
```
<bean id="car" class="foo.Car" />

<bean id="myVehiclesAutowired" class="foo.MyVehicles" autowire="byType" />

class MyVehicles {
  private Car car;
}
```

**how to use autowire btType in your class.**
```
MyVehicles myVehciles = appContext.getBean("myVehcilesAutowired", MyVehicles.class);
```


### Autowire byName
Spring will look to match the bean id with the variable name being used in MyVehicles class.

**Bean definitions in AppContext.xml**
```
<bean id="ferrari" class="foo.Car" />

<bean id="myVehiclesByName" class="foo.MyVehicles" autowire="byName" />

class MyVehicles {
  private Car ferrari;
}
```

**how to use autowire btType in your class.**
```
MyVehicles myVehciles = appContext.getBean("myVehcilesByName", MyVehicles.class);
```
 
 
### Autowire by Constructor

**Bean definitions in AppContext.xml**
```
<bean id="ferrari" class="foo.Car" />
<bean id="autowiredByConstructor" class="foo.MyVehicles" autowire="constructor" />


class MyVehicles {
  private Car daily;
  
  public MyVehicles() { }
  
  public MyVehciles(Car c) {
    this.daily = c;
  }
}
```

**how to use autowire by constructor in your class.**
```
MyVehicles myVehciles = appContext.getBean("autowiredByConstructor", MyVehicles.class);
``` 


### Default Autowiring 

**Bean definitions in AppContext.xml***
In the bean xmlns definition you can tell Spring which autowire should be used if no wiring is 
specified. In this example spring will use autowire byType to configure our bean 

```
<beans xmlns ....
   default-autowire="byType" >

<bean id="daily" class="foo.Car" />
<bean id="autowired" class="foo.MyVehicles" />


class MyVehicles {
  private Car daily;
  
  public MyVehicles() { }
  
}
```

**how to use autowire by constructor in your class.**
```
MyVehicles myVehciles = appContext.getBean("autowired", MyVehicles.class);
``` 