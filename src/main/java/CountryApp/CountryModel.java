package CountryApp;

import java.text.DecimalFormat;

import org.springframework.stereotype.Component;

@Component
public class CountryModel {
	
	private String name;
	private String capital;
	private double population;
	
	public CountryModel() {
	}
	
	public CountryModel(String name, String capital, double population) {
		super();
		this.name = name;
		this.capital = capital;
		this.population = population;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCapital() {
		return capital;
	}
	
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	public double getPopulation() {
		return population;
	}
	
	public String getPopulationString() {		
		DecimalFormat df = new DecimalFormat("#.0");		
		String PopString;
		if(population < 1) {
			DecimalFormat df2 = new DecimalFormat("#");
			double pop = population * 1000;
			PopString = "" + df2.format(pop) + " thousand";
			return PopString;
		}
		if(population > 1000) {
			double pop = population / 1000;
			PopString = "" + df.format(pop) + " billion";
			return PopString;
		}
		else {
			PopString = "" + df.format(population) + " million";
			return PopString;
		}
	}
	
	public void setPopulation(long population) {
		this.population = population;
	}

}
