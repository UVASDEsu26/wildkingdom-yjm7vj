public class WildKingdom {

    int numberOfWolves;
    int numberOfRabbits;
    int numberOfMonths;

    public WildKingdom(int numberOfWolves, int numberOfRabbits, int numberOfMonths) {
        this.numberOfWolves = numberOfWolves;
        this.numberOfRabbits = numberOfRabbits;
        this.numberOfMonths = numberOfMonths;
    }

    public void runSimulation() {

        while (numberOfMonths > 0) {

            numberOfMonths--;

            int rabbitsNeeded = numberOfWolves * 2;

            if (rabbitsNeeded > numberOfRabbits) {
                numberOfWolves = numberOfRabbits / 2;
                numberOfRabbits = 0;
            } else {
                numberOfRabbits = numberOfRabbits - rabbitsNeeded;
            }

            numberOfRabbits = numberOfRabbits + ((numberOfRabbits / 2) * 5);
        }
    }

    public int getNumberOfWolves() {
        return numberOfWolves;
    }

    public void setNumberOfWolves(int numberOfWolves) {
        this.numberOfWolves = numberOfWolves;
    }

    public int getNumberOfRabbits() {
        return numberOfRabbits;
    }

    public void setNumberOfRabbits(int numberOfRabbits) {
        this.numberOfRabbits = numberOfRabbits;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public void setNumberOfMonths(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }
}