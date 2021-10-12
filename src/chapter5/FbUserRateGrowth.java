/*
5.33 (Facebook User Base Growth) According to CNNMoney.com,
Facebook hit one billion users in October 2012. Using the compound-growth technique you learned
in Fig. 5.6 and assuming its user base grows at a rate of 4% per month,
how many months will it take for Facebook to grow its user base to 1.5 billion users?
How many months will it take for Facebook to grow its user base to two billion users?
 */

package chapter5;

public class FbUserRateGrowth {
    public static void main(String[] args) {
        double rateOfGrowth = 0.04;
        int initialUserBase = 1000000000;
        double targetUserBase;
        double secondTargetUserBase;
        int month = 1;

        for(; true; month++) {
            targetUserBase = (initialUserBase * Math.pow(1 + rateOfGrowth, month));
            if (targetUserBase >= 1500000000) {
                break;
            }
        }
        System.out.println("It will take " + month + " months for Facebook to get to 1.5 billion users");

        for(; true; month++){
            secondTargetUserBase = initialUserBase * Math.pow(1 + rateOfGrowth, month);
            if(secondTargetUserBase >= 2000000000){
                break;
            }
        }
        System.out.println("It will take " + month + " months for Facebook to get to 2 billion users");
    }
}
