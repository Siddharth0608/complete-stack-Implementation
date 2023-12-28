
Stack Implementation Repository
This GitHub repository provides a comprehensive implementation of a stack data structure using three different approaches: fixed-size array, dynamic-size array, and linked list. The implementation incorporates an interface to ensure consistency across all three classes.

Key Components:
Interstack Class:

An interface class that defines common methods for the stack, including push and pop. This ensures a uniform interface for all implementations.
Node Class:

A class defining the node structure for the linked list implementation. Instances of this class are used to create linked list nodes.
StackArrFix Class:

Implements a stack using a fixed-size array. The class adheres to the interface specified in the Interstack class, providing basic stack operations.
StackArrDynamic Class:

Implements a stack using a dynamically sized array. This class allows for more flexibility in managing the stack size during runtime while maintaining the defined interface.
StackLinked Class:

Implements a stack using a linked list structure. The Node class is utilized to create nodes within the linked list, offering a dynamic structure for the stack.
Main Class:

Contains the main program to test and run functionality for all three stack implementations. This class serves as a comprehensive test suite to ensure the correctness and efficiency of each implementation.