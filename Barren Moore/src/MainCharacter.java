import java.util.ArrayList;

/**
 * Created by Administrator on 28/07/2017.
 */
public class MainCharacter {

    String cName;
    String cClass;
    int cLifePoints;
    String cSpecialMove;

     public ArrayList<String> cItems = new ArrayList<String>();


    public MainCharacter(String cName, String cClass, int cLifePoints, String cSpecialMove){

    this.cName = cName;
    this.cClass = cClass;
    this.cLifePoints = cLifePoints;
    this.cSpecialMove = cSpecialMove;

    }

    public String toString()
    {

        return "Name = " + this.cName +  " Class = " + this.cClass + " Life points = " + this.cLifePoints +  " Special move = " + this.cSpecialMove;
    }


    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcClass() {
        return cClass;
    }

    public void setcClass(String cClass) {
        this.cClass = cClass;
    }

    public int getcLifePoints() {
        return cLifePoints;
    }

    public void setcLifePoints(int cLifePoints) {
        this.cLifePoints = cLifePoints;
    }

    public String getcSpecialMove() {
        return cSpecialMove;
    }

    public void setcSpecialMove(String cSpecialMove) {
        this.cSpecialMove = cSpecialMove;
    }
}
