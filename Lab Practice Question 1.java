import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
        int totalMarks = 0;

        System.out.println("Enter marks of " + n + " students:");

        for (int i = 0; i < n; i++) {
            int marks = sc.nextInt();
            totalMarks += marks;

            if (marks >= 90 && marks <= 100) {
                System.out.print("A ");
                countA++;
            } 
            else if (marks >= 80) {
                System.out.print("B ");
                countB++;
            } 
            else if (marks >= 70) {
                System.out.print("C ");
                countC++;
            } 
            else if (marks >= 60) {
                System.out.print("D ");
                countD++;
            } 
            else {
                System.out.print("F ");
                countF++;
            }
        }

        double average = (double) totalMarks / n;

        System.out.println("\n");
        System.out.println("A = " + countA);
        System.out.println("B = " + countB);
        System.out.println("C = " + countC);
        System.out.println("D = " + countD);
        System.out.println("F = " + countF);
        System.out.println("Average = " + average);

        sc.close();
    }
}
