package sk.itsovy.kutka;

import java.util.ArrayList;

public class Slnko {
    ArrayList <String> planeta = new ArrayList<>();
    private static Slnko instance = new Slnko();
    
    private Slnko() {
    }

    public static Slnko getInstance() {
        return instance;
    }

    public void addPlaneta(String planet) {
        planeta.add(planet);
    }

}
