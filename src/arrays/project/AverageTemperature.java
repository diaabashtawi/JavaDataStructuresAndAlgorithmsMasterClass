package arrays.project;

import java.util.Scanner;

public class AverageTemperature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many days temperature? ");
        int numDays = input.nextInt();
        int [] temperature = new int[numDays];
        int sum = 0;
        for (int i = 0; i<numDays; i++){
            System.out.println("Day " + (i + 1) + " high temperature : ");
            temperature[i] = input.nextInt();
            sum += temperature[i];
        }

        double average = sum / numDays;
        int aboutAverage = 0;
        for (int i = 0 ; i< temperature.length; i++){
            if (temperature[i] > average){
                aboutAverage++;
            }
        }

        System.out.println();
        System.out.println("Average Temperature is : " + average);
        System.out.println("Number of days about the aveerage is : " + aboutAverage);

    }
}
