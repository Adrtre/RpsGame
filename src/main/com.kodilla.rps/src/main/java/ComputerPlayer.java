

import java.util.Random;

class ComputerPlayer implements Player {
    private int points;
    private String name;

    public int getPoints() {
        return points;
    }

    public void addPoint() {
        points++;
    }

    public int getMove() {
        Random random = new Random();
        return random.nextInt(3) + 1; // Losowy ruch komputera (1-3)
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}