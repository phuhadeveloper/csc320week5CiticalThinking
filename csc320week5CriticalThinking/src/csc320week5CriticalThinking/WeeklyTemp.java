package csc320week5CriticalThinking;

/*
 * Develop a Java program that will store data in the form of daily average 
 * temperatures for one week. Store the day and average temperature in two 
 * different arraylists. Your program should prompt the user for the day 
 * of the week (Monday through Sunday) and display both the day and temperature
 * for each day. If "week" is entered, the output for your program should provide
 * the temperature for each day and the weekly average. Use the looping 
 * and decision constructs in combination with the arrays to complete 
 * this assignment.
 * */

/* 
 * PseudoCode
 * 
 * DAYS (list that stores days of the week, Monday-Sunday)
 * DAILY_AVG_TEMPS (list that stores daily average temperature)
 * SCANNER
 * INPUT
 * 
 * STORE DATA IN DAYS AND DAILY_AVG_TEMPS
 * 
 * PRINT("Enter day of the week, or 'week' to see daily and weekly average: ")
 * SCAN FOR USER INPUT
 * 
 * IF (INPUT == "monday") 
 * 		PRINT(DAYS[0], DAILY_AVG_TEMPS[0])
 * ELSE IF (INPUT == "tuesday")
 *  	PRINT(DAYS[1], DAILY_AVG_TEMPS[1])
 * ELSE IF (INPUT == "wednesday")
 * 		PRINT(DAYS[2], DAILY_AVG_TEMPS[2])
 * ELSE IF (INPUT == "thursday")
 * 		PRINT(DAYS[3], DAILY_AVG_TEMPS[3])
 * ELSE IF (INPUT == "friday")
 * 		PRINT(DAYS[4], DAILY_AVG_TEMPS[4])
 * ELSE IF (INPUT == "saturday")
 * 		PRINT(DAYS[5], DAILY_AVG_TEMPS[5])
 * ELSE IF (INPUT == "sunday")
 * 		PRINT(DAYS[6], DAILY_AVG_TEMPS[6])
 * ELSE IF (INPUT == "week")
 * 		TOTAL = 0
 * 		FOR (int i = 0; i < 7; i++)
 * 			PRINT(DAYS[i], DAILY_AVG_TEMPS[i])
 * 			TOTAL += DAILY_AVG_TEMPS[i]
 * 		PRINT(TOTAL / 7)
 * 			
 * ELSE 
 * 		PRINT("Invalid Input, please try again")
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> days = new ArrayList<String>();
		ArrayList<Double> dailyAvgTemps = new ArrayList<Double>();
		String userInput;
		
		days.add("Monday"); 
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		
		dailyAvgTemps.add(78.5);
		dailyAvgTemps.add(79.3);
		dailyAvgTemps.add(76.1);
		dailyAvgTemps.add(76.5);
		dailyAvgTemps.add(80.9);
		dailyAvgTemps.add(81.2);
		dailyAvgTemps.add(80.3);
		
		System.out.println("Enter a day of the week, or 'week' to see daily and weekly average: ");
		userInput = scanner.next();
		
		if (userInput.equalsIgnoreCase("monday")) {
			System.out.println(days.get(0) + ": " + dailyAvgTemps.get(0) + "F");
		}
		else if (userInput.equalsIgnoreCase("tuesday")) {
			System.out.println(days.get(1) + ": " + dailyAvgTemps.get(1) + "F");
		}
		else if (userInput.equalsIgnoreCase("wednesday")) {
			System.out.println(days.get(2) + ": " + dailyAvgTemps.get(2) + "F");
		}
		else if (userInput.equalsIgnoreCase("thursday")) {
			System.out.println(days.get(3) + ": " + dailyAvgTemps.get(3) + "F");
		}
		else if (userInput.equalsIgnoreCase("friday")) {
			System.out.println(days.get(4) + ": " + dailyAvgTemps.get(4) + "F");
		}
		else if (userInput.equalsIgnoreCase("saturday")) {
			System.out.println(days.get(5) + ": " + dailyAvgTemps.get(5) + "F");
		}
		else if (userInput.equalsIgnoreCase("sunday")) {
			System.out.println(days.get(6) + ": " + dailyAvgTemps.get(6) + "F");
		}
		else if (userInput.equalsIgnoreCase("week")) {
			double total = 0;
			for (int i = 0; i < 7; i++) {
				System.out.println(days.get(i) + ": " + dailyAvgTemps.get(i) + "F");
				total += dailyAvgTemps.get(i);
			}
			System.out.println("Average Temperature of the week: " + total/7 + "F");
		}
		else {
			System.out.println("Invalid input. Please try again.");
		}
	}

}
