package Unit5.PartnerLab;

public class SimulateSeason {
    private static int totalWins = 0;
    private static int totalLosses = 0;
    private static int yearNum = 2021;
    private static int SBWins = 0;
    private static boolean perfectSeason = false;
    private static int perfectSeasonYear = 0;
    /**
     * Helper method for simulateSeason, simulates a single game between the Team object initiated and a randomly generated team
     * @param x Team object that is already initiated
     * @param y randomly generated team that team x plays in a game
     * @return Returns true or false based on whether team x beats team y
     */
    public static String simulateGame(Team x, Team y) {
        String output = "";
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

        while (y.getTeamName().equals(x.getTeamName())){
            Team z = new Team(yOffense, yDefense);
            y.setTeamName(z.getTeamName());
        }

        if (xDefense < yDefense && xOffense < yOffense) {
            winChance = 80;
        } else if ((xDefense < yDefense && xOffense > yOffense) || (xDefense > yDefense && xOffense < yOffense)){
            winChance = 40;
        }  else {
            winChance = 20;
        }
        winChance *= (1+.25/(101-(StarPlayer.getPlayerStrength())));

        if (winChance > randInt) {
            output += "W";
        } else {
            output += "L";
        }

        output += calculateScore(output, x, y);
        return output;
    }


    public static String calculateScore(String winOrLoss, Team x, Team y){
        int randScoreX;
        int randScoreY;

        int xDefense = x.getDefenseRanking();
        int xOffense = x.getOffenseRanking();
        int yDefense = y.getDefenseRanking();
        int yOffense = y.getOffenseRanking();

        boolean withinFive = (Math.abs(xOffense - yOffense) <= 5) && (Math.abs(xDefense - yDefense) <= 5);
        boolean withinTwo = (Math.abs(xOffense - yOffense) <= 2) && ((Math.abs(xDefense - yDefense) <= 2));
        if (winOrLoss.equals("W")){
            if (withinTwo){
                randScoreX = 7*(int)(Math.random() * 6 + 1) + 3*(int)(Math.random() * 3 + 1);
                randScoreY = randScoreX - 7*(int)(Math.random() * 2+ 1) - 3*(int)(Math.random() + 1);
                while (randScoreY < 0 || randScoreY == 4|| randScoreY == 1){
                    randScoreY = randScoreX - 7*(int)(Math.random() * 2+ 1) - 3*(int)(Math.random() + 1);
                }
            }
            else if (withinFive){
                randScoreX = 7*(int)(Math.random() * 6 + 1) + 3*(int)(Math.random() * 3 + 1);
                randScoreY = randScoreX - 7*(int)(Math.random() * 3 + 1) - 3*(int)(Math.random() * 2 + 1);
                while (randScoreY < 0 || randScoreY == 4|| randScoreY == 1){
                    randScoreY = randScoreX - 7*(int)(Math.random() * 2+ 1) - 3*(int)(Math.random() + 1);
                }
            }
            else{
                randScoreX = 7*(int)(Math.random() * 6 + 1) + 3*(int)(Math.random() * 3 + 1);
                randScoreY = randScoreX - 7*(int)(Math.random() * 6 + 1) - 3*(int)(Math.random() * 3 + 1);
                while (randScoreY < 0 || randScoreY == 4 || randScoreY == 1){
                    randScoreY = randScoreX - 7*(int)(Math.random() * 2+ 1) - 3*(int)(Math.random() + 1);
                }
            }
        }
        else{
            if (withinTwo){
                randScoreY = 7*(int)(Math.random() * 6 + 1) + 3*(int)(Math.random() * 3 + 1);
                randScoreX = randScoreY - 7*(int)(Math.random() * 2+ 1) - 3*(int)(Math.random() + 1);
                while (randScoreX < 0 || randScoreX == 4 || randScoreX == 1){
                    randScoreX = randScoreY - 7*(int)(Math.random() * 2+ 1) - 3*(int)(Math.random() + 1);
                }
            }
            else if (withinFive){
                randScoreY = 7*(int)(Math.random() * 6 + 1) + 3*(int)(Math.random() * 3 + 1);
                randScoreX = randScoreY - 7*(int)(Math.random() * 3 + 1) - 3*(int)(Math.random() * 2 + 1);
                while (randScoreX < 0 || randScoreX == 4 || randScoreX == 1){
                    randScoreX = randScoreY - 7*(int)(Math.random() * 2+ 1) - 3*(int)(Math.random() + 1);
                }
            }
            else{
                randScoreY = 7*(int)(Math.random() * 6 + 1) + 3*(int)(Math.random() * 3 + 1);
                randScoreX = randScoreY - 7*(int)(Math.random() * 6 + 1) - 3*(int)(Math.random() * 3 + 1);
                while (randScoreX < 0 || randScoreX == 4 || randScoreX == 1){
                    randScoreX = randScoreY - 7*(int)(Math.random() * 2+ 1) - 3*(int)(Math.random() + 1);
                }
            }
        }

        return randScoreX + "-" + randScoreY;

    }

    /**
     * Runs simulateGame 17 times and then sums up the wins/losses and win percentage
     * @param x Team object that is already initiated
     */
    public static void simulateWeeks(Team x, int weeks) { // for random teams only
        for (int i = 0; i < weeks; i++) {
            Team y = new Team();
            String gameResult = simulateGame(x, y);
            if (gameResult.charAt(0) == 'W') {
                x.setWins(x.getWins() + 1);
            }
            else{
                x.setLosses(x.getLosses() + 1);
            }
        }
    }
    public static String simulateSeason(Team x) {
        String result = "";
        String[] prevTeamNames = new String[18];
        if (yearNum == 2021){
            result += "Team: " + x.getTeamName() + " (#" + x.getOffenseRanking() + ", #" + x.getDefenseRanking() + ")\nStar Player: " + x.getTeamStarPlayer().getPlayerName()
                    + "\nPlayer Strength: " + StarPlayer.getPlayerStrength() + "\n\n";
        }
        x.setWins(0);
        x.setLosses(0);
        yearNum++;
        result += "Year: " + yearNum + "\n";

        for (int i = 1; i < 18; i++) {
            int homeOrAway = (int)(Math.random()*2);
            Team y = new Team();
            for (int j = 0; j < prevTeamNames.length-1; j++){
                if (y.getTeamName().equals(prevTeamNames[j])){
                    y = new Team();
                }
            }
            prevTeamNames[i] = y.getTeamName();
            simulateWeeks(y,i-1);
            String gameResult = simulateGame(x, y);
            String defaultPrintout = "Week " + i + ": " + gameResult.substring(1) + " (" + gameResult.charAt(0) + ") ";

            if (gameResult.charAt(0) == 'W') {
                y.setLosses(y.getLosses() + 1);
                totalWins++;
                x.setWins(x.getWins() + 1);
                String yPrintout = y.getTeamName() + " (" + y.getWins() + "-" + y.getLosses() + ")";
                String xPrintout = x.getTeamName() + " (" + x.getWins() + "-" + x.getLosses() + ")";
                if (homeOrAway == 0){
                    result += defaultPrintout + "@ " +yPrintout + "\n";
                }
                else{
                    result += defaultPrintout +  "vs " +yPrintout + "\n";
                }
            }
            else {
                y.setWins(y.getWins() + 1);
                totalLosses++;
                x.setLosses(x.getLosses() + 1);
                String yPrintout = y.getTeamName() + " (" + y.getWins() + "-" + y.getLosses() + ")";
                String xPrintout = x.getTeamName() + " (" + x.getWins() + "-" + x.getLosses() + ")";
                if (homeOrAway == 0){
                    result += defaultPrintout + "@ " +yPrintout + "\n";
                }
                else{
                    result += defaultPrintout + "vs " +yPrintout + "\n";
                }
            }

        }
        double winLossPercentage = Math.round((double)(x.getWins())/(17)*100 * 100.0) / 100.0;;
        result += "\nRecord: " + x.getWins() + "-" + x.getLosses() + " (" + winLossPercentage + "%)\n";

        //playoffs
        boolean wonSB = false;
        if (x.getWins() >= 11){
            result += "Made Playoffs!\n";
            Team y = new Team((int)(Math.random()*16+1),(int)(Math.random()*16+1));
            int iterations = 1;
            String playoffGameResult = simulateGame(x,y);
            while (iterations < 4 && playoffGameResult.charAt(0) == 'W'){
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
            perfectSeasonYear = yearNum;
        }
        return result;
    }


    /**
     * Checks the total wins/losses and win percentage through all years
      * @return Returns win loss percentage and total wins/losses
     */
    public static String franchiseLog(){
        double winLossPercentage = Math.round((double)(totalWins)/(((yearNum -2021)*17)) * 100 * 100.0) / 100.0;
        String output = "Years Played: " + (yearNum - 2021) + "\nTotal Record: " + totalWins + "-" + totalLosses + " (" + winLossPercentage + "%)"
                + "\nSuper Bowl Wins: " + SBWins;
        if (perfectSeason){
            output += "\nYOU HAD A PERFECT SEASON YEAR: " + perfectSeasonYear;
        }
        return output;
    }
    public static void main(String[] args) {
        Team bears = new Team("Bears", 1, 1, "Justin Fields", 100);
        for (int i = 0; i < 200; i++){
            System.out.println(simulateSeason(bears));
        }
        System.out.println(franchiseLog());
    }


}
