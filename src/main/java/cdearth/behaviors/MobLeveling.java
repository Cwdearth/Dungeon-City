package cdearth.behaviors;

import cdearth.components.HasLevel;

public class MobLeveling implements HasLevel {
    private int level;
    @Override
    public void setLevel(int newLevel) {
        if (newLevel >= 0 || level == 0)
            level = newLevel;
        else
            level = 0;
    }

    public int getLevel() {
        return level;
    }
}
