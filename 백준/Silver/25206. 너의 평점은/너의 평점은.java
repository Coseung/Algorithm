import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalScore = 0;
        double totalCredits = 0;

        for (int i = 0; i < 20; i++) {
            sc.next();
            double credit = sc.nextDouble();
            String grade = sc.next();

            if (grade.equals("P")) {
                continue;
            }

            totalScore += (credit * getGradePoint(grade));
            totalCredits += credit;
        }

        System.out.printf("%.6f", totalScore / totalCredits);
        sc.close();
    }

    private static double getGradePoint(String grade) {
        switch (grade) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F":  return 0.0;
            default:   return 0.0;
        }



    }
}