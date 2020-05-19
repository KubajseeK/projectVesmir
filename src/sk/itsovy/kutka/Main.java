package sk.itsovy.kutka;

public class Main {

    public static void main(String[] args) {
	Slnko slnko = Slnko.getInstance();
	Planeta planeta = new Planeta();

	slnko.addPlaneta("Merkur");
	slnko.addPlaneta("Venuša");
	slnko.addPlaneta("Zem");
	slnko.addPlaneta("Mars");
	slnko.addPlaneta("Jupiter");
	slnko.addPlaneta("Saturn");
	slnko.addPlaneta("Urán");
	slnko.addPlaneta("Neptún");
	slnko.addPlaneta("Pluto");

	planeta.showPlanety();
    }
}
