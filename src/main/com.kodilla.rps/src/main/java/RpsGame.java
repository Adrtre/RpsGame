class RpsGame {
    private Player player;
    private int roundsToWin;


    public RpsGame(Player player, int roundsToWin) {
        this.player = player;
        this.roundsToWin = roundsToWin;
    }

    public String printRps(int playerChoice) {
        switch (playerChoice) {
            case 1:
                return "Kamień";
            case 2:
                return "Papier";
            case 3:
                return "Nożyce";
            default:
                throw new IllegalArgumentException("Nieprawidłowy numer ruchu. Wybierz 1, 2 lub 3.");
        }
    }

    public boolean isGameOver(int playerScore, int computerScore) {
        return playerScore >= roundsToWin || computerScore >= roundsToWin;
    }
}