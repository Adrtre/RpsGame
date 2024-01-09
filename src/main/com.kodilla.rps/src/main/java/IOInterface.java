import java.util.Scanner;

public class IOInterface {
    public void displayGameInfo(int roundsToWin) {
        System.out.println("Gra w Kamień, Papier, Nożyce");
        System.out.println("Zasady: Wygraj " + roundsToWin + " rund, aby wygrać grę.");
    }

    public static void logo(){
        System.out.println("           __          __  _   _               _                                                                                               \n" +
                "           \\ \\        / / (_) | |             (_)                                                                                              \n" +
                "            \\ \\  /\\  / /   _  | |_    __ _     _    __      __     __ _   _ __   ____   ___                                                    \n" +
                "             \\ \\/  \\/ /   | | | __|  / _` |   | |   \\ \\ /\\ / /    / _` | | '__| |_  /  / _ \\                                                   \n" +
                "              \\  /\\  /    | | | |_  | (_| |   | |    \\ V  V /    | (_| | | |     / /  |  __/                                                   \n" +
                "               \\/  \\/     |_|  \\__|  \\__,_|   | |     \\_/\\_/      \\__, | |_|    /___|  \\___|                                                   \n" +
                "        _____                    _           _/ |    _  __         __/ |        _                    _   _                                     \n" +
                "       |  __ \\                  (_)         |__/    | |/ /        |___/        (_)                  | \\ | |                                    \n" +
                "       | |__) |   __ _   _ __    _    ___   _ __    | ' /    __ _   _ __ ___    _    ___   _ __     |  \\| |   ___    ____  _   _    ___    ___ \n" +
                "       |  ___/   / _` | | '_ \\  | |  / _ \\ | '__|   |  <    / _` | | '_ ` _ \\  | |  / _ \\ | '_ \\    | . ` |  / _ \\  |_  / | | | |  / __|  / _ \\\n" +
                "       | |      | (_| | | |_) | | | |  __/ | |      | . \\  | (_| | | | | | | | | | |  __/ | | | |   | |\\  | | (_) |  / /  | |_| | | (__  |  __/\n" +
                "       |_|       \\__,_| | .__/  |_|  \\___| |_|      |_|\\_\\  \\__,_| |_| |_| |_| |_|  \\___| |_| |_|   |_| \\_|  \\___/  /___|  \\__, |  \\___|  \\___|\n" +
                "                        | |                                                                                                 __/ |              \n" +
                "                        |_|                                                                                                |___/               " +
                "");
    }

    public int getRoundsCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość rund do wygranej: ");
        return scanner.nextInt();
    }

    public int getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz ruch (1 - Kamień, 2 - Papier, 3 - Nożyce): ");
        return scanner.nextInt();
    }

    public void isEnd(int playerScore, int roundsToWin, String playerName, int computerScore) {
        System.out.println("Wynik końcowy:");
        System.out.println(playerName + ": " + playerScore + " punktów");
        System.out.println("Komputer: " + computerScore + " punktów");

        if (playerScore > computerScore) {
            System.out.println(playerName + " wygrywa grę!");
        } else if (playerScore < computerScore) {
            System.out.println("Komputer wygrywa grę!");
        } else {
            System.out.println("Remis!");
        }
    }

    public void handleSpecialMoves(RpsGame game, String playerName, int roundsToWin, Player player) {
        // Zrobic jeszcze wyjątki i będzie fajrrant niewdzięcznico
    }
}
