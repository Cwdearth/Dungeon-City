package cdearth.behaviors;

import cdearth.components.HasLevel;

public class PlayerLeveling implements HasLevel {
    private int level;

    public PlayerLeveling(int initialLevel) {
        if (initialLevel < 0)
            level = 0;
        else
            level = initialLevel;
    }
    @Override
    public void setLevel(int newLevel) {
        if (newLevel < 0)
            level = 0;
        else
            level = newLevel;
    }

    public int getLevel() {
        return level;
    }
}
