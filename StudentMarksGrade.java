import java.util.Scanner;

public class StudentMarksGrade {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter number of subjects: ");
            int numSubjects = input.nextInt();

            float[] marks = new float[numSubjects];
            float total = 0;

            // Input marks
            for(int i = 0; i < numSubjects; i++) {
                System.out.print("Enter marks for subject " + (i+1) + ": ");
                marks[i] = input.nextFloat();
                total += marks[i];
            }

            float average = total / numSubjects;
            float percentage = (total / (numSubjects * 100)) * 100;
            char grade;

            if(average >= 90) grade = 'A';
            else if(average >= 80) grade = 'B';
            else if(average >= 70) grade = 'C';
            else if(average >= 60) grade = 'D';
            else if(average >= 40) grade = 'E';
            else grade = 'F';

            // Display results
            System.out.println("\nTotal Marks: " + total + "/" + (numSubjects*100));
            System.out.println("Average Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);

            input.close();
        }
    }

