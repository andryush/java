package am.andrey.game;

public class Character {

    public int x;
    public int y;

    Character (){

    }

    Character (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printInfo() {

        System.out.println("Character x = " + this.x + ":::" + "Character y = " + this.y);
    }
@Override
    public String toString() {

        return "aaa";
        //System.out.println("OVERRIDE");
    }

    public void move(int xMove, int yMove) {

        this.x += xMove;
        this.y += yMove;

    }
}
