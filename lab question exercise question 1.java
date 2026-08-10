import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Employee details
        int employeeId = sc.nextInt();
        String employeeName = sc.next();

        // Attendance array for 7 days
        int[] attendance = new int[7];

        boolean valid = true;
        int presentDays = 0;
        int absentDays = 0;

        // Read attendance
        for (int i = 0; i < 7; i++) {
            attendance[i] = sc.nextInt();

            // Check whether attendance is 0 or 1
            if (attendance[i] != 0 && attendance[i] != 1) {
                valid = false;
            }

            if (attendance[i] == 1) {
                presentDays++;
            } else if (attendance[i] == 0) {
                absentDays++;
            }
        }

        // Invalid attendance input
        if (!valid) {
            System.out.println("Invalid Attendance Input");
        } else {

            // Calculate attendance percentage
            double attendancePercentage = (presentDays / 7.0) * 100;

            // Check incentive eligibility
            String eligibility;

            if (attendancePercentage >= 90.0) {
                eligibility = "Eligible";
            } else {
                eligibility = "Not Eligible";
            }

            // Display attendance report
            System.out.printf("Attendance = %.2f%%, Absent Days = %d, %s%n",
                    attendancePercentage, absentDays, eligibility);
        }

        sc.close();
    }
}
