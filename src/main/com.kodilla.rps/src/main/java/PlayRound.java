class PlayRound {
    public static void playRound(RpsGame game, Player player, Player computerPlayer) {
        int playerMove = player.getMove();
        int computerMove = computerPlayer.getMove();
         int[][] rules = {
                {0, -1, 1},
                {1, 0, -1},
                {-1, 1, 0}
        };
        System.out.println(player.getName() + " wybrał: " + game.printRps(playerMove));
        System.out.println("Komputer wybrał: " + game.printRps(computerMove));

        int result = rules[playerMove - 1][computerMove - 1];

        if (result == 1) {
            System.out.println(player.getName() + " wygrywa rundę!");
            player.addPoint();
        } else if (result == -1) {
            System.out.println("Komputer wygrywa rundę!");
            computerPlayer.addPoint();
        } else {
            System.out.println("Remis w tej rundzie!");
        }
    }
}