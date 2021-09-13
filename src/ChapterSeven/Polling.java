package ChapterSeven;

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
