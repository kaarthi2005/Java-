import java.util.Scanner;

public class Forloop16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int passCount = 0;
        int failCount = 0;
        int highestScore = Integer.MIN_VALUE;
        int totalScore = 0;

        for (int i = 0; i < n; i++) {

            String studentName = scan.next();
            int correct = scan.nextInt();
            int wrong = scan.nextInt();
            int unattempted = scan.nextInt();
            int score = (correct * 4) - (wrong * 3) +(unattempted * 0) ;
            totalScore += score;
            if (score > highestScore) {
                highestScore = score;
            }

            String result;
            if (score >= 32) {
                result = "Pass";
                passCount++;
            } else {
                result = "Fail";
                failCount++;
            }

            System.out.println("Student: " + studentName);
            System.out.println("Correct: " + correct);
            System.out.println("Wrong: " + wrong);
            System.out.println("Unattempted: " + unattempted);
            System.out.println("Score: " + score);
            System.out.println("Result: " + result);
            System.out.println();
        }

        double classAverage = (double) totalScore / n;

        System.out.println("Total Students: " + n);
        System.out.println("Pass Count: " + passCount);
        System.out.println("Fail Count: " + failCount);
        System.out.println("Class Average: " + classAverage);
        System.out.println("Highest Score: " + highestScore);

        scan.close();
    }
}