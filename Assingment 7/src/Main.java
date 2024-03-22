import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException, ArrayIndexOutOfBoundsException, IllegalArgumentException, ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first rational number (in the format 'a/b'): ");
            String[] input1 = scanner.nextLine().split("/");
            if (input1.length != 2) {
                throw new IllegalArgumentException("Invalid input format.");
            }
            int numerator1 = Integer.parseInt(input1[0]);
            int denominator1 = Integer.parseInt(input1[1]);
            RationalNumber rational1 = new RationalNumber(numerator1, denominator1);

            System.out.println("Enter the second rational number (in the format 'a/b'): ");
            String[] input2 = scanner.nextLine().split("/");
            if (input2.length != 2) {
                throw new IllegalArgumentException("Invalid input format.");
            }
            int numerator2 = Integer.parseInt(input2[0]);
            int denominator2 = Integer.parseInt(input2[1]);
            RationalNumber rational2 = new RationalNumber(numerator2, denominator2);

            System.out.println("Addition: " + rational1.add(rational2));
            System.out.println("Subtraction: " + rational1.subtract(rational2));
            System.out.println("Multiplication: " + rational1.multiply(rational2));
            System.out.println("Division: " + rational1.divide(rational2));
            // System.out.println("Comparison: " + rational1.compareTo(rational2)); // Implement this method in RationalNumber class
            System.out.println("Floating Point Value of First Number: " + rational1.toFloatingPoint());
            System.out.println("Floating Point Value of Second Number: " + rational2.toFloatingPoint());
            System.out.println("Absolute Value of First Number: " + rational1.abs());
            System.out.println("Absolute Value of Second Number: " + rational2.abs());
        }
        catch (NumberFormatException e) {
            System.err.println("NumberFormatException: " + e.getMessage());
            // handle NumberFormatException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            // handle ArrayIndexOutOfBoundsException
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
            // handle IllegalArgumentException
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
            // handle ArithmeticException
        }finally {
            scanner.close();
        }
    }
}