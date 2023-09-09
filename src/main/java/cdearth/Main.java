package cdearth;

import cdearth.behaviors.*;
import cdearth.entities.Entity;

public class Main {
    public static void main(String[] args) {
        Entity man = new Entity(5, 5, 5, 5, 5, new MortalHealth(10), new PlayerLeveling(5));
        man.luck.setStat(-1);
        System.out.println(man.toString());

    }
}