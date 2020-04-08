package CountryApp;

import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	
	HashMap<String, String> countries = new HashMap<String, String>();
	
	@GetMapping("/countries")
	public HashMap<String, String> listCountries() {
		countries.clear();
		for(CountryModel c : MainApp.allCountries) {
			countries.put(c.getName(), c.getCapital());
		}
		return countries;
	}

	HashMap<String, String> populations = new HashMap<String, String>();

	@GetMapping("/{name}")
	public String countryDetails(@PathVariable String name) {	
		String Name = formatName(name);
		populations.clear();
		for(CountryModel c : MainApp.allCountries) {
			populations.put(c.getName(), c.getPopulationString());
		}
		if(populations.containsKey(Name)) {
			String pop = populations.get(Name);
			return "<br><h3> &nbsp; The population of " + Name + " is " + pop + ".</h3>";			
		}
		else {
			return "<br><h3 style='color:red'> &nbsp; Sorry, I could not find that country.</h3>";
		}
	}
	
	public static String formatName(String name) {
		String firstLetter = name.substring(0,1).toUpperCase(); 
		String otherLetters = name.substring(1).toLowerCase();
		String Name = firstLetter + otherLetters;
		return Name;
	}

}
