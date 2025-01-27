import java.util.Scanner;

public class RecursiveProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter number: " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("Product: " + calculateProduct(numbers, 0));
        input.close();
    }

    public static int calculateProduct(int[] numbers, int index) {
        if (index >= numbers.length) {
            return 1;
        }
        return numbers[index] * calculateProduct(numbers, index + 1);
    }
}
