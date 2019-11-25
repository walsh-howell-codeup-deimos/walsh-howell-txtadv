import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class main {


   public static void main(String[] args){

       System.out.println(".___________. __    __  .______       __  ___  ___________    ____ \n" +
               "|           ||  |  |  | |   _  \\     |  |/  / |   ____\\   \\  /   / \n" +
               "`---|  |----`|  |  |  | |  |_)  |    |  '  /  |  |__   \\   \\/   /  \n" +
               "    |  |     |  |  |  | |      /     |    <   |   __|   \\_    _/   \n" +
               "    |  |     |  `--'  | |  |\\  \\----.|  .  \\  |  |____    |  |     \n" +
               "    |__|      \\______/  | _| `._____||__|\\__\\ |_______|   |__|     \n" +
               "                                                                   \n" +
               "                _______       ___   ____    ____                   \n" +
               "               |       \\     /   \\  \\   \\  /   /                   \n" +
               "               |  .--.  |   /  ^  \\  \\   \\/   /                    \n" +
               "               |  |  |  |  /  /_\\  \\  \\_    _/                     \n" +
               "               |  '--'  | /  _____  \\   |  |                       \n" +
               "               |_______/ /__/     \\__\\  |__|                       \n" +
               "                                                 ");
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

       System.out.printf("Upon awaking on Thanksgiving Morning, content and happy, our hero descends to their kitchen ready to begin cooking for the greatest of holidays - Thanksgiving.%nThe fridge looms on the other side of the room with a curious condition - the fridge door is open!%nRunning to the door, you open it to find a written note.%n\"To whom it may concern:%nGreetings from the Turkey Goblin! I have taken your foul ingredients and those of your neighbors to bolster my evil Turkey Army.%nIf you wish to test your mettle, meet me at my new headquarters, HEB, if you dare!%nYour truly,%nthe Turkey Goblin\"%n");
       System.out.printf("Choose your hero for this task: You are%n1. David, the Warrior.%n2. Fer, the Mage.%n3. Sophie, the Rogue.%n");
        int charnchoice = sc.nextInt();
       boolean charconfirm = false;
        sc.nextLine();
       String selectedchamp = "";
       while (!charconfirm) {
           if (charnchoice == 1) {
               System.out.printf("David, a stout young warrior, gets bonuses to health and a stronger defense stat. You'll have 100 health, +10 to your attack, and +10 to your defense!%n");
               System.out.println("\n" +
                       "\n" +
                       "                  (\\    /)\n" +
                       "                  |_)//(_|\n" +
                       "                  |4\\_/4)(\n" +
                       "                 '( (_  -)D\n" +
                       "                   ) _)  /\\,__\n" +
                       "                 _,\\_._,/ /   `)\n" +
                       "    \\.,_,,      ( _   ~ .   ,   \\\n" +
                       "     \\   (\\      \\(   \\/  _)(    )\n" +
                       "      \\   \\\\      )). _______>-. `*\n" +
                       "       \\  /\\\\    _'( /   /\\  '\\  _)\n" +
                       "        \\( ,\\\\.-'  '/    \\/    \\/\n" +
                       "         '  \\><)_'.)|/\\/\\/\\/\\/\\|\n" +
                       "              \\) ,( |\\/\\/\\/\\/\\/|\n" +
                       "              ' ((  \\    /\\    /\n" +
                       "               ((((  \\___\\/___/)\n" +
                       "                ((,) /   ((()   )\n" +
                       "                 \"..-,  (()(\"   /\n" +
                       "                  _//.   ((() .\"\n" +
                       "          _____ //,/\" ___ ((( ', ___\n" +
                       "                           ((  )\n" +
                       "                            / /\n" +
                       "                          _/,/'\n" +
                       "                        /,/,\"\n" +
                       " ");
                selectedchamp = "David";
                heroHealth = 100;
                heroAttack = 10;
                heroDefense = 10;
           } else if (charnchoice == 2) {
               System.out.printf("Fer, an intellectual and wise mage who casts spells in the Java language, gets bonuses to using his attack modifier to boost use of items. You'll have 80 health and all items get +10 to their use!%n");
               System.out.println("                       .\n" +
                       "\n" +
                       "                        .\n" +
                       "              /^\\     .\n" +
                       "         /\\   \"V\"\n" +
                       "        /__\\   I      O  o\n" +
                       "       //..\\\\  I     .\n" +
                       "       \\].`[/  I\n" +
                       "       /l\\/j\\  (]    .  O\n" +
                       "      /. ~~ ,\\/I          .\n" +
                       "      \\\\L__j^\\/I       o\n" +
                       "       \\/--v}  I     o   .\n" +
                       "       |    |  I   _________\n" +
                       "       |    |  I c(`       ')o\n" +
                       "       |    l  I   \\.     ,/\n" +
                       "     _/j  L l\\_!  _//^---^\\\\_   \n" +
                       "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
               selectedchamp = "Fer";
               heroHealth = 80;
               heroAttack = 10;
               heroDefense = 5;
           } else if (charnchoice == 3) {
               System.out.printf("Sophie, a cunning rogue, gets bonuses to her attack. You'll start with 75 health and all attack commands gain +15 during combat!%n");
               System.out.println("      ___                                                             \n" +
                       "     /___\\_/                                                          \n" +
                       "     |\\_/|<\\                                                          \n" +
                       "     (`o`) `   __(\\_            |\\_                                   \n" +
                       "     \\ ~ /_.-`` _|__)  ( ( ( ( /()/                                   \n" +
                       "    _/`-`  _.-``               `\\|                                    \n" +
                       " .-`      (    .-.                                                    \n" +
                       "(   .-     \\  /   `-._                                                \n" +
                       " \\  (\\_    /\\/        `-.__-()                                        \n" +
                       "  `-|__)__/ /  /``-.   /_____8                                        \n" +
                       "        \\__/  /     `-`                                               \n" +
                       "       />|   /                                                        \n" +
                       "      /| J   L                                                        \n" +
                       "      `` |   |                                                        \n" +
                       "         L___J                                                        \n" +
                       "          ( |                                                         \n" +
                       "         .oO()                       ");
               selectedchamp = "Sophie";
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
               sc.nextLine();
           }
       };

//       first encounter/introduction - goes into them entering store, some kind of narrative encounters first mob
       System.out.printf("%s gathers their items quickly - time is wasting and Thanksgiving needs to get underway! Jumping in their trusty vehicle, a Tesla Cybertruck, %s speeds down to HEB.%nThe parking lot is empty with scattered boxes of turkeys throughout the lot - what could it mean?%nSteeling their nerves, %s heads inside the door.%n%n", selectedchamp, selectedchamp, selectedchamp);

       System.out.printf("%s walks through the door and takes in the scene.%nSeveral lights flicker overhead, out of operation, and the PA system plays a loop of \"Never Gonna Give You Up\" by Rick Astley.%nImmediately, %s hears a growl from the produce section to the right.%nUpon looking over, a purple and red amorphous blob shakes and forms until it is the size of a Volkswagen Beetle - that's unusual.%nThe Cranberry Cretin slimes its way over!%n", selectedchamp, selectedchamp);
       System.out.println("     __\n" +
               "    (__)\n" +
               "  _(_)(_)_\n" +
               " (__)(____)  \n" +
               "(__)(_)(___)");

       fightInterface(heroHealth, enemyHealth, heroAttack, heroDefense, selectedchamp);

       System.out.printf("%s looks in disgust at the large pile of cranberry sauce as it loses shape and oozes back all over the floor of the produce section - sticky.%nThe music suddenly stops, and a voice comes over the line.%n\"So you've come.\" The voice says with a brief pause before continuing on emphasizing every word spoken with immense hate, \"So, you've come to die.\"%n\"Turkey Goblin!\" %s yells, \"Where are all my ingredients?! I don't got TIME for this today!\"%n\"Oh?\" The voice responds from the speakers above.\"That's too bad, because I don't need much more time for my Turkeylings to be complete.\"%n", selectedchamp, selectedchamp);

       System.out.printf("%s runs towards the rear, looking down aisles as they pass by - where is this Turkey Goblin?%nA roar erupts from Aisle 12 - Potatoes, Canned Goods, and more. Suspicious.%nIntrigued, %s turns into Aisle 12 and sees a bubbling mass of mashed potatoes stacking into the shape of a short warrior. It's the Malicious Mashed Potato Gnoll!%n", selectedchamp, selectedchamp);
       System.out.println("             ,      ,\n" +
               "            /(.-\"\"-.)\\\n" +
               "        |\\  \\/      \\/  /|\n" +
               "        | \\ / =.  .= \\ / |\n" +
               "        \\( \\   o\\/o   / )/\n" +
               "         \\_, '-/  \\-' ,_/\n" +
               "           /   \\__/   \\\n" +
               "           \\ \\__/\\__/ /\n" +
               "         ___\\ \\|--|/ /___\n" +
               "       /`    \\      /    `\\\n" +
               "      /       '----'       \\");
       enemyHealth = 100;

       fightInterface(heroHealth, enemyHealth, heroAttack, heroDefense, selectedchamp);
       System.out.printf("The Malicious Mashed Potato Gnoll screams suddenly - %s realizes what is going on and ducks behind a display for apple pies.%nAs %s ducks, the gnoll explodes sending boiling gravy throughout the aisle. That was close!%n", selectedchamp, selectedchamp);

       System.out.printf("\"Enough.\" The voice comes on again over the PA system. \"That is enough.\"%n%s looks around and readies for a surprise attack. Instead, the voice offers \"Why don't we do this? Come and find me in the frozen food section and see how you stand up against me.\"%n%s nods and internally prepares for the fight - time to take back this Thanksgiving! %s runs immediately to the frozen food section.%nTurning the corner, a large bird rears up as %s approaches. It smells terrible and leaves a trail of stuffing behind as it shuffles and ambles towards %s.%nHere it is: THE TURKEY GOBLIN.%n", selectedchamp, selectedchamp, selectedchamp, selectedchamp, selectedchamp);
       System.out.println("\n" +
               "                             ,+*^^*+___+++_\n" +
               "                       ,*^^^^              )\n" +
               "                    _+*                     ^**+_\n" +
               "                  +^       _ _++*+_+++_,         )\n" +
               "      _+^^*+_    (     ,+*^ ^          \\+_        )\n" +
               "     {       )  (    ,(    ,_+--+--,      ^)      ^\\\n" +
               "    { (@)    } f   ,(  ,+-^ __*_*_  ^^\\_   ^\\       )\n" +
               "   {:;-/    (_+*-+^^^^^+*+*<_ _++_)_    )    )      /\n" +
               "  ( /  (    (        ,___    ^*+_+* )   <    <      \\\n" +
               "   U _/     )    *--<  ) ^\\-----++__)   )    )       )\n" +
               "    (      )  _(^)^^))  )  )\\^^^^^))^*+/    /       /\n" +
               "  (      /  (_))_^)) )  )  ))^^^^^))^^^)__/     +^^\n" +
               " (     ,/    (^))^))  )  ) ))^^^^^^^))^^)       _)\n" +
               "  *+__+*       (_))^)  ) ) ))^^^^^^))^^^^^)____*^\n" +
               "  \\             \\_)^)_)) ))^^^^^^^^^^))^^^^)\n" +
               "   (_             ^\\__^^^^^^^^^^^^))^^^^^^^)\n" +
               "     ^\\___            ^\\__^^^^^^))^^^^^^^^)\\\\           \n" +
               "          ^^^^^\\uuu/^^\\uuu/^^^^\\^\\^\\^\\^\\^\\^\\^\\          \n" +
               "             ___) >____) >___   ^\\_\\_\\_\\_\\_\\_\\)         \n" +
               "            ^^^//\\\\_^^//\\\\_^       ^(\\_\\_\\_\\)");
       enemyHealth = 200;

       fightInterface(heroHealth, enemyHealth, heroAttack, heroDefense, selectedchamp);

       System.out.printf("With %s's final attack, the Turkey Goblin slumps back onto its decaying feathered butt. \"Impossible. There's no mortal that could thwart my efforts. . who are you?\"%n\"Me? I'm %s, and I just saved Thanksgiving\" %s says, running forward and kicking the Turkey Goblin directly in his chest. The Turkey Goblin screams and falls backwards into an open freezer, immediately becoming a turkey popsicle.%n%s notices on the floor a large bundle - the ingredients!%nGrabbing the satchel, %s heads out of HEB as \"All Star\" by Smash Mouth comes over the PA.%nThe day is saved.", selectedchamp, selectedchamp, selectedchamp, selectedchamp, selectedchamp);

       System.out.println(".___________. __    __  .______       __  ___  ___________    ____ \n" +
               "|           ||  |  |  | |   _  \\     |  |/  / |   ____\\   \\  /   / \n" +
               "`---|  |----`|  |  |  | |  |_)  |    |  '  /  |  |__   \\   \\/   /  \n" +
               "    |  |     |  |  |  | |      /     |    <   |   __|   \\_    _/   \n" +
               "    |  |     |  `--'  | |  |\\  \\----.|  .  \\  |  |____    |  |     \n" +
               "    |__|      \\______/  | _| `._____||__|\\__\\ |_______|   |__|     \n" +
               "                                                                   \n" +
               "                _______       ___   ____    ____                   \n" +
               "               |       \\     /   \\  \\   \\  /   /                   \n" +
               "               |  .--.  |   /  ^  \\  \\   \\/   /                    \n" +
               "               |  |  |  |  /  /_\\  \\  \\_    _/                     \n" +
               "               |  '--'  | /  _____  \\   |  |                       \n" +
               "               |_______/ /__/     \\__\\  |__|                       \n" +
               "                                                 \n" +
               "                       THANKS FOR PLAYING!!");







   }
// hardcoded? Attack Item, Health item, Defense item??

    public static void fightInterface(int heroHealth, int enemyHealth, int heroAttack, int heroDefense, String selectedchamp) {
        Scanner sc = new Scanner(System.in);
        Random diceroll = new Random();
//        System.out.println(diceroll.nextInt(12) + 1);
        while (heroHealth > 0 && enemyHealth > 0){
            System.out.printf("%s encounters an enemy - what do you do?%n1. Attack.%n2. Defend.%n3. Item.%n4. Run%n", selectedchamp);
            int move = sc.nextInt();
            int heroattackvalue = diceroll.nextInt(12)+100;
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
                System.out.printf("Your usable items are:%n1. Your shopping cart (20 atk to your enemy).%n2. A free sample you found nearby (+15 Health).%n3. Hand sanitizer station nearby. (+2 defense for rest of fight)%n");
                int item = sc.nextInt();
                if (item == 1) {
                    System.out.printf("%s lunges forward with the shopping cart and runs over the enemy's foot!%nIt connects for 20 damage.%n", selectedchamp);
                    enemyHealth -= 20;
                    System.out.printf("The enemy now has %d HP left!%n", enemyHealth);
                } else if (item == 2){
                    System.out.printf("%s eats a tasty treat - delicious!%nYour health is healed for 15 HP, and you're ready to fight harder!%n", selectedchamp);
                    heroHealth += 10;
                    System.out.printf("%s now has %d HP!%n", selectedchamp, heroHealth);
                } else if (item == 3) {
                    System.out.printf("This entire store is pretty gross - %s squeezes some hand sanitizer on their hands for a permanent +2 to defense!%n", selectedchamp);
                    heroDefense += 2;
                    System.out.printf("%d is your new defense stat for the rest of the fight!%n", heroDefense);
                };
            } else if (move == 4){
                System.out.printf("You try to run but there is no escape!%n");
            }


        }
    }


}
