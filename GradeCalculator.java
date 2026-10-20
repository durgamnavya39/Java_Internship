import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        double averagePercentage = (double) totalMarks / numSubjects;
        char grade;

        if (averagePercentage >= 90) grade = 'A';
        else if (averagePercentage >= 75) grade = 'B';
        else if (averagePercentage >= 60) grade = 'C';
        else if (averagePercentage >= 50) grade = 'D';
        else grade = 'F';

        System.out.println("\n--- RESULTS ---");
        System.out.println("Total Marks: " + totalMarks + " / " + (numSubjects * 100));
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade Assigned: " + grade);

        scanner.close();
    }
}