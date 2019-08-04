import java.util.Arrays;
import java.util.Scanner;

public class studentInfo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] names = { "Mike", "Garret", "Todd", "Mo", "Dvon", "Trey", "Abdul", "Ahmad", "Q", "Ben" };
		String[] foods = { "Pasta", "Chicken", "Lamb", "Pizza", "Burgers", "Pb&J", "Salad", "Tacos", "Burritos",
				"Nachos" };
		String[] hometowns = { "Detroit", "Ann Arbor", "Troy", "Brighton", "Detroit", "Ann Arbor", "Ypsilanti",
				"Chicago", "New York", "Miami" };
		int userNum;
		String yes;
		String no;
		String cont = "yes";
		String userChoice;

	
		userNum = Validator.getInt(scan, "Welcome to our Java class. Which student would you like to learn about? Enter Number 1-10: ");	
		
		System.out.println("Student " + userNum + " is " + (names[userNum - 1]) + ".");
		
		while (cont.equalsIgnoreCase("yes")) {
			System.out.println(
					"What would you like to know about " + (names[userNum - 1]) + "? (Enter hometown or food)");
			userChoice = scan.nextLine();
			
			if (userChoice.equalsIgnoreCase("Hometown")) {
				System.out.println(hometowns[userNum - 1]);
				System.out.println("Would you like to know anything else about " +
				(names[userNum - 1]) + "?");
				cont = scan.nextLine();
				if (cont.equalsIgnoreCase("yes")) {

				}
			} else if (userChoice.equalsIgnoreCase("food")) {
				System.out.println(foods[userNum - 1]);
				System.out.println("Would you like to know anything else about " + (names[userNum - 1] + "?"));
				cont = scan.nextLine();
			}

		}
		System.out.println("GoodBye!");
		
	}
}