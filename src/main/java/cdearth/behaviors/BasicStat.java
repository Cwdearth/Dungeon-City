package cdearth.behaviors;
import cdearth.components.Stat;
public class BasicStat implements Stat{
    private int stat = 0;

    public BasicStat(int initialValue) {
        if (initialValue < 0)
            stat = 0;
        else
            stat = initialValue;
    }
    public void setStat(int newValue) {
        if (newValue < 0)
            stat = 0;
        else
            stat = newValue;
    }
    public int getStat() {
        return stat;
    }
}
