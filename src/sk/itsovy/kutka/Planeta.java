package sk.itsovy.kutka;

public class Planeta {
    Slnko slnko = Slnko.getInstance();
    public void showPlanety() {
        System.out.println(slnko.planeta);
    }

}
