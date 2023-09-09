package cdearth.entities;
import cdearth.components.HasHealth;
import cdearth.components.HasLevel;
import cdearth.behaviors.BasicStat;

public class Entity {

    public HasHealth health;
    public HasLevel level;
    public BasicStat strength, dexterity, constitution, lore, luck;

    public Entity(int strength, int dexterity, int constitution, int lore, int luck, HasHealth healthType, HasLevel levelingType) {
        this.health = healthType;
        this.level = levelingType;
        this.strength = new BasicStat(strength);
        this.dexterity = new BasicStat(dexterity);
        this.constitution = new BasicStat(constitution);
        this.lore = new BasicStat(lore);
        this.luck = new BasicStat(luck);
    }

    public void setHealthType(HasHealth type) {
        health = type;
    }
    public void setLevelingType(HasLevel type) {
        level = type;
    }
    @Override
    public String toString() {
        return "Entity{" +
                "health=" + health.getHealth() +
                ", level=" + level.getLevel() +
                ", strength=" + strength.getStat() +
                ", dexterity=" + dexterity.getStat() +
                ", constitution=" + constitution.getStat() +
                ", lore=" + lore.getStat() +
                ", luck=" + luck.getStat() +
                '}';
    }
}
