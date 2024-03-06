// Abstract Employee class
abstract class Employee {
    protected String name;
    protected int employeeId;
    protected String designation;
    protected String department;
    protected String dateOfJoining;
    protected double grossWage;
    protected int totalWorkingDays;
    protected int paidDays;
    protected int lopDays;

    // Constructor
    public Employee(String name, int employeeId, String designation, String department, String dateOfJoining,
                    double grossWage, int totalWorkingDays, int paidDays, int lopDays) {
        this.name = name;
        this.employeeId = employeeId;
        this.designation = designation;
        this.department = department;
        this.dateOfJoining = dateOfJoining;
        this.grossWage = grossWage;
        this.totalWorkingDays = totalWorkingDays;
        this.paidDays = paidDays;
        this.lopDays = lopDays;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();
}

// NormalEmployee class
class NormalEmployee extends Employee {
    // Constants for deductions
    private static final double EPF_RATE = 0.065; // 6.5%
    private static final double ESI_RATE = 0.0075; // 0.75%

    // Constructor
    public NormalEmployee(String name, int employeeId, String designation, String department, String dateOfJoining,
                          double grossWage, int totalWorkingDays, int paidDays, int lopDays) {
        super(name, employeeId, designation, department, dateOfJoining, grossWage, totalWorkingDays, paidDays, lopDays);
    }

    // Override method to calculate salary
    @Override
    public double calculateSalary() {
        // Calculate total days worked
        int totalDaysWorked = paidDays + lopDays;

        // Calculate basic wage (considered as 50% of gross wage)
        double basicWage = grossWage * 0.5;

        // Calculate EPF deduction
        double epfDeduction = basicWage * EPF_RATE;

        // Calculate ESI deduction
        double esiDeduction = grossWage * ESI_RATE;

        // Calculate total deductions
        double totalDeductions = epfDeduction + esiDeduction;

        // Calculate net salary
        double netSalary = grossWage - totalDeductions;

        return netSalary;
    }
}

// BonusEmployee class
class BonusEmployee extends Employee {
    // Constants for deductions and bonus percentage
    private static final double EPF_RATE = 0.065; // 6.5%
    private static final double ESI_RATE = 0.0075; // 0.75%
    private double bonusPercentage;

    // Constructor
    public BonusEmployee(String name, int employeeId, String designation, String department, String dateOfJoining,
                         double grossWage, int totalWorkingDays, int paidDays, int lopDays, double bonusPercentage) {
        super(name, employeeId, designation, department, dateOfJoining, grossWage, totalWorkingDays, paidDays, lopDays);
        this.bonusPercentage = bonusPercentage;
    }

    // Override method to calculate salary
    @Override
    public double calculateSalary() {
        // Calculate total days worked
        int totalDaysWorked = paidDays + lopDays;

        // Calculate basic wage (considered as 50% of gross wage)
        double basicWage = grossWage * 0.5;

        // Calculate bonus amount
        double bonusAmount = basicWage * (bonusPercentage / 100);

        // Calculate EPF deduction
        double epfDeduction = basicWage * EPF_RATE;

        // Calculate ESI deduction
        double esiDeduction = grossWage * ESI_RATE;

        // Calculate total deductions
        double totalDeductions = epfDeduction + esiDeduction;

        // Calculate net salary
        double netSalary = (grossWage + bonusAmount) - totalDeductions;

        return netSalary;
    }
}

// Testing the employees
public class Main {
    public static void main(String[] args) {
        // Assuming data from the pay slip
        NormalEmployee normalEmployee = new NormalEmployee("John", 101, "Engineer", "IT", "01-Jun-2021",
                21000, 30, 29, 1);

        BonusEmployee bonusEmployee = new BonusEmployee("Alice", 102, "Manager", "HR", "01-Jun-2021",
                25000, 30, 29, 1, 10); // 10% bonus

        // Print salaries
        System.out.println("Normal Employee Salary: ₹" + normalEmployee.calculateSalary());
        System.out.println("Bonus Employee Salary: ₹" + bonusEmployee.calculateSalary());
    }
}
