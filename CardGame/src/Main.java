import java.util.Scanner;

/**
 * Created by tito on 2018-08-27.
 */
public class Main {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many decks do you want?");
        int number = scan.nextInt();
        Game game = new Game(number);

        int selection;
        do {
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println("[0 = exit, 1 = pick card, 2 = shuffle, 3 = sort]");
            selection = scan.nextInt();

            if (selection == 0) {
                //NOTHING
            } else if (selection == 1) {
                System.out.println(game.pick());
            } else if (selection == 2) {
                game.Shuffle();
                System.out.println("The cards have been shuffled");
            } else if (selection == 3) {
                game.sort();
                System.out.println("The cards have been sorted");
            } else {
                System.out.println("Invalid selection. please try again!");
            }
        } while (selection != 0);
    }
}