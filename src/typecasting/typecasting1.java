package typecasting;

public class typecasting1 {
    public static void main(String[] args) {
        int score = 75;
        String grade;
        grade = (score >= 90) ? "A" :
                       (score >= 80) ? "B" :
                                (score >= 70) ? "C" :
                                       (score >= 60) ? "D" : "F";

        System.out.println("The grade for a score of " + score + " is: " + grade);
    }
}
