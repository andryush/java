public class BottlesSong {
    public static void main (String[] args) {
        int beerNum = 99;
        String word = "бутылок";

        do  {

            if (beerNum == 1) {
                word = "бутылка";
            }
            else if ( beerNum > 1 && beerNum < 5) {
                word = "бутылки";
            }

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");

            beerNum -= 1;

            /*if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на стене");
            }
            else {
                System.out.println("Нет бутылок пива на стене");
            }*/



        }
        while (beerNum > 0);
    }
}
