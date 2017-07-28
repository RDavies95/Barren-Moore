import java.awt.*;
import java.util.HashMap;

/**
 * Created by Administrator on 28/07/2017.
 */
public class Grid {

    public String Distance;
    public int numberOfRows = 30;
    public int numberOfColumns = 30;
    HashMap<String, String> map = new HashMap<String, String>();
    public int curxpos;
    public int curypos;

    String[][] gridMap = new String[numberOfRows][numberOfColumns];

    public void fillGrid(int a, int b, String Dir)
    {
        String N = "n";
        String S = "s";
        String E = "e";
        String W = "w";

        int c = curxpos;
        int d = curypos;

        if(Dir.equals(N))
        {
            c = c - 1;
            setCurxpos(c);
        }
        else if(Dir.equals(S))
        {
            c = c + 1;
            setCurxpos(c);
        }
        else if(Dir.equals(E))
        {
            d = d + 1;
            setCurypos(d);
        }
         else if(Dir.equals(W))
        {
            d = d -1;
            setCurypos(d);
        }

        for(int i = 0; i < numberOfRows; i++)
        {
            for(int j = 0; j < numberOfColumns; j++)
            {
                if(i == c && j == d)
                {
                    System.out.print(" P ");


                }
                else if(i == a && j == b)
                {

                    System.out.print(" D ");
                }
                else
                {
                    System.out.print(" G ");
                }
            }
            System.out.println();
        }
    }

    public int getCurxpos() {
        return curxpos;
    }

    public void setCurxpos(int curxpos) {
        this.curxpos = curxpos;
    }

    public int getCurypos() {
        return curypos;
    }

    public void setCurypos(int curypos) {
        this.curypos = curypos;
    }



    public void viewGrid(boolean y)
    {
        if(y = true)
        {

        }
    }

//
//    public void outputGrid()
//    {
//        for(int i = 0; i < numberOfRows; i++)
//        {
//            for(int j = 0; j < numberOfColumns; j++)
//            {
//                System.out.print(map.get(convertToCord(j,i)));
//
//            }
//            System.out.println();
//        }
//    }



}
