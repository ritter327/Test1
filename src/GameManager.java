public class GameManager {

    private Menu menu;

    public void runGame() {
        menu = new Menu();
        String playerName = menu.getName();
        System.out.println("Hello, " + playerName);
    }


}
