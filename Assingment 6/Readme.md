Java Stack Program Readme

This Java program is designed to demonstrate the implementation of two types of stacks: fixed-size stack and growable stack. It provides a menu-driven interface for performing various stack operations such as pushing data onto the stack, popping data from the stack, and displaying the contents of the stack.

Features:

Fixed-Size Stack: This stack has a predefined size and cannot exceed its capacity. It uses an array-based implementation to store elements.
Growable Stack: Unlike the fixed-size stack, the growable stack can dynamically resize itself when needed. It starts with a specified initial size and expands automatically as more elements are added.
Program Components:

IntStack Interface: This interface defines the basic operations that any stack implementation must support, including push, pop, and isEmpty.
FixedStack Class: Implements the IntStack interface to create a fixed-size stack. It utilizes an array to store elements and handles stack overflow and underflow conditions.
GrowableStack Class: Also implements the IntStack interface but provides a growable stack implementation. It dynamically resizes the underlying array when necessary to accommodate more elements.
Main Class: Contains the main method to execute the program. It provides a menu-driven interface for users to interact with both types of stacks, allowing them to add data, display stack contents, and perform other operations.
Usage:

Run the Main class.
Follow the on-screen menu prompts to choose the desired stack operation.
For adding data to the stack, select the stack type (fixed or growable) and input the data.
To display the stack contents, choose the appropriate option from the menu.
Notes:

The program handles stack overflow and underflow conditions gracefully, displaying appropriate error messages.
Users can choose between fixed-size and growable stacks based on their requirements.
The code is modular and easy to extend, allowing for additional stack implementations or enhancements in the future.
