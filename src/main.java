import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class main {


   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
//       Random diceroll = new Random();
//       System.out.println(diceroll.nextInt(12) + 1);

//       david = warrior, high def = -10
//       fer = cleric/mageish, high item use +10 to item rolls
//       sophie = rogue high atk, atk +10
       int heroHealth = 0;
       int heroAttack = 0;
       int heroDefense = 0;
       int enemyHealth = 50;


       System.out.println("Filler text for story leading up to character selection. Description of heroes: 1, 2, or 3");
        int charnchoice = sc.nextInt();
       boolean charconfirm = false;
        sc.nextLine();
       String selectedchamp = "";
       while (!charconfirm) {
           if (charnchoice == 1) {
               System.out.println("This is working one");
                selectedchamp = "David, the warrior";
                heroHealth = 100;
                heroAttack = 10;
                heroDefense = 10;
           } else if (charnchoice == 2) {
               System.out.println("This is working two");
               selectedchamp = "Fer, the mage";
               heroHealth = 80;
               heroAttack = 10;
               heroDefense = 5;
           } else if (charnchoice == 3) {
               System.out.println("This is working three");
               selectedchamp = "Sophie, the rogue";
               heroHealth = 75;
               heroAttack = 15;
               heroDefense = 5;
           };

           //           validate 1-3 selected later



           System.out.println("Are you satisfied with your choice of champion? Y/N");
          String charchoiceokay = sc.nextLine();

           if (charchoiceokay.equalsIgnoreCase("y")){
               charconfirm = true;
               System.out.printf("You have selected %s! Your champion has %d HP, %d attack bonus, and %d defense bonus. Good luck on your quest!%n", selectedchamp, heroHealth, heroAttack, heroDefense);


           } else {
               System.out.println("Which warrior would you like to choose, then?");
               charnchoice = sc.nextInt();
               System.out.println(selectedchamp);
               sc.nextLine();
           }
       };

//       first encounter/introduction - goes into them entering store, some kind of narrative encounters first mob

       System.out.printf("%s first encounter text: starts first fight text%n", selectedchamp);


    fightInterface(heroHealth, enemyHealth, heroAttack, heroDefense, selectedchamp);



    }


    public static void fightInterface(int heroHealth, int enemyHealth, int heroAttack, int heroDefense, String selectedchamp) {
        Scanner sc = new Scanner(System.in);
        Random diceroll = new Random();
//        System.out.println(diceroll.nextInt(12) + 1);
        while (heroHealth > 0 && enemyHealth > 0){
            System.out.printf("%s encounters an enemy - what do you do?%n1. Attack.%n2. Defend.%n3. Item.%n4. Run%n", selectedchamp);
            int move = sc.nextInt();
            int heroattackvalue = diceroll.nextInt(12)+1;
            int herodefendvalue = diceroll.nextInt(heroDefense)+1;
            int enemyattackvalue = diceroll.nextInt(12) + 1;
            if (move == 1){
                enemyHealth -= heroattackvalue + heroAttack;
                heroHealth -= enemyattackvalue;
                System.out.printf("%s attacks and strikes for %d with a bonus of %d!%nThe enemy has %d HP left.%n You're struck for %d and have %d HP left!%n", selectedchamp, heroattackvalue, heroAttack, enemyHealth, enemyattackvalue, heroHealth);
            } else if (move == 2){
                if (herodefendvalue > enemyattackvalue) {
                  System.out.printf("%s defends perfectly taking no damage!%n", selectedchamp);
                } else {
                    heroHealth -= enemyattackvalue - herodefendvalue;
                    System.out.printf("%s defends! The enemy strikes for %d, but %s stands firm and blocks %d damage.%n%s looks down at their wounds and notices %d HP left.%n", selectedchamp, enemyattackvalue, selectedchamp, herodefendvalue, selectedchamp, heroHealth);
                }
            } else if (move == 3){
                System.out.println("itemlogic/loophere");
            } else if (move == 4){
                System.out.printf("You try to run but there is no escape!%n");
            }


        }
    }


}
