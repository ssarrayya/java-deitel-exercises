/*
7.40 (Polling) The Internet and the web are enabling more people to network, join a cause, voice
opinions, and so on. Recent presidential candidates have used the Internet intensively to get out
their messages and raise money for their campaigns. In this exercise, you’ll write a simple polling
program that allows users to rate five social-consciousness issues from 1 (least important) to 10
(most important). Pick five causes that are important to you (e.g., political issues,
global environmental issues). Use a one-dimensional array topics (of type String) to store the five causes.
To summarize the survey responses, use a 5-row, 10-column two-dimensional array responses (of type
int), each row corresponding to an element in the topics array. When the program runs, it should
ask the user to rate each issue. Have your friends and family respond to the survey. Then have the
program display a summary of the results, including:
a) A tabular report with the five topics down the left side and the 10 ratings across the top,
listing in each column the number of ratings received for each topic.
b) To the right of each row, show the average of the ratings for that issue.
c) Which issue received the highest point total? Display both the issue and the point total.
d) Which issue received the lowest point total? Display both the issue and the point total.

 */

package chapter7;

public class Polling {
    private String[] topics = {"Sexual abuse", "Bullying", "Depression", "Anxiety", "Job insecurity"};
    public int[][] responses = new int[5][10];

    public void rateFirstTopic(int userRating) {
        int indexToIncrement = userRating - 1;
        ++responses[0][indexToIncrement];
    }

    public void rateSecondTopic(int userRating) {
        int indexToIncrement = userRating - 1;
        ++responses[1][indexToIncrement];
    }

    public void rateThirdTopic(int userRating) {
        int indexToIncrement = userRating - 1;
        ++responses[2][indexToIncrement];
    }

    public void rateFourthTopic(int userRating) {
        int indexToIncrement = userRating - 1;
        ++responses[3][indexToIncrement];
    }

    public void rateFifthTopic(int userRating) {
        int indexToIncrement = userRating - 1;
        ++responses[4][indexToIncrement];
    }

    public void displayRatingsFrequency() {
        for (int i = 0; i < topics.length; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < responses[i].length; j++) {
                System.out.println(responses[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void getFirstTopicMaxRating() {
        int max = responses[0][0];
        int highestIndex = 1;
        for (int i = 1; i < responses[0].length; i++) {
            if(responses[0][i] > max) {
                max = responses[0][i];
                highestIndex = i + 1;
            }
        }
        System.out.println("The highest rating is" + highestIndex);
    }

    public int getAverage(){
        int numerator = 0;
        int denominator = 0;
        for (int i = 0; i < responses.length; i++) {
            numerator += responses[0][i] * 1 + 1;
            denominator += responses[0][i];
        }
        return numerator/denominator;
    }

    public static void main(String[ ] args) {
        Polling polling = new Polling();

        polling.getFirstTopicMaxRating();
    }
}
