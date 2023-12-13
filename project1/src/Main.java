import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the radius from the user
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        // Step 2: Call the Circumference method and print the result
        double circumference = Circumference(radius);
        System.out.println("Circumference: " + circumference);

        // Step 3: Create an array
        int[] numbers = {90, 2, 8, 1, 3};

        // Step 4: Call the bubblesort method and print the sorted array
        bubblesort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        int[] Numbers = new int[4];
        for (int i =0; i<4;i++){
            Numbers[i]=scanner.nextInt();
        }
        System.out.println("New Array: " + Arrays.toString(Numbers));
        bubblesort(Numbers);
        System.out.println("New Array: " + Arrays.toString(Numbers));
        System.out.println("Enter the your mark");
        int marks=scanner.nextInt();
        System.out.println(passorfail(marks));

        // Close the Scanner
        scanner.close();
    }

    // bubblesort algorithm
    public static void bubblesort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Circumference method
    public static double Circumference(double radius) {
        return 2 * Math.PI * radius;
    }
    public static String passorfail(int marks ){
        if (marks>=50) {
            return "Pass";
        }
        else{
            return "Fail";

        }
    }
}
