package CountryApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp {

	public static List<CountryModel> allCountries = new ArrayList<CountryModel>();

	public static void main(String[] args) {

		CountryModel one = new CountryModel("Germany", "Berlin", 83.02);
		CountryModel two = new CountryModel("USA", "Washington DC", 327.2);
		CountryModel three = new CountryModel("Mexico", "Mexico City", 129.2);
		CountryModel four = new CountryModel("Canada", "Ottawa", 37.59);
		CountryModel five = new CountryModel("England", "London", 55.98);
		CountryModel six = new CountryModel("Spain", "Madrid", 46.94);
		CountryModel seven = new CountryModel("Japan", "Tokyo", 126.8);
		CountryModel eight = new CountryModel("Nigeria", "Abuja", 190.9);

		allCountries.add(one);
		allCountries.add(two);
		allCountries.add(three);
		allCountries.add(four);
		allCountries.add(five);
		allCountries.add(six);
		allCountries.add(seven);
		allCountries.add(eight);

		SpringApplication.run(MainApp.class, args);
	}

}