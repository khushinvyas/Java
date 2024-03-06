# Shapes Interface and Concrete Classes

This Java project implements a Shapes interface and concrete classes Circle, Triangle, and Rectangle to calculate their areas and perimeters.

## Description

### Shapes Interface

The Shapes interface defines methods for calculating the area and perimeter of geometric shapes. It includes the following methods:
- calculateArea(): Calculates the area of the shape.
- calculatePerimeter(): Calculates the perimeter of the shape.

### Concrete Classes

1. *Circle*: Represents a circle with a given radius. It implements the Shapes interface and provides methods to calculate its area and perimeter based on the radius.
2. *Triangle*: Represents a triangle with given side lengths. It implements the Shapes interface and provides methods to calculate its area and perimeter based on the side lengths using Heron's formula.
3. *Rectangle*: Represents a rectangle with given length and width. It implements the Shapes interface and provides methods to calculate its area and perimeter based on the length and width.

## Usage

1. *Compile and Run*: Compile the Java files and run the Main class to test the implementations of shapes and their calculations.

2. *Testing Shapes*:
   - Create instances of Circle, Triangle, and Rectangle classes with appropriate parameters (e.g., radius for circle, side lengths for triangle, length and width for rectangle).
   - Use the calculateArea() and calculatePerimeter() methods to obtain the area and perimeter of each shape.

## Example

java
Circle circle = new Circle(5);
System.out.println("Circle Area: " + circle.calculateArea());
System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

Triangle triangle = new Triangle(3, 4, 5);
System.out.println("Triangle Area: " + triangle.calculateArea());
System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());

Rectangle rectangle = new Rectangle(4, 6);
System.out.println("Rectangle Area: " + rectangle.calculateArea());
System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- This project serves as a simple demonstration of using interfaces and concrete classes for geometric calculations.
- Inspired by real-world scenarios where shape calculations are required in software development.

#Employee Management System

This Java project implements an Employee Management System with salary calculations based on provided pay slip details. It includes abstract and derived classes to represent different types of employees and their salaries.

### Employee Class Hierarchy

The project defines an abstract Employee class which serves as the base class for all types of employees. It contains common attributes such as name, employee ID, designation, department, date of joining, gross wage, total working days, paid days, and loss of pay (LOP) days. Derived classes NormalEmployee and BonusEmployee extend the Employee class, allowing for different salary calculation methods.

### Salary Calculations

The NormalEmployee and BonusEmployee classes implement the calculateSalary() method to calculate the net salary for employees based on the provided pay slip details. These calculations include earnings such as basic wage, HRA (House Rent Allowance), conveyance allowances, medical allowances, and other allowances, as well as deductions such as EPF (Employee Provident Fund), ESI (Employee State Insurance), professional tax, and loan recovery.

### Customization

The code provides flexibility for customization:
- Modify the provided sample code in Main.java to create new instances of employees with different pay slip details.
- Customize salary calculation formulas in the calculateSalary() method of the NormalEmployee and BonusEmployee classes to fit specific requirements.

## Salary Slip Description

The project uses a sample salary slip format for June 2021, containing the following details:
- *Employee Information*: Name, UAN (Universal Account Number), Employee ID, PF (Provident Fund) Number, Designation, ESI (Employee State Insurance) Number, Department, Bank Name, Bank Account Number, Date of Joining.
- *Pay Details*: Gross Wage, Total Working Days, Paid Days, Loss of Pay (LOP) Days.
- *Earnings*: Basic Wage, HRA, Conveyance Allowances, Medical Allowances, Other Allowances.
- *Deductions*: EPF, ESI / Health Insurance, Professional Tax, Loan Recovery.
- *Net Salary*: Total Earnings, Total Deductions, Net Salary.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your system
- Any Java IDE (such as IntelliJ IDEA, Eclipse, or NetBeans) or a text editor for editing and running Java code

### Usage

1. Clone or download the repository to your local machine.
2. Open the project in your preferred Java IDE or text editor.
3. Run the Main class to execute the provided sample code.
4. View the console output to see the calculated salaries for normal and bonus employees.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- This project was created as a sample implementation of an Employee Management System for educational purposes.
- Inspired by real-world payroll systems and pay slip formats.

---

Feel free to further customize this README with additional details or sections as needed for your project.
