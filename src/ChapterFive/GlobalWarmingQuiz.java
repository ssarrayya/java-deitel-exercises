package ChapterFive;

import java.util.Scanner;

public class GlobalWarmingQuiz {
    private final String questionOne = """
            Major substances involved with global warming include all of the following except:
            A. N2O
            B. CFCs
            C. CO2
            D. CH4
            """;
    private final String questionTwo = """
            What molecules have been increasing in the atmosphere for decades and have contributed to an elevated global temperature?
            A. ammonium sulfate
            B. sulfur dioxide
            C. carbon dioxide
            D. hydrofluorocarbons
            """;
    private final String questionThree = """
            Which of the following contributes to global warming?
            A. nitrogen
            B. carbon dioxide
            C. helium
            D. chlorine
            """;
    private final String questionFour = """
            Which of the following is MOST often cited for global warming?
            A. increased levels of CFC chemicals
            B. increased levels of carbon dioxide
            C. decreased levels of atmospheric ozone
            D. decreased levels of dissolved oxygen
            """;
    private final String questionFive = """
            Which of the following countries did NOT participate in developing the Copenhagen Accord?
            A. Russia
            B. Brazil
            C. China
            D. India
            """;

    public void displayQuestion(int questions){
        switch (questions) {
            case 1 -> System.out.println(questionOne);
            case 2 -> System.out.println(questionTwo);
            case 3 -> System.out.println(questionThree);
            case 4 -> System.out.println(questionFour);
            case 5 -> System.out.println(questionFive);
            default -> System.out.println(" ");
        }
    }



    public static void main(String[] args) {
        GlobalWarmingQuiz gb = new GlobalWarmingQuiz();
        gb.displayQuestion(3);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your answer");
        String userAnswer = input.next();

    }
}
