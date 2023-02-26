package Unit9;

public class TeamAthlete extends Athlete{
    private String teamName;
    private String sport;

    public TeamAthlete(String teamName, String sport, String name, int age){
        super(name, age);
        this.teamName = teamName;
        this.sport = sport;
    }

    public void setTeamName(String teamName){
        this.teamName = teamName;
    }

    public void setSport(String sport){
        this.sport = sport;
    }

    public String getTeamName(){
        return teamName;
    }

    public String getSport(){
        return sport;
    }
}
