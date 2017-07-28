import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 28/07/2017.
 */
public class Calculations {



    public void timeDelaySec(int a)
    {
        try {
            TimeUnit.SECONDS.sleep(a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
