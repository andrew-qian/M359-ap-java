package Unit5.PartnerLab;

public class SimulateSeason {
    private static int totalWinsTeamOne = 0;
    private static int totalLossesTeamOne = 0;

    private static int totalWinsTeamTwo = 0;
    private static int totalLossesTeamTwo = 0;

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
        if (x.getTeamStarPlayer() != null){
            winChance *= (1+.25/(101-(x.getTeamStarPlayer().getPlayerStrength())));
        }


        if (winChance > randInt) {
            output += "W";
        } else {
            output += "L";
        }

        output += calculateScore(output, x, y);
        return output;
    }

    public static int randomScore(int x, int y){
        return 7*(int)(Math.random() * x + 1) + 3*(int)(Math.random() * y + 1);
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
            randScoreX = randomScore(6,3);
            if (withinTwo){

                randScoreY = randScoreX - randomScore(2,1);
                while (randScoreY < 0 || randScoreY == 4|| randScoreY == 1){
                    randScoreY = randScoreX - randomScore(2,1);;
                }
            }
            else if (withinFive){
                randScoreY = randScoreX - randomScore(3,2);
                while (randScoreY < 0 || randScoreY == 4|| randScoreY == 1){
                    randScoreY = randScoreX - randomScore(3,2);
                }
            }
            else{
                randScoreY = randScoreX - randomScore(6,3);
                while (randScoreY < 0 || randScoreY == 4 || randScoreY == 1){
                    randScoreY = randScoreX - randomScore(6,3);
                }
            }
        }
        else{
            randScoreY = randomScore(6,3);
            if (withinTwo){
                randScoreX = randScoreY - randomScore(2,1);
                while (randScoreX < 0 || randScoreX == 4 || randScoreX == 1){
                    randScoreX = randScoreY - randomScore(2,1);
                }
            }
            else if (withinFive){
                randScoreX = randScoreY - randomScore(3,2);
                while (randScoreX < 0 || randScoreX == 4 || randScoreX == 1){
                    randScoreX = randScoreY - randomScore(3,2);
                }
            }
            else{
                randScoreX = randScoreY - randomScore(6,3);
                while (randScoreX < 0 || randScoreX == 4 || randScoreX == 1){
                    randScoreX = randScoreY - randomScore(6,3);
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

    public static String simulateSeason(Team x, Team x2) { // add another usage of a Team object
        String result = "";
        String[] prevTeamNames = new String[34];
        prevTeamNames[0] = x.getTeamName();
        prevTeamNames[1] = x2.getTeamName();

        if (yearNum == 2021){
            result += "Team: " + x.getTeamName() + " (#" + x.getOffenseRanking() + ", #" + x.getDefenseRanking() + ")\nStar Player: " + x.getTeamStarPlayer().getPlayerName()
                    + "\nPlayer Strength: " + x.getTeamStarPlayer().getPlayerStrength() + "\n\n";
        }

        x.setWins(0);
        x.setLosses(0);
        yearNum++;
        result += "Year: " + yearNum + "\n";
        String thanksgivingGameResult = simulateGame(x, x2);
        String thanksgivingGameResultOpposite = "";
        if (thanksgivingGameResult.charAt(0) == 'W'){
            thanksgivingGameResultOpposite = "L" + thanksgivingGameResult.substring(1);
            for (int i = 1; i < thanksgivingGameResultOpposite.length(); i++){
                if (thanksgivingGameResultOpposite.charAt(i) == '-'){
                    thanksgivingGameResultOpposite = thanksgivingGameResultOpposite.charAt(0) + thanksgivingGameResultOpposite.substring(i+1) + "-" + thanksgivingGameResultOpposite.substring(1,i);
                }
            }
        }
        else{
            thanksgivingGameResultOpposite = "W" + thanksgivingGameResult.substring(1);
            for (int i = 1; i < thanksgivingGameResultOpposite.length(); i++){
                if (thanksgivingGameResultOpposite.charAt(i) == '-'){
                    thanksgivingGameResultOpposite = thanksgivingGameResultOpposite.charAt(0) + thanksgivingGameResultOpposite.substring(i+1) + "-" + thanksgivingGameResultOpposite.substring(1,i);
                }
            }

        }

        for (int i = 1; i < 17; i++) {
            if (i == 12) {
                int homeOrAway = (int) (Math.random() * 2);
                String gameResult = thanksgivingGameResult;
                String defaultPrintout = "Week " + i + ": " + gameResult.substring(1) + " (" + gameResult.charAt(0) + ") ";

                if (gameResult.charAt(0) == 'W') {
                    x2.setLosses(x2.getLosses() + 1);
                    totalWinsTeamOne++;
                    x.setRivalryWins(x.getRivalryWins()+1);
                    String yPrintout = x2.getTeamName() + " (" + x2.getWins() + "-" + x2.getLosses() + ")";
                    if (homeOrAway == 0) {
                        result += defaultPrintout + "@ " + yPrintout + "\n";
                    } else {
                        result += defaultPrintout + "vs " + yPrintout + "\n";
                    }

                } else {
                    x2.setWins(x2.getWins() + 1);
                    x2.setRivalryWins(x2.getRivalryWins()+1);
                    totalLossesTeamOne++;
                    String yPrintout = x2.getTeamName() + " (" + x2.getWins() + "-" + x2.getLosses() + ")";
                    if (homeOrAway == 0) {
                        result += defaultPrintout + "@ " + yPrintout + "\n";
                    } else {
                        result += defaultPrintout + "vs " + yPrintout + "\n";
                    }
                }
                x.setRivalryRecord(x,x2);
            }

            else {
                int homeOrAway = (int) (Math.random() * 2);
                Team y = new Team();

                for (int j = 0; j < prevTeamNames.length - 1; j++) { // code to cancel out duplicate names
                    while (y.getTeamName().equals(prevTeamNames[j])) {
                        y = new Team();
                        j = 0;
                    }
                }
                prevTeamNames[i+1] = y.getTeamName();

                simulateWeeks(y, i - 1);

                String gameResult = simulateGame(x, y);
                String defaultPrintout = "Week " + i + ": " + gameResult.substring(1) + " (" + gameResult.charAt(0) + ") ";

                if (gameResult.charAt(0) == 'W') {
                    y.setLosses(y.getLosses() + 1);
                    totalWinsTeamOne++;
                    x.setWins(x.getWins() + 1);
                    String yPrintout = y.getTeamName() + " (" + y.getWins() + "-" + y.getLosses() + ")";
                    if (homeOrAway == 0) {
                        result += defaultPrintout + "@ " + yPrintout + "\n";
                    } else {
                        result += defaultPrintout + "vs " + yPrintout + "\n";
                    }
                } else {
                    y.setWins(y.getWins() + 1);
                    totalLossesTeamOne++;
                    x.setLosses(x.getLosses() + 1);
                    String yPrintout = y.getTeamName() + " (" + y.getWins() + "-" + y.getLosses() + ")";
                    if (homeOrAway == 0) {
                        result += defaultPrintout + "@ " + yPrintout + "\n";
                    } else {
                        result += defaultPrintout + "vs " + yPrintout + "\n";
                    }

                }
            }
        }

        for (int i = 1; i < 17; i++) { // prints out both L or both W for both teams, fix
            if (i == 12) {
                int homeOrAway = (int) (Math.random() * 2);
                String gameResult = thanksgivingGameResultOpposite;
                String defaultPrintout = "Week " + i + ": " + gameResult.substring(1) + " (" + gameResult.charAt(0) + ") ";

                if (gameResult.charAt(0) == 'W') {
                    x.setLosses(x.getLosses() + 1);
                    totalWinsTeamTwo++;
                    x2.setWins(x2.getWins() + 1);
                    String yPrintout = x.getTeamName() + " (" + x.getWins() + "-" + x.getLosses() + ")";
                    if (homeOrAway == 0) {
                        result += defaultPrintout + "@ " + yPrintout + "\n";
                    } else {
                        result += defaultPrintout + "vs " + yPrintout + "\n";
                    }
                } else {
                    x.setWins(x.getWins() + 1);
                    totalLossesTeamTwo++;
                    x2.setLosses(x2.getLosses() + 1);
                    String yPrintout = x.getTeamName() + " (" + x.getWins() + "-" + x.getLosses() + ")";
                    if (homeOrAway == 0) {
                        result += defaultPrintout + "@ " + yPrintout + "\n";
                    } else {
                        result += defaultPrintout + "vs " + yPrintout + "\n";
                    }
                }
            }

            else {
                int homeOrAway = (int) (Math.random() * 2);
                Team y = new Team();

                for (int j = 0; j < prevTeamNames.length - 1; j++) { // code to cancel out duplicate names
                    while (y.getTeamName().equals(prevTeamNames[j])) {
                        y = new Team();
                        j = 0;
                    }
                }
                prevTeamNames[i+16] = y.getTeamName();

                simulateWeeks(y, i - 1);

                String gameResult = simulateGame(x2, y);
                String defaultPrintout = "Week " + i + ": " + gameResult.substring(1) + " (" + gameResult.charAt(0) + ") ";

                if (gameResult.charAt(0) == 'W') {
                    y.setLosses(y.getLosses() + 1);
                    totalWinsTeamTwo++;
                    x2.setWins(x2.getWins() + 1);
                    String yPrintout = y.getTeamName() + " (" + y.getWins() + "-" + y.getLosses() + ")";
                    if (homeOrAway == 0) {
                        result += defaultPrintout + "@ " + yPrintout + "\n";
                    } else {
                        result += defaultPrintout + "vs " + yPrintout + "\n";
                    }
                } else {
                    y.setWins(y.getWins() + 1);
                    totalLossesTeamTwo++;
                    x2.setLosses(x2.getLosses() + 1);
                    String yPrintout = y.getTeamName() + " (" + y.getWins() + "-" + y.getLosses() + ")";
                    if (homeOrAway == 0) {
                        result += defaultPrintout + "@ " + yPrintout + "\n";
                    } else {
                        result += defaultPrintout + "vs " + yPrintout + "\n";
                    }

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
        result += Team.getRivalryRecord();
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
        Team bears = new Team("Bears", 12, 11, "Justin Fields", 85);
        Team lions = new Team("Lions", 16, 31, "Amon Ra St. Brown", 50);
        for (int i = 0; i < 1; i++){
            System.out.println(simulateSeason(bears, lions));
        }
        System.out.println(franchiseLog());
    }


}
