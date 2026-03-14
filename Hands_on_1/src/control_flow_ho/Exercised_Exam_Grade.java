package control_flow_ho;

import java.util.Scanner;

public class Exercised_Exam_Grade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double finalgrade = 0;
        int studentCount = 0;

        while (true) {

            System.out.print("Enter the Exercise Grade: ");
            int e1 = sc.nextInt();

            System.out.print("Enter the Exam Grade: ");
            int e2 = sc.nextInt();

            if (e1==-1&&e2==-1) {
                break;
            }

            if (e1<0||e1>10||e2<0||e2>10) {
                System.out.println("Grades should be between 0-10");
                continue;
            }

            double studentFinal;

            if (e1>=5&&e2>=5) {
                studentFinal=(e1*0.30)+(e2*0.70);
            } else {
                studentFinal=Math.min(e1,e2);
            }

            System.out.println("Final Grade: " +studentFinal);

            finalgrade+=studentFinal;
            studentCount++;
        }

        if (studentCount > 0) {
            System.out.println("Average Grade is: "+(finalgrade/studentCount));
        } else {
            System.out.println("No students entered.");
        }

        sc.close();
    }
}
