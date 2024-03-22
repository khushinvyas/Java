# RationalNumber Class

The `RationalNumber` class represents rational numbers and provides methods for arithmetic operations and conversions. Below are the key features of the class:

- **Fields**: 
  - `numerator`: Represents the numerator of the rational number.
  - `denominator`: Represents the denominator of the rational number.

- **Constructor**: 
  - `RationalNumber(int numerator, int denominator)`: Initializes a rational number with the given numerator and denominator. It also checks if the denominator is zero and throws an `IllegalArgumentException` if it is.

- **Methods**:
  - `add(RationalNumber other)`: Adds another rational number to this rational number and returns the result.
  - `subtract(RationalNumber other)`: Subtracts another rational number from this rational number and returns the result.
  - `multiply(RationalNumber other)`: Multiplies this rational number by another rational number and returns the result.
  - `divide(RationalNumber other)`: Divides this rational number by another rational number and returns the result. It also checks if the other rational number is zero and throws an `ArithmeticException` if it is.
  - `toFloatingPoint()`: Converts the rational number to a floating-point representation.
  - `abs()`: Returns the absolute value of the rational number.
  - `toString()`: Returns a string representation of the rational number.

- **Private Methods**:
  - `simplify()`: Simplifies the rational number by dividing the numerator and denominator by their greatest common divisor (gcd).
  - `gcd(int a, int b)`: Finds the greatest common divisor of two integers using the Euclidean algorithm.

## Main Class

The `Main` class contains the `main()` method to demonstrate the functionalities of the `RationalNumber` class. It prompts the user to enter two rational numbers in the format 'a/b', performs various operations on them, and displays the results. It also catches and handles different exceptions that may occur during user input or arithmetic operations:

- `NumberFormatException`: Handles input format errors when parsing integers from the user input.
- `ArrayIndexOutOfBoundsException`: Handles errors when splitting the input string into numerator and denominator parts.
- `IllegalArgumentException`: Handles errors related to invalid input format or denominator being zero.
- `ArithmeticException`: Handles errors when dividing by zero.

The program ensures proper resource management by closing the scanner in a `finally` block.
# ExceptionDemo Class

The `ExceptionDemo` class is a Java program that calculates the factorial of a number and demonstrates exception handling using a custom exception class called `FactorialException`. Below is a breakdown of the class:

## Custom Exception Class (`FactorialException`):

- The `FactorialException` class extends `Exception` and is used to handle factorial exceptions.
- It contains a private field `number` to store the input number causing the exception.
- The constructor initializes the exception with the input number causing the exception.
- The `toString()` method is overridden to provide a meaningful representation of the exception.

## Main Method:

- The `main()` method is the entry point of the program.
- It takes command line arguments representing integers.
- It iterates through the command line arguments, converts each argument to an integer, and calculates the factorial.
- If the input is not a valid integer or if the factorial exceeds the specified range (0 to 15), it throws a `NumberFormatException` or a `FactorialException` respectively.
- Exceptions are caught in separate `catch` blocks, and appropriate error messages are displayed.

## Usage:

To run the program, compile the `ExceptionDemo.java` file and execute the generated class file. Provide integer values as command line arguments.

## Example:

```java
java ExceptionDemo 5 10 20
```

## ExceptionDemo2 Class

The `ExceptionDemo2` class is a Java program that demonstrates the usage of a custom exception called `NOMATCHEXCP`. This program prompts the user to enter a string and throws a `NOMATCHEXCP` exception if the entered string does not match the expected value "India". Below is a breakdown of the class:

- **Imports**: 
  - There is one import statement: `import java.util.Scanner;`. This import is used to import the `Scanner` class, which is used to take user input from the console.

- **Custom Exception Class**:
  - The class `NOMATCHEXCP` is a custom exception class that extends `Exception`. It is used to handle the case when the input string doesn't match the expected value. It contains:
    - A private field `inputString` to store the input causing the exception.
    - A parameterized constructor to initialize the exception with the input string.
    - An overridden `toString()` method to provide a meaningful representation of the exception.

- **Main Method**:
  - The `main()` method is the entry point of the program. It prompts the user to enter a string and checks if the entered string is equal to "India".
  - If the entered string is not equal to "India", it throws a `NOMATCHEXCP` exception with the input string.
  - The exception is caught in a `catch` block, and the exception message is printed along with the stack trace to show the line number where the exception occurred.

- **Resource Management**:
  - The `Scanner` object is closed after its use to prevent resource leaks.

This program demonstrates how to define and use a custom exception class (`NOMATCHEXCP`) to handle specific cases of input validation. It provides a simple example of exception handling in Java.
