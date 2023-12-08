import java.util.Scanner;

public class MultipleChoiceQuiz {

    public static void main(String[] args) {C
        Scanner scanner = new Scanner(System.in);

        // Define questions and answers
        String[] questions = {
            "1. What is the capital of France?",
            "2. In which year did World War II end?",
            "3. Who wrote 'Romeo and Juliet'?",
        };

        String[] options = {
            "A. Berlin\nB. Madrid\nC. Paris",
            "A. 1943\nB. 1945\nC. 1950",
            "A. William Shakespeare\nB. Charles Dickens\nC. Jane Austen",
        };

        char[] correctAnswers = {'C', 'B', 'A'};

        // Display questions and get user input
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(options[i]);
            System.out.print("Your answer: ");

            char userAnswer = scanner.next().toUpperCase().charAt(0);

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i] + ".\n");
            }
        }

        // Display final score
        System.out.println("Quiz completed! Your score: " + score + " out of " + questions.length);

        scanner.close();
    }
}
