# ideLib
ideLib is a small library to make coding an IDE in java easier.

# Using ideLib
to create a class, a package is required, if you do not have a valid package this will not create the class, it will instead return an
error.
```java
//creates a package
IDEPackage.createPackage(String name);
```

```java
//creates a class and adds it to a package.
IDEClass.createClass(String name, IDEPackage pack, ClassType);
```

### Accessing Packages and Classes
```java
//returns the class's name.
IDEClass.getName();
```

```java
//returns the package's name.
IDEPackage.getName();
```
