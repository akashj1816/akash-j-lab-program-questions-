import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist");
        } 
        else {
            System.out.println("Second Largest = " + secondLargest);
        }

        sc.close();
    }
}
