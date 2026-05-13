public class GradeChecker {
        public static void main(String[] args) {
            double score = 87.5;
            double gpa = 3.8;
            char letterGrade;

            if (score >= 90) {
                letterGrade = 'A';
            } else if (score >= 80) {
                letterGrade = 'B';
            } else if (score >= 70) {
                letterGrade = 'C';
            } else if (score >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.println("Score: " + score);
            System.out.println("Grade: " + letterGrade);
            if (score >= 90) {
                if (gpa >= 3.5) {
                    System.out.println("Congratulations! You are on the Honor Roll.");
                }
                System.out.println("Excellent work!");
            }
            else if (letterGrade == 'F') {
                System.out.println("Don't give up! Keep working hard to improve!");
            }
            else {
                System.out.println("Keep working hard to improve!");
                System.out.println("Good job!");
            }
        }
    }
