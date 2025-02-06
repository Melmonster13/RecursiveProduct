import java.util.Scanner;

public class RecursiveProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers to calculate product:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter number %d of 5: ", (i + 1));
            numbers[i] = input.nextInt();
        }

        // Calculate and display result
        int product = calculateProduct(numbers, 0);
        System.out.println("\nThe product of your five numbers is: " + product);

        input.close();
    }

    public static int calculateProduct(int[] numbers, int index) {
        if (index >= numbers.length) {
            return 1;
        }
        return numbers[index] * calculateProduct(numbers, index + 1);
    }
}
