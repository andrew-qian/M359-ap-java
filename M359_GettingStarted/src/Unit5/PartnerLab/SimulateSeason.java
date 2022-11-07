package Unit5.PartnerLab;

public class SimulateSeason {
    private static int totalWins = 0;

    public static boolean simulateGame(Team x) { // add win counter method that sums all trues and falses and adds together wins and losses
        Team y = new Team();
        // random team
        double winChance = 0;
        int randInt = (int) (Math.random() * 100 + 1);

        int xDefense = x.getDefenseRanking();
        int xOffense = x.getOffenseRanking();
        int yDefense = y.getDefenseRanking();
        int yOffense = y.getOffenseRanking();

        while (xDefense == yDefense || xOffense == yOffense) {
            y = new Team();
            xDefense = x.getDefenseRanking();
            xOffense = x.getOffenseRanking();
            yDefense = y.getDefenseRanking();
            yOffense = y.getOffenseRanking();
        }

        if (xDefense < yDefense && xOffense < yOffense) {
            winChance = 80;
        } else if (xDefense < yDefense && xOffense > yOffense) {
            winChance = 40;
        } else if (xDefense > yDefense && xOffense < yOffense) {
            winChance = 40;
        } else {
            winChance = 20;
        }

        if (winChance > randInt) {
            return true;
        } else {
            return false;
        }
    }

    public static String simulateSeason(Team x) { // instead of returning the total record, return a win loss column with the rankings of the teams being played
        String result = "Win-Loss Column\n";
        for (int i = 1; i < 18; i++) {
            boolean gameResult = simulateGame(x);
            if (gameResult) {
                result += "Week " + i + ": " + "(W)\n";
                totalWins++;
                x.setWins(x.getWins() + 1);
            }
            else {
                result += "Week " + i + ": " + "(L)\n";
            }

                // append W/L to result

            }
            result += "Team: " + x.getTeamName() + "\nWins: " + x.getWins() + '\n' + "Losses: " + (17 - x.getWins());
            return result;
            //totalWins = x.getWins() / 5;
            //return "Team: " + x.getTeamName() + "\nWins: " + totalWins + '\n' + "Losses: " + (17-totalWins);
            // closing time, every new beginning is somethings beginning end,
            // seahawks bad ratio L + bozo
        }

}
