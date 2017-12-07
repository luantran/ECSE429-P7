# ECSE429-P7

How to run test
---------------

1. Open Eclipse.
2. Right click `test` package and select `Coverage as...` and select `Run all tests in the selected project, package or source folder`


White-Box Testing
-----------------

You can find all the flow diagrams in the `flow_diagrams` directory

We used branch coverage instead decision/condition coverage because decision coverage implies that all constituents of every condition statement be false at least once and true at least once. This is much more time consuming than path coverage because there are many more tests to perform. 
An additional reason to not using decision overage is because most of the classes’ methods are private (especially TreeBidiMap). We have decided against testing private methods as it is common practice not to do so. We thus have to interface through the public methods in which those private methods are called. Doing so makes it much more difficult to affect the flow of a method. Some conditions may be nested within multiple other condition statements and thus it is impossible to actively change all of those condition constituents.

### Example Flow diagram:

![alt text](https://github.com/the-luantran/ECSE429-P7/blob/master/flow_diagrams/doPut.png "doPut() flow diagram")

### Method characteristics table

Conditions | Variables | Paths
|-------------|-------------|-----|
Cond1: node | node | A-B-D-N
Cond2: cmp | cmp | A-B-C-E-F-I-N
Cond3: node.getLeft(Key) | node.getLeft(Key) | A-B-C-E-G-K-N
Cond4: node.getRight(Key) | node.getRight(Key) | A-B-C-E-G-J
/ | / | A-B-C-E-H-M-N
/ | / | A-B-C-E-H-L

### Minimal test cases table


Path | Key, Value | node | cmp | getLeft(Key) | getRight(Key) | Cond1 @B | Cond2 @E | Cond3 @G | Cond4 @H
|-------------|-----|-------------| -----|-------------|-----|-------------|-----|-------------|-----|
A/B/D/N | <5,15> | null | \ | \ | \ | T | \ | \ | \
A/B/C/E/F/I/N | <5,10> | <5,10> | 0 | \ | \ | T | T->T | \ | \
A/B/C/E/G/K/N | <1,27> | <5,10> | -1 | null | \ | T | T->T | F->F | \
A/B/C/E/G/J | <1,15> | <5,10> | -1 | <3,27> | \ | T | T->T | T->T | \
A/B/C/E/H/M/N | <8,15> | <5,10> | 1 | \ | null | T | T->T | \ | F->F
A/B/C/E/H/L | <15,29> | <5,10> | 1 | \ | <7,12> | T | T->T | \ | T->T

Coverage results
----------------

Using Eclemma:

TreeBidiMap class: 81.8%
BagUtils class: 94%
ChainedClosure: 0% (To do)

