public class RockPaperScissors {
    private static GameManager gameManager;

    public static void main(String[] args) {

        //Instantiate GameManager Class member
        gameManager = new GameManager();
        gameManager.runGame();
    }
}
