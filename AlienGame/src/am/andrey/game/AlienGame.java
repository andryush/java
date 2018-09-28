package am.andrey.game;

public class AlienGame {

    public static void main(String[] args) {

        System.out.println(args[0]);

        Character gamer1 = new Character(0,0);

        gamer1.printInfo();
        gamer1.move(3,3);
        gamer1.printInfo();

        Character player1 = new Player(7, 7);
        player1.printInfo();
        gamer1.printInfo();







    }
}
