package Unit5.Examples.HeroVillianExample;

public class SuperHero {
    private String heroName;
    private Power heroPower;

    public SuperHero(String heroName, Power heroPower) {
        this.heroName = heroName;
        this.heroPower = heroPower; // this copies the reference to an already created
        // Power object.
    }

    public SuperHero(String heroName, String powerName, int powerStrength) {
        this.heroName = heroName;
        this.heroPower = new Power(powerName, powerStrength);
        // here we create a new Power object with the passed in name and strength
    }

    public void updateStrengthAfterBattle(double percent) {
        heroPower.setStrength((int)(percent * heroPower.getStrength()));
    }

    public String toString() {
        String str = "This Super Hero is named: " + heroName + "\n";
        if (heroPower != null) {
            str += heroPower.toString();    // this calls the toString and adds the returned
            // String from Power class to this string we are
            // building up here inside SuperHero class
        }
        return str;
    }





    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public Power getHeroPower() {
        return heroPower;
    }

    public void setHeroPower(Power heroPower) {
        this.heroPower = heroPower;
    }
}