package network;

public class Game {

    private Player player;

    public Game(Player player) {
        this.player = player;
    }

    public String start() {
        return "Game started";
    }
}
