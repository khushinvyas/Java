import java.util.Scanner;

// Custom exception class to handle the case when input string doesn't match expected value
class NOMATCHEXCP extends Exception {
    private String inputString;

    // Parameterized constructor to initialize the exception with the input string causing the exception
    NOMATCHEXCP(String inputString) {
        this.inputString = inputString;
    }

    // Overridden toString() method to provide a meaningful representation of the exception
    @Override
    public String toString() {
        return "NOMATCHEXCP: Input string does not match expected value - " + inputString;
    }
}
public class ExceptionDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");

        try {
            String input = scanner.nextLine();
            if (!input.equals("India")) {
                throw new NOMATCHEXCP(input);
            }
            System.out.println("Input matches expected value.");
        } catch (NOMATCHEXCP e) {
            System.out.println(e);
            e.printStackTrace(); // print stack trace to show line number
        }
    }
}
