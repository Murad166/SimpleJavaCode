import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = input.nextInt();
        long result = 1;
        
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
        input.close();
    }
}
