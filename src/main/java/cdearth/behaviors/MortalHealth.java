package cdearth.behaviors;

import cdearth.components.HasHealth;

public class MortalHealth implements HasHealth {
    private int health;

    public MortalHealth(int initialHealth) {
        if (initialHealth < 0)
            health = 0;
        else
            health = initialHealth;
    }
    public void modifyHealth(int modifyHealthBy) {
        int newHealth = health + modifyHealthBy;

        if (newHealth < 0)
            health = 0;
        else
            health = newHealth;
    }
    public int getHealth() {
        return health;
    }
}
