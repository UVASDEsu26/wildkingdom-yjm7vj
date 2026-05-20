public class Main {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Sorry, I'm expecting three arguments.");
            System.exit(0);
        }

        try {

            int numberOfWolves = Integer.parseInt(args[0]);

            int numberOfRabbits = Integer.parseInt(args[1]);

            int numberOfMonths = Integer.parseInt(args[2]);

            WildKingdom valley =
                    new WildKingdom(numberOfWolves,
                            numberOfRabbits,
                            numberOfMonths);

            valley.runSimulation();

            System.out.println("Wolves: " + valley.getNumberOfWolves());
            System.out.println("Rabbits: " + valley.getNumberOfRabbits());
            System.out.println("Months: " + valley.getNumberOfMonths());

        } catch (NumberFormatException e) {

            System.out.println("I didn't understand one of your numbers.");
            System.exit(0);
        }
    }
}