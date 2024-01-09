class RpsRunner {
    public static void main(String[] args) {
        IOInterface ioInterface = new IOInterface();
        ioInterface.logo();

        int roundsToWin = ioInterface.getRoundsCount();
        ioInterface.displayGameInfo(roundsToWin);

        Player computerPlayer = new ComputerPlayer();
        computerPlayer.setName("Komputer");

        Player humanPlayer = new HumanPlayer();
        humanPlayer.setName("Adrian");//<---tutaj będzie scnanner

        RpsGame game = new RpsGame(humanPlayer, roundsToWin);

        int playerScore = 0;
        int computerScore = 0;

        while (!game.isGameOver(playerScore, computerScore)) {
            PlayRound.playRound(game, humanPlayer, computerPlayer);

            System.out.println("Aktualny wynik:");
            System.out.println(humanPlayer.getName() + ": " + humanPlayer.getPoints() + " punktów");
            System.out.println("Komputer: " + computerPlayer.getPoints() + " punktów");

            playerScore = humanPlayer.getPoints();
            computerScore = computerPlayer.getPoints();
        }

        ioInterface.isEnd(playerScore, roundsToWin, humanPlayer.getName(), computerScore);
        ioInterface.handleSpecialMoves(game, humanPlayer.getName(), roundsToWin, humanPlayer);
    }
}