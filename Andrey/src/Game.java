/**
 * Created by Gagik on 9/3/18.
 */
public class Game {
    public static void main(String args[])
    {
        TV samsung = new TV();
        TV toshiba = new TV();
        TV sony = new TV();

        Clock rado = new Clock();
        Clock hublot = new Clock();

        rado.play();
        rado.next();

        sony.stop();
        sony.play();
        sony.setChannel(6);
        System.out.print(sony.getChannel());

        rado.stop();
    }
}
