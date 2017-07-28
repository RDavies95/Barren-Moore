import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 28/07/2017.
 */
public class ScreenMessages {


    public void outputNormalmessage(String input)
    {
        System.out.println(input);
    }

    public void outputSpeechMessage (String input) throws InterruptedException {
        System.out.println(input);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void outputBlankLine()
    {
        System.out.println("\n");
    }

    public void outputScreenMessage(String input)
    {
        outputBlankLine();
        outputNormalmessage(input);
        outputBlankLine();
    }

    public void outputDirectionMessage(int x, int y)
    {
        System.out.println("You are at " + x + "," + y);
    }


}
