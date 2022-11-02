package Unit5.PartnerLab;

public class SimulateSeason {
    public boolean simulateGame(Team x){ // add win counter method that sums all trues and falses and adds together wins and losses
        Team y = new Team(); // random team
        double winChance = 0;
        int randInt = (int)(Math.random()*100+1);
        while (x.getDefenseRanking() == y.getDefenseRanking() || y.getOffenseRanking() == x.getOffenseRanking()){
            y = new Team();
        }

        if (x.getDefenseRanking() > y.getDefenseRanking() && x.getOffenseRanking() > y.getOffenseRanking()){
            winChance = 80;
        }
        else if (x.getDefenseRanking() < y.getDefenseRanking() && x.getOffenseRanking() > y.getOffenseRanking()){
            winChance = 50;
        }
        else if (x.getDefenseRanking() > y.getDefenseRanking() && x.getOffenseRanking() < y.getOffenseRanking()){
            winChance = 50;
        }
        else {
            winChance = 20;
        }

        if (winChance > randInt){
            return true;
        }
        else{
            return false;
        }
    }
}
