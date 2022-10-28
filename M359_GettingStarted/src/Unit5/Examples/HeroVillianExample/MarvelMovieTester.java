package Unit5.Examples.HeroVillianExample;

public class MarvelMovieTester {
    public static void main(String[] args) {
        SuperHero ironMan = new SuperHero("Iron Man", "Rich, Smart, Super suit", 100);
        System.out.println(ironMan);

        System.out.println(ironMan);

        Villian thanos = new Villian("Thanos", "Super snap", 150);
        System.out.println(thanos);
    }

    // If you type /** and press enter, IntelliJ will start your JavaDoc comments for you
    // Do this AFTER you have your method header created

    /**
     * This method will replicate a battle between a hero and a villian.
     * take on damage accordingly
     * @param hero
     * @param villian
     */
    public static void battle(SuperHero hero, Villian villian){
        // if the hero is stronger, they have a 75% chance of winning the battle
        // the winner of the battle takes on 10% damage
        // the loser of the battle takes on 35% damage
        if (hero.getHeroPower().getPowerStrength() > villian.getVillianPower().getPowerStrength()){
            double winChance = Math.random();
            if (winChance < .75){ //hero wins
                // update hero strength = .9 * strength
                hero.updateStrengthAfterBattle(0.9);
                // update villian strength = .65 * strength
            }
            else { //villian wins
                // update villian strength = .9 * strength
                // update hero strength = .65 * strength
            }
        }
        else { // hero has less strength //hero has less strength, so they have a 25% chance of winning the battle
            double winChance = Math.random();
            if (winChance < .25){ // hero win

            }
            else { // villian win

            }
        }

    }

}
