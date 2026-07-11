# Day 5 - Spring Core Basics

## Key Concepts

### 1. Bean
An object that is created, managed, and configured by the Spring Container. 
Instead of manually creating objects with `new`, Spring handles their lifecycle.

### 2. ApplicationContext (Spring Container)
The core container in Spring that:
- Creates Bean objects
- Manages their lifecycle
- Injects dependencies where needed

### 3. Dependency Injection (DI)
A design pattern where objects receive their dependencies from an external 
source (Spring Container) rather than creating them internally.

**Without Spring (manual):**
```java
Coffee coffee = new Coffee();
```

**With Spring (DI):**
```java
@Autowired
private Coffee coffee;
```

### 4. Common Annotations
- `@Component` - Marks a class as a Spring-managed Bean
- `@Autowired` - Tells Spring to inject a dependency automatically
- `@Configuration` - Marks a class as a source of Bean definitions
- `@Bean` - Used inside a @Configuration class to manually define a Bean

## Why It Matters
- **Loose coupling**: Classes don't need to know how to create their dependencies
- **Easier testing**: Dependencies can be mocked/swapped easily
- **Better maintainability**: Changes in one class don't ripple through the whole app

## Analogy
Manual object creation = making your own coffee (grinding beans, brewing, etc.)
Spring DI = ordering coffee from a waiter — you just ask, Spring handles the rest.