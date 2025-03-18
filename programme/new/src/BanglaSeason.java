import java.util.Scanner;

public class BanglaSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        
        switch (month) {
            case 4, 5 -> System.out.println("Summer Season");
            case 6, 7 -> System.out.println("Rainy Season");
            case 8, 9 -> System.out.println("Autumn Season");
            case 10, 11 -> System.out.println("Late Autumn Season");
            case 12, 1 -> System.out.println("Winter Season");
            case 2, 3 -> System.out.println("Spring Season");
            default -> System.out.println("Invalid month");
        }
        
        input.close();
    }
}
