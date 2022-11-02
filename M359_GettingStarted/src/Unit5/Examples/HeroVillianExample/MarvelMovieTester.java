package Unit5.Examples.HeroVillianExample;

public class MarvelMovieTester {
    public static void main(String[] args) {
        SuperHero ironMan = new SuperHero("Iron Man", "Rich, Smart, Super suit",
                100);
        //System.out.println(ironMan);

        Villian thanos = new Villian("Thanos", "Super snap", 150);
        //System.out.println(thanos);

        epicBattle(ironMan, thanos, 20);

    }

    // IF you type /** and press enter, IntelliJ will start your JavaDoc comments for you
    // Do this AFTER you have your method header created

    /**
     * This method will replicate a battle between a hero and villian and each will
     * take on damage accordingly
     * @param hero the good guy
     * @param villian the bad guy
     */
    public static void battle(SuperHero hero, Villian villian) {
        // if hero is stronger, they have a  75% chance of winning the battle
        // the winner of the battle takes on 10% damage
        // the loser of the battle takes on 35%
        if (hero.getHeroPower().getStrength() > villian.getVillianPower().getStrength()) {
            double winChance = Math.random();
            if (winChance < .75)  {  // hero won
                // update hero strength = 0.9 * strength
                hero.updateStrengthAfterBattle(0.9);
                // update villian strength = 0.65 * strength
                villian.updateStrengthAfterBattle(.65);
            }
            else {                   //villian won
                // update villian strength = 0.9 * strength
                villian.updateStrengthAfterBattle(.9);
                // update hero strength = 0.65 * strength
                hero.updateStrengthAfterBattle(.65);
            }
        }
        else {      // hero has less strength, so they have a 25% chance of winning the battle
            double winChance = Math.random();
            if (winChance < 0.25) { // hero won
                // update hero strength = 0.9 * strength
                hero.updateStrengthAfterBattle(0.9);
                // update villian strength = 0.65 * strength
                villian.updateStrengthAfterBattle(.65);
            }
            else {                  // villian won
                // update villian strength = 0.9 * strength
                villian.updateStrengthAfterBattle(.9);
                // update hero strength = 0.65 * strength
                hero.updateStrengthAfterBattle(.65);
            }
        }


    }

    /**
     * This battle will call battle numRounds times to simulate a longrunning right
     * between good and evil
     * @param hero the SuperHero
     * @param villian the Villian
     * @param numRounds the number of times the two battle
     */

    public static void epicBattle(SuperHero hero, Villian villian, int numRounds){
        for (int i = 0; i < numRounds; i++){
            if (hero.getHeroPower().getStrength() == 0 || villian.getVillianPower().getStrength() == 0){
                System.out.println("GAMEOVER");
                break;
            }
            battle(hero, villian);
            System.out.println(hero);
            System.out.println(villian);
        }

    }



}