public class GameManager {

    private Menu menu;

    public void runGame() {
        menu = new Menu();
        String playerName = menu.getName();
        System.out.println("Hello, " + playerName);

        boolean gameOver = false;

        while (!gameOver) {
            menu.displayOptions();
            int userPick = menu.getUserPick();
            int computerPick = 2; // TODO: generate random integer between [1-3]
            int results = findWinner(userPick, computerPick);

            System.out.println("Round results: " + results);
        }
    }

    private int findWinner(int userPick, int computerPick) {
        if (userPick == computerPick) {
            return 3; // tie
        } else if (userPick == 1 && computerPick == 2) {
            return 2; // Computer wins
        } else if (userPick == 1 && computerPick == 3) {
            return 1; // Player wins
        } else if (userPick == 2 && computerPick == 1) {
            return 1; // Player wins
        } else if (userPick == 2 && computerPick == 3) {
            return 2; // Computer wins
        } else if (userPick == 3 && computerPick == 1) {
            return 2; // Computer wins
        } else { // 3 - 2 = playerWins
            return 1; // Player wins
        }
    }

}

// player-computer
// 1 = rock
// 2 = paper
// 3 = scissors

/*
playerPick = computerPick = tie
1 - 2 = computerWins
1 - 3 = playerWins

2 - 1 = playerWins
2 - 3 = computerWins

3 - 1 = computerWins
3 - 2 = playerWins

 */