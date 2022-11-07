package Unit5.Examples.HeroVillianExample;

public class SuperHero {
    private String heroName;
    private Power heroPower;
    // This static value needs to be initialized to 0 so that we can update
    // it each time we create a new hero
    private static int numHeroes = 0;
    private static int totalHeroStrength = 0;

    public SuperHero(String heroName, Power heroPower) {
        this.heroName = heroName;
        this.heroPower = heroPower; // this copies the reference to an already created
        // Power object.
        numHeroes++;
        totalHeroStrength += heroPower.getStrength();
    }

    public SuperHero(String heroName, String powerName, int powerStrength) {
        this.heroName = heroName;
        this.heroPower = new Power(powerName, powerStrength);
        // here we create a new Power object with the passed in name and strength
        numHeroes++;
        totalHeroStrength += heroPower.getStrength();
    }

    public void updateStrengthAfterBattle(double percent) {
        // need to figure out how much to subtract from totalHeroStrength BEFORE
        // we call setStrength
        int x = (int)((1-percent) * heroPower.getStrength());
        totalHeroStrength -= x;

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

    // because this method is static, it will be called by className.methodName
    // SuperHero.getNumHeroes();
    public static int getNumHeroes() {
        return numHeroes;
    }

    public static int getTotalHeroStrength(){
        return totalHeroStrength;
    }
}