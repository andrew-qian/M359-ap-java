package Unit5.PartnerLab;

public class SimulateSeason {
    private static int totalWins = 0;
    private static int years = 0;
    private static int SBWins = 0;
    private static boolean perfectSeason = false;
    private static int perfectSeasonYear = 0;
    /**
     * Helper method for simulateSeason, simulates a single game between the Team object initiated and a randomly generated team
     * @param x Team object that is already initiated
     * @param y randomly generated team that team x plays in a game
     * @return Returns true or false based on whether team x beats team y
     */
    public static boolean simulateGame(Team x, Team y) {
        double winChance;
        int randInt = (int)(Math.random() * 100 + 1);

        int xDefense = x.getDefenseRanking();
        int xOffense = x.getOffenseRanking();
        int yDefense = y.getDefenseRanking();
        int yOffense = y.getOffenseRanking();

        while (xDefense == yDefense || xOffense == yOffense) {
            Team z = new Team();
            yDefense = z.getDefenseRanking();
            yOffense = z.getOffenseRanking();
            y.setDefenseRanking(yDefense);
            y.setOffenseRanking(yOffense);
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

    /**
     * Runs simulateGame 17 times and then sums up the wins/losses and win percentage
     * @param x Team object that is already initiated
     * @return Returns a printout that shows the ranking of the team played every game, whether it was a win or loss,
     * and a total win/loss record of the season and win percentage.
     */
    public static String simulateSeason(Team x) {
        String result = "Team: " + x.getTeamName() + " (Offense #" + x.getOffenseRanking() + ", Defense #" + x.getDefenseRanking() + ")\n";
        x.setWins(0);
        years++;
        result += "Year: " + years + "\n";
        int randInt = (int)(Math.random() * 100 + 1);

        for (int i = 1; i < 18; i++) {
            Team y = new Team();
            boolean gameResult = simulateGame(x, y);
            if (gameResult) {
                result += "Week " + i + ": " + "(W) (Offence #" + y.getOffenseRanking() + ", Defense #" +y.getDefenseRanking() + ")\n";
                totalWins++;
                x.setWins(x.getWins() + 1);
            }
            else {
                result += "Week " + i + ": " + "(L) (Offence #" + y.getOffenseRanking() + ", Defense #" +y.getDefenseRanking() + ")\n";
            }

        }
        double winLossPercentage = Math.round((double)(x.getWins())/(17)*100 * 100.0) / 100.0;;
        result += "\nRecord: " + x.getWins() + "-" + (17 - x.getWins()) + " (" + winLossPercentage + "%)\n";

        //playoffs
        boolean wonSB = false;
        if (x.getWins() >= 11){
            result += "Made Playoffs!\n";
            Team y = new Team(16,16);
            int iterations = 1;
            boolean playoffGameResult = simulateGame(x,y);
            while (iterations <= 4 && playoffGameResult){
                playoffGameResult = simulateGame(x,y);
                iterations++;
            }
            if (iterations == 4){
                x.setSbWins(x.getSbWins() + 1);
                SBWins++;
                wonSB = true;
            }
        }

        if (wonSB){
            result += "Won Super Bowl!\n";
        }
        if (x.getWins() == 17 && wonSB){
            perfectSeason = true;
            perfectSeasonYear = years;
        }
        return result;
        }

    /**
     * Checks the total wins/losses and win percentage through all years
      * @return Returns win loss percentage and total wins/losses
     */
    public static String franchiseLog(){
        double winLossPercentage = Math.round((double)(totalWins)/((years*17)) * 100 * 100.0) / 100.0;
        String output = "Years Played: " + years + "\nTotal Record: " + totalWins + "-" + ((years*17)-totalWins) + " (" + winLossPercentage + "%)"
                + "\nSuper Bowl Wins: " + SBWins;
        if (perfectSeason){
            output += "\nYOU HAD A PERFECT SEASON YEAR: " + perfectSeasonYear;
        }
        return output;
    }


}