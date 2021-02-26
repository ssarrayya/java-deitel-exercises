package ChapterFour;

public class Kata {

    public double calculateAverage(int firstNumber, int secondNumber, int thirdNumber) {
        double average = (firstNumber + secondNumber + thirdNumber) / 3.0;
        return average;
    }

    public String calculateGrade(int studentScore) {
        if (studentScore >= 90) {
            return "A";
        } else if (studentScore >= 80) {
            return "B";
        } else if (studentScore >= 70) {
            return "C";
        } else
            return "F";
    }

    public boolean isEven(int numberToEvaluate) {
        boolean isEven = false;

            if (numberToEvaluate % 2 == 0) {
                isEven = true;
            } else {
                isEven = false;
            }

        return isEven;
    }



    public boolean isPrimeNumber(int numberToCheck) {
        boolean isPrimeNumber = false;
        int numberOfFactors = 0;
        int counter = 2;

        while (counter < numberToCheck) {


            if (numberToCheck % counter == 0) {
                numberOfFactors++;
            }

            counter++;
        }

        if(numberOfFactors > 0){
            isPrimeNumber = false;
        }

        else{
            isPrimeNumber = true;
        }

        return isPrimeNumber;
    }
}





