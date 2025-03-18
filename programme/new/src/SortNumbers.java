import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.println("Sorted numbers in ascending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        input.close();
    }
}
