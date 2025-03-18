import java.util.Scanner;

public class OddSquareSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            int term = (2 * i - 1) * (2 * i - 1);
            sum += term;
        }
        
        System.out.println("Sum of the series: " + sum);
        input.close();
    }
}
