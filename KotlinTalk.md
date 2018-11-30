
## Concise Code

Aren't you tired of writing 

- nullability checks 
- POJOs
- ifs and loops for basic collection operations
- cascading if-statements


### Switch statements

```kotlin
val yResult = when {
  isNegative(y) -> "is negative"
  isZero(y)     -> "is zero"
  isOdd(y)      -> "is odd"
  else          -> "otherwise"
}
```
  
    
## Concurrency
- built in concurrency
- concurrency is first class citizen (since 1.3.0)


- converting objects between layers is not a big deal anymore
- avoid writing "half-used" data objects 

### Functional style
- encourages functional style

```lisp
(defun ringarea (r1 r2)
  (flet ((sq (x)
           (* x x)))
    (* pi
       (- (sq r1)
          (sq r2)))))
```

- shorter / more concise method due to functional style
- avoid nestings
- collection functions (map, reduce, flatMap, etc.)
 
    - no need to convert to stream, work on every collection
    - use `sequence()` where needed
    - use `inline` keyword to 

```
someList
  .stream()
  .map() // some operations
  .collect(Collectors.toList());
```

The equivalent in Kotlin is very simply:

```
someList
  .map() // some operations
``` 


### Handy collection functions

- map
- groupBy
- partition


# Java interop and migration
- of greatest interest to people who work with Java today
- It's Completely Interoperable With Java (unlike Scala which needs explicit conversions)
- use the whole JVM and Java libraries
- integration is almost seamless (better than in Scala)


## Pitfalls
- kotlin functions/methods are `final` by default, so cannot be overridden in subclasses. You have to mark them `open` explicitly.
- causes weird issues with Hibernate and Spring
- all-open gradle plugin is your friend

- Kotlin compiles to JVM bytecode or JavaScript or even native


### Tooling

- there is a Java 2 Kotlin button in IntelliJ
- follow the IDEA _intentions_ and apply the suggested fixes to improve your code


### Hint

- don't just use the convert button a continue writing Java imperative style
- adopt the functional approaches
- if you write loops or `var`s instead of `val`s you should change it
- check if you can 

### Who's using it

- We don't have Java backends anymore in the Berlin offices


https://fabiomsr.github.io/from-java-to-kotlin/



# Other topics
- go
- unity
- closure
- hacking sandbox
- versioning
- design thinking
- workshop for presentation
