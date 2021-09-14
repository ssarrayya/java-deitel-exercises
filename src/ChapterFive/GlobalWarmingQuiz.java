package ChapterFive;

import java.util.Scanner;

public class GlobalWarmingQuiz {

    public void displayQuestion(){
        String questionOne = """
                Major substances involved with global warming include all of the following except:
                A. N2O
                B. CFCs
                C. CO2
                D. CH4
                """;
        System.out.println(questionOne);
        String questionTwo = """
                What molecules have been increasing in the atmosphere for decades and have contributed to an elevated global temperature?
                A. ammonium sulfate
                B. sulfur dioxide
                C. carbon dioxide
                D. hydrofluorocarbons
                """;
        System.out.println(questionTwo);
        String questionThree = """
                Which of the following contributes to global warming?
                A. nitrogen
                B. carbon dioxide
                C. helium
                D. chlorine
                """;
        System.out.println(questionThree);
        String questionFour = """
                Which of the following is MOST often cited for global warming?
                A. increased levels of CFC chemicals
                B. increased levels of carbon dioxide
                C. decreased levels of atmospheric ozone
                D. decreased levels of dissolved oxygen
                """;
        System.out.println(questionFour);
        String questionFive = """
                Which of the following countries did NOT participate in developing the Copenhagen Accord?
                A. Russia
                B. Brazil
                C. China
                D. India
                """;
        System.out.println(questionFive);
    }

    public void scorer(int counter) {
        if(counter == 5) {
            System.out.println("Excellent!");
        } else if(counter == 4) {
            System.out.println("Good job!");
        } else if(counter >= 3) {
            System.out.println("""
                                Time to brush up on your knowledge of global warming
                                Check out these websites:
                                https://quizlet.com/269341095/chapter-21-changes-in-ecosystems-flash-cards/
                                https://unfccc.int/process/conferences/pastconferences/copenhagen-climate-change-conference-december-2009/statements-and-resources/information-provided-by-parties-to-the-convention-relating-to-the-copenhagen-accord
                                """);
        }
    }

    public static void main(String[] args) {
        GlobalWarmingQuiz gb = new GlobalWarmingQuiz();
        gb.displayQuestion();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your answers");
        int counter = 0;
        System.out.println("enter answer for question one");
        String userAnswer1 = input.next();
        input.nextLine();
        System.out.println("enter answer for question two");
        String userAnswer2 = input.next();
        input.nextLine();
        System.out.println("enter answer for question three");
        String userAnswer3 = input.next();
        input.nextLine();
        System.out.println("enter answer for question four");
        String userAnswer4 = input.next();
        input.nextLine();
        System.out.println("enter answer for question five");
        String userAnswer5 = input.next();



        if(userAnswer1.equals("B") || userAnswer1.equals("b")) {
            counter += 1;
        }
        if(userAnswer2.equals("C")  || userAnswer2.equals("c")) {
            counter += 1;
        }
        if(userAnswer3.equals("B") || userAnswer3.equals("b")) {
            counter += 1;
        }
        if(userAnswer4.equals("B") || userAnswer4.equals("b")) {
            counter += 1;
        }
        if(userAnswer5.equals("A") || userAnswer5.equals("a")) {
            counter += 1;
        }

        gb.scorer(counter);
    }
}
