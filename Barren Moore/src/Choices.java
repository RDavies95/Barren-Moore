/**
 * Created by Administrator on 28/07/2017.
 */
public class Choices {

    public String classChoice(String input)
    {
        String mage = "mage";
        String fighter = "fighter";
        String marksman = "marksman";
        boolean b = false;

        do
        {
            if(input.equals(mage))
            {
                System.out.println("Ahhhh a mage, not the one i would have picked but an interesting choice.");
                b = true;
            }
            else if(input.equals(fighter))
            {
                System.out.println("Ahhhh a fighter, not the one i would have picked but an interesting choice.");
                b = true;
            }
            else if(input.equals(marksman))
            {
                System.out.println("Ahhhh a marksman, not the one i would have picked but an interesting choice.");
                b = true;
            }
            else
            {
                System.out.println("Please stop entering in silly information, we do not have the time, the furbies are on the rise");
            }
        }
        while (!b);
        return input;
    }




}
