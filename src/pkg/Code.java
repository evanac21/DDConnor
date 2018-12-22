package pkg;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*Created by Evan Carter on 12/21/2018
    Game idea created by: Connor Steele
    NOT TO BE USED FOR COMMERCIAL USE

    Documentation link: https://bit.ly/2PVaxuu
 */
public class Code {

    Scanner in = new Scanner(System.in);
    private String perkFirst, perkSec, perkThir, perkFour;
    private int perkNum1, perkNum2, perkNum3, perkNum4, spinAmnt, hp;
    String[] inv = new String[3];
    String[] weapons = new String[3];
    public void init() throws InterruptedException {
        System.out.println("__________________________________________________");
        System.out.println("| Welcome to DDConnor a simplistic Java D&D clone|");
        System.out.println("| Made by: Evan Carter                           |");
        System.out.println("| Please select a below option:                  |");
        System.out.println("|   1. Start a game                              |");
        System.out.println("|   2. DEBUG                                     |");
        System.out.println("|   3. Exit                                      |");
        System.out.println("|________________________________________________|");
        int ans = in.nextInt();
        switch(ans) {
            case 1:
                //Calls start method
                startWeapInven();
                startGame();
                break;
            case 2:
                spin();
                System.out.println(spinAmnt);
                //Reserved for debug and eventual settings page...
                break;
            case 3:
                System.out.println("Are you sure(y/n)?");
                String exitAns = in.next();
                    if(exitAns.equalsIgnoreCase("y")) {
                        System.out.println("Goodbye!!!");
                        Thread.sleep(1000);
                        System.exit(0);
                    }else if(exitAns.equalsIgnoreCase("n")) {
                        init();
                    }
                break;
        }
    }private void startGame() throws InterruptedException {
        System.out.println("Select your first perk: ");
        perkFirst = in.nextLine();
        perkFirst = in.nextLine();
        System.out.println("Select your second perk: ");
        perkSec = in.nextLine();
        System.out.println("Select your third perk: ");
        perkThir = in.nextLine();
        System.out.println("Select your fourth (and final) perk: ");
        perkFour = in.nextLine();
        System.out.println("Well now that that's over we'll go over your setup");
        Thread.sleep(1000);
        drawPerkBoard();
        invenDraw();
            storyPart1();
       }
       //STORY CODE FROM HERE TIL END MARKER
        private void storyPart1() {
            System.out.println("You mosey into a small town called Dirt, you've been told of a gunslinger named Deadeye");
            System.out.println("Deadeye has a $10,000 bounty on his head");
            System.out.println("What do you do? (Pub, Sheriff, Gunsmith, Horse Parlor)");
            String firstMove = in.nextLine();
            if(firstMove.equalsIgnoreCase("pub")) {
                System.out.println("You notice a whole bunch of people walking towards you as you enter the pub");
                System.out.println("They grab you and throw you too the ground, What do you do? (fight, run)?");
                String ans1 = in.nextLine();
                if(ans1.equalsIgnoreCase("fight")) {
                    spin();
                    System.out.println("You spun a: " + spinAmnt);
                    if(spinAmnt < 5) {
                        System.out.println("Failure!");
                        System.out.println("You lost 2 HP");
                        hp-=2;
                    }else if(spinAmnt > 5) {
                        System.out.println("Success!");
                    }
                }else if(ans1.equalsIgnoreCase("run")) {

                }else{
                    System.out.println("Invalid Input!");
                }
            }else if(firstMove.equalsIgnoreCase("sheriff")) {

            }else if(firstMove.equalsIgnoreCase("gunsmith")) {

            }else if(firstMove.equalsIgnoreCase("horse parlor")) {

            }else {
                System.out.println("Not a valid input!");
            }
        }

       private void storyPart2() {

       }
       //END OF STORY CODE
       private void drawPerkBoard() {
        cls();
        System.out.println("______________________");
        System.out.println(perkFirst + ": " + perkNum1);
        System.out.println(perkSec + ": " + perkNum2);
        System.out.println(perkThir + ": " + perkNum3);
        System.out.println(perkFour + ": " + perkNum4);
        System.out.println("______________________");
        }

        private void cls() {
            for(int i = 0; i<=20; i++){System.out.println("                               ");}
        }

        private void invenDraw() throws InterruptedException {
        System.out.println("Inventory: ");
            for(int q=0; q != inv.length; q++){System.out.println(inv[q]);}
            Thread.sleep(2000);
        System.out.println("            ");
        System.out.println("Weapons: ");
            for(int z=0; z != weapons.length; z++){System.out.println(weapons[z]);}
            Thread.sleep(2000);
        }

        private void startWeapInven() {
            inv[0] = "None!";
            inv[1] = "None!";
            inv[2] = "None!";
            weapons[0] = "None!";
            weapons[1] = "None!";
            weapons[2] = "None!";
        }
        private void spin() {
            spinAmnt = ThreadLocalRandom.current().nextInt(1, 12 + 1);
        }
}
//NOTE ADD A KARMA SYSTEM!