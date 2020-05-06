import java.util.Scanner;
public class TripPlanner {

    public static void main(String[] args) {
        intro();
        budget();
        time();
        distance();

    }

    public static void intro() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner! ");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name +", where are you travelling to? ");
        String destination = input.nextLine();
        System.out.println("Awesome! " + destination + " sounds like a great trip! ");
        System.out.println("***********");
        System.out.println();
    }

    public static void budget() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days is your upcoming trip? ");
        int days = input.nextInt();
        System.out.print("About how much money, in USD, are you planning to spend on this trip? ");
        int dollars = input.nextInt();
        System.out.print("What is the letter currency symbol for your destination? ");
        String symbol = input.next();
        System.out.print("How many " + symbol + " are there in 1 USD? ");
        double conversion = input.nextDouble();
        System.out.println();

        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;

        double dailyUsBudget = ((dollars / days) * 100) / 100.0;
        double tripTotalBudget = dollars * conversion;
        double convertedTripBudget = ((int) (tripTotalBudget * 100)) / 100.0;
        double convertedDailyBudget = ((int) ((tripTotalBudget * 100)/ days)) / 100.0;

        System.out.println("You are traveling for " + days + " days. That is the same as " + hours + " hours, " + minutes + " minutes, or " + seconds + " seconds.");
        System.out.println("Your budget (in USD) for the whole trip is $" + dollars + ", which breaks down to $" + dailyUsBudget + " per day.");
        System.out.println("Your total budget (in " + symbol + ") for the whole trip is " + convertedTripBudget + " " + symbol + ", which breaks down to " + convertedDailyBudget + " " + symbol + " per day.");
        System.out.println("***********");
        System.out.println();
    }

    public static void time() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int difference = input.nextInt();
        System.out.println("That mean when it is midnight at home it will be " + ((24 + difference) % 24) +":00 at your travel destination.");
        System.out.println("When it is noon at home it will be " + ((12 + difference) % 24) + ":00 at your travel destination.");
        System.out.println("***********");
        System.out.println();
    }

    public static void distance() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2? ");
        double area = input.nextInt();
        double miles = ((area * 0.386102) * 100) / 100.0;
        System.out.println("In miles2 that is approximately " + miles + ".");
        System.out.println("***********");
        System.out.println();
    }
}
