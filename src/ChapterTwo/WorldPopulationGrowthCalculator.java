/*
    2.34 (World Population Growth Calculator) Use the web to determine the current world population and the annual world population growth rate. Write an application that inputs these values,
then displays the estimated world population after one, two, three, four and five years
 */

package ChapterTwo;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        long currentWorldPopulation = 7_800_000_000L;
        double populationGrowthRate = 1.1;

        long oneYearPopulationEstimate = (long) (currentWorldPopulation * populationGrowthRate) / 100 + currentWorldPopulation;
        long twoYearsPopulationEstimate = (long) (oneYearPopulationEstimate * populationGrowthRate) / 100 + oneYearPopulationEstimate;
        long threeYearsPopulationEstimate = (long) (twoYearsPopulationEstimate * populationGrowthRate) / 100 + twoYearsPopulationEstimate;
        long fourYearsPopulationEstimate = (long) (threeYearsPopulationEstimate * populationGrowthRate) / 100 + threeYearsPopulationEstimate;
        long fiveYearsPopulationEstimate = (long) (fourYearsPopulationEstimate * populationGrowthRate) / 100 + fourYearsPopulationEstimate;

        System.out.println("World population estimate after 1 year is " + oneYearPopulationEstimate);
        System.out.println("World population estimate after 2 years is " + twoYearsPopulationEstimate);
        System.out.println("World population estimate after 3 years is " + threeYearsPopulationEstimate);
        System.out.println("World population estimate after 4 years is " + fourYearsPopulationEstimate);
        System.out.println("World population estimate after 5 years is " + fiveYearsPopulationEstimate);
    }
}
