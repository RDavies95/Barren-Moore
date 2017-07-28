import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 28/07/2017.
 */
public class Main {



    public static void main(String[] args) throws InterruptedException {


     Calculations c = new Calculations();
     ScreenMessages sc = new ScreenMessages();
     Scanner scan = new Scanner(System.in);
     StringExpress se = new StringExpress();
     Choices choice = new Choices();
     Grid g = new Grid();
        int desx;
        int desy;




    sc.outputSpeechMessage("Welcome Adventurer, you have began a journey which will end with two ways...either defeating the dark lord furbie or dying along the journey. Only you decide your fate...");
    sc.outputScreenMessage("*You hear a loud explosion*");
    sc.outputSpeechMessage("Well hello you, im cosmo the sarcastic fairy, please state your name for me.");
    String cName = se.formatString(scan.nextLine());
    sc.outputSpeechMessage("Well hello " + cName + " it's a pleasure to be the one forcing you on this quest.");
    sc.outputSpeechMessage("Purely out of interest, if you had to pick between a mage, fighter or marksman which one would you choose?");
    String cClass = se.formatString(scan.nextLine());
    cClass = choice.classChoice(cClass);


     sc.outputSpeechMessage("Next we need the name of your special move, a quick little hint, the cooler the name the more damage it does.");
     String cSpecialMove = se.formatString(scan.nextLine());

     sc.outputSpeechMessage("oh... you went with " + cSpecialMove + " i mean i would have thought of something cooler but let's progress.");

     sc.outputSpeechMessage("urmmmmmmmmm i shall assign you 100 life points as well, although if you were as good as you think you are then you would only need 1.");
     sc.outputSpeechMessage("With a wave of the wand and some magic codey java thingy...");
     sc.outputSpeechMessage("...still waving my wand...");
     sc.outputSpeechMessage("...don't know why this is taking so long...");
     sc.outputSpeechMessage("Ooop there we go, you are now...");
     sc.outputBlankLine();
     MainCharacter mc = new MainCharacter(cName,cClass,100,cSpecialMove);
     System.out.println(mc.toString());
     sc.outputBlankLine();
     sc.outputSpeechMessage("Look at you standing there all majestic.");
     sc.outputSpeechMessage("Now im a fair fairy...get it fair fairy, im so punny sometimes...");
     c.timeDelaySec(2);
     sc.outputSpeechMessage("..Anyway you are new here so take this magic compass that my aunt gave me as a bad birthday gift");
     sc.outputSpeechMessage("it shows you the way to the nearest point of interest or if you still don't get understand it basically progresses the story for you.");
     sc.outputScreenMessage("*Item Gained - Magic Compass thingy*");
     mc.cItems.add("MagicCompass");
     sc.outputNormalmessage("Anyway i would love to stay and chat but you only reply at direct questions which is kind of strange but i like it.");
     sc.outputSpeechMessage("But you should go visit moe in the local tavern and i'm sure i'll be checking in on you throughout your journey.");
     sc.outputSpeechMessage("Remember if you get lost use that compass thingy, anyway in a while...alligator, wait that's not ri...");
     sc.outputScreenMessage("*Cosmo Disappears*");
     sc.outputScreenMessage("*Looking at your compass and map you notice the arrow pointing south with the grid (5,4) glowing. You are currently at (0,4)*");
     sc.outputNormalmessage("Which direction would you like to travel? (North - n, East - e, South - s, West - w");
     g.setCurxpos(0);
     g.setCurypos(4);
        desx = 5;
        desy = 4;
     do
     {
         String direction = se.formatString(scan.nextLine());
         g.fillGrid(5,4,direction);
         sc.outputBlankLine();
         sc.outputDirectionMessage(g.curxpos,g.curypos);

     }
     while(!(desx == g.curxpos && desy == g.curypos));

    System.out.println("h");
     //String newDirection = g.CalcDistance(direction);
    // sc.outputScreenMessage("*Looking at your compass it shows " + newDirection  +" *");





    }
}
