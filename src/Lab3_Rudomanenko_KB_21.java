import java.util.Scanner;
public class Lab3_Rudomanenko_KB_21 { public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an integer value:");
    int intValue = scanner.nextInt();

    System.out.println("Enter a floating-point value:");
    double doubleValue = scanner.nextDouble();

    scanner.nextLine();

    System.out.println("Enter a string value:");
    String stringValue = scanner.nextLine();

    System.out.println("Enter a boolean value (true/false):");
    boolean booleanValue = scanner.nextBoolean();

    System.out.println("\n--- Formatted Output Results (10 Variants) ---");

    System.out.printf("1. Decimal integer: %d\n", intValue);
    System.out.printf("2. Hexadecimal integer (uppercase): %X\n", intValue);
    System.out.printf("3. Octal integer: %o\n", intValue);
    System.out.printf("4. Standard floating-point: %f\n", doubleValue);
    System.out.printf("5. Floating-point (2 decimal places): %.2f\n", doubleValue);
    System.out.printf("6. Scientific notation: %e\n", doubleValue);
    System.out.printf("7. Standard string: %s\n", stringValue);
    System.out.printf("8. String in width 20 field (right-aligned): [%20s]\n", stringValue);
    System.out.printf("9. String in width 20 field (left-aligned): [%-20s]\n", stringValue);
    System.out.printf("10. Boolean value: %b\n", booleanValue);

    scanner.close();
}
}