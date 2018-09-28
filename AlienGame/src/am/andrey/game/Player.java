package am.andrey.game;

public class Player extends Character {

    private String playerType;
    public int x;
    public int y;

    Player () {

    }

    Player (int xPlayer, int yPlayer) {

        super(xPlayer, yPlayer);
    }

    public void printInfo() {

        System.out.print("player x = " + super.x + ":::" + "player y = " + super.y);
        super.printInfo();
    }
}
