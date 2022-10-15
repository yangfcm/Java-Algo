# Algorithms Problems and Solutions

## Intro

Algorithms, Data Structure problems and solutions written in Java, including test cases.

## Algorithms problems content

- All problems and solutions are in directory: `src/main/java/algo/*`
- All test cases are in directory: `src/test/java/algo/*`

## Content

### Algorithm

- [Array](./src/main/java/algo/array)
- [Assorted](./src/main/java/algo/assorted)
- [Dynamic](./src/main/java/algo/dynamic)
- [Greedy](./src/main/java/algo/greedy)
- [Math](./src/main/java/algo/mathematics)
- [String](./src/main/java/algo/string)

### Data structure - `/ds`

- [Stack and Queue](./src/main/java/algo/ds/stack_queue)
- [Linked List](./src/main/java/algo/ds/linkedlist)
- [Hash Table](./src/main/java/algo/ds/hash)
- [Tree](./src/main/java/algo/ds/tree)
- [Graph](./src/main/java/algo/ds/graph)

### Sorting - `/sorting`

- [Sorting](./src/main/java/algo/sorting)

### Searching - `/searching`

- [Searching](./src/main/java/algo/searching)

## Development Environment

- [Java 11](https://www.oracle.com/java/technologies/downloads/#java11)
- [Gradle](https://docs.gradle.org/current/userguide/installation.html)
- [Junit5](https://junit.org/junit5/docs/current/user-guide/#overview)

## How to run

Under project directory:

1. Run all tests

```
./gradlew test
```

2. Run all tests under a particular directory

```
./gradlew test --tests 'algo.array.*'
```

3. Run one or multiple tests with wildcard

```
./gradlew test --tests '*IsSorted*'
```
