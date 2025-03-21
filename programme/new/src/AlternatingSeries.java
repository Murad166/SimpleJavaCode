import java.util.Scanner;

public class AlternatingSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        
        System.out.println("Sum of the series: " + sum);
        input.close();
    }
}
