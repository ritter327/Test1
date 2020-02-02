import java.util.Scanner;

public class Menu {
    //private String menuMessage;
    private String menuOptions;
    private int userOption;

    public void displayMessage() {
        System.out.println("Welcome to Rock, Paper, Scissors!!!");
    }

    public String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String playerName = scanner.nextLine();
        return playerName;
    }

    public void displayOptions() {
        System.out.println("1-Rock");
        System.out.println("2-Paper");
        System.out.println("3-Scissors");
        System.out.println();
        System.out.print("Please select an option:");
    }

    public int getUserPick() {
        Scanner scanner = new Scanner(System.in);
        int userPick = scanner.nextInt();
        System.out.println("You picked: " + userPick);
        return userPick;
    }

}

//    Welcome to Rock, Paper, Scissors!!!
//        What is your name? Matt
//
//        Hello Matt.
//        1-Rock
//        2-Paper
//        3-Scissors
//
//        Please select an option: 1
//
//        You Picked Rock