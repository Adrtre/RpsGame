import java.util.Scanner;

class HumanPlayer implements Player {
    private int points;
    private String name;

    public int getPoints() {
        return points;
    }

    public void addPoint() {
        points++;
    }

    public int getMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz ruch (1 - Kamień, 2 - Papier, 3 - Nożyce): ");
        return scanner.nextInt();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}