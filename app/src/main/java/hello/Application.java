package hello;

import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		System.out.println("Hello work");
//		https://javatodev.com/spring-boot-jwt-authentication/?utm_content=cmp-true
		SpringApplication.run(Application.class, args);

	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}

	@Bean
	CommandLineRunner runner (PersonRepository repository){
		return args -> {
			for (Person p : Arrays.asList(
				Person.create("Afghanistan",	"Kabul"),
				Person.create("Albania",	"Tirana"),
				Person.create("Algeria",	"Algiers"),
				Person.create("Andorra",	"Andorra la Vella"),
				Person.create("Angola",	"Luanda"),
				Person.create("Antigua", "and Barbuda	Saint John's"),
				Person.create("Argentina",	"Buenos Aires"),
				Person.create("Armenia",	"Yerevan"),
				Person.create("Australia",	"Canberra"),
				Person.create("Austria",	"Vienna"),
				Person.create("Azerbaijan",	"Baku"),
				Person.create("Bahamas",	"Nassau"),
				Person.create("Bahrain",	"Manama"),
				Person.create("Bangladesh",	"Dhaka"),
				Person.create("Barbados",	"Bridgetown"),
				Person.create("Belarus",	"Minsk"),
				Person.create("Belgium",	"Brussels"),
				Person.create("Belize",	"Belmopan"),
				Person.create("Benin",	"Porto-Novo"),
				Person.create("Bhutan",	"Thimphu"),
				Person.create("Bolivia",	"Sucre (de jure),"),
				Person.create("La", "Paz (seat of government)"),
				Person.create("Bosnia", "and Herzegovina	Sarajevo"),
				Person.create("Botswana",	"Gaborone"),
				Person.create("Brazil",	"Brasilia"),
				Person.create("Brunei",	"Bandar Seri Begawan"),
				Person.create("Bulgaria",	"Sofia"),
				Person.create("Burkina Faso", "Ouagadougou"),	
				Person.create("Burundi",	"Gitega"),
				Person.create("Cabo Verde" , "Praia"),	
				Person.create("Cambodia",	"Phnom Penh"),
				Person.create("Cameroon",	"Yaounde"),
				Person.create("Canada",	"Ottawa"),
				Person.create("Central African Republic",	"Bangui"),
				Person.create("Chad",	"N'Djamena"),
				Person.create("Chile",	"Santiago"),
				Person.create("China",	"Beijing"),
				Person.create("Colombia",	"Bogotá"),
				Person.create("Comoros",	"Moroni"),
				Person.create("Congo Democratic Republic","Kinshasa"),
				Person.create("Congo Republic","Brazzaville"),
				Person.create("Costa Rica","San Jose")	,
				Person.create("Cote d'Ivoire", 	"Yamoussoukro"),
				Person.create("Croatia",	"Zagreb"),
				Person.create("Cuba",	"Havana"),
				Person.create("Cyprus",	"Nicosia"),
				Person.create("Czechia",	"Prague"),
				Person.create("Denmark",	"Copenhagen"),
				Person.create("Djibouti",	"Djibouti city"),
				Person.create("Dominica",	"Roseau"),
				Person.create("Dominican Republic", "Santo Domingo")	,
				Person.create("Ecuador",	"Quito"),
				Person.create("Egypt",	"Cairo"),
				Person.create("El Salvador", "San Salvador")	,
				Person.create("Equatorial Guinea", "Malabo")	,
				Person.create("Eritrea",	"Asmara"),
				Person.create("Estonia",	"Tallinn"),
				Person.create("Eswatini",	"Mbabane"),
				Person.create("Ethiopia",	"Addis Ababa") ,
				Person.create("Fiji",	"Suva"),
				Person.create("Finland",	"Helsinki"),
				Person.create("France",	"Paris"),
				Person.create("Gabon",	"Libreville"),
				Person.create("Gambia",	"Banjul"),
				Person.create("Georgia",	"Tbilisi"),
				Person.create("Germany",	"Berlin"),
				Person.create("Ghana",	"Accra"),
				Person.create("Greece",	"Athens"),
				Person.create("Grenada",	"Saint George\'s") ,
				Person.create("Guatemala",	"Guatemala City") ,
				Person.create("Guinea",	"Conakry"),
				Person.create("Guinea-Bissau","Bissau")	,
				Person.create("Guyana",	"Georgetown"),
				Person.create("Haiti",	"Port-au-Prince"),
				Person.create("Honduras",	"Tegucigalpa"),
				Person.create("Hungary",	"Budapest"),
				Person.create("Iceland",	"Reykjavik"),
				Person.create("India",	"New Delhi") ,
				Person.create("Indonesia",	"Jakarta"),
				Person.create("Iran",	"Tehran"),
				Person.create("Iraq",	"Baghdad"),
				Person.create("Ireland",	"Dublin"),
				Person.create("Israel",	"Jerusalem"),
				Person.create("Italy",	"Rome"),
				Person.create("Jamaica",	"Kingston"),
				Person.create("Japan",	"Tokyo"),
				Person.create("Jordan",	"Amman"),
				Person.create("Kazakhstan",	"Astana"),
				Person.create("Kenya",	"Nairobi"),
				Person.create("Kiribati",	"Tarawa"),
				Person.create("Kosovo",	"Pristina"),
				Person.create("Kuwait",	"Kuwait City") ,
				Person.create("Kyrgyzstan",	"Bishkek"),
				Person.create("Laos",	"Vientiane"),
				Person.create("Latvia",	"Riga"),
				Person.create("Lebanon",	"Beirut"),
				Person.create("Lesotho",	"Maseru"),
				Person.create("Liberia",	"Monrovia"),
				Person.create("Libya",	"Tripoli"),
				Person.create("Liechtenstein",	"Vaduz"),
				Person.create("Lithuania",	"Vilnius"),
				Person.create("Luxembourg",	"Luxembourg"),
				Person.create("Madagascar",	"Antananarivo"),
				Person.create("Malawi",	"Lilongwe"),
				Person.create("Malaysia",	"Kuala Lumpur") ,
				Person.create("Maldives",	"Male"),
				Person.create("Mali",	"Bamako"),
				Person.create("Malta",	"Valletta"),
				Person.create("Marshall Islands", " Majuro")	,
				Person.create("Mauritania",	"Nouakchott"),
				Person.create("Mauritius",	"Port Louis") ,
				Person.create("Mexico",	"Mexico City") ,
				Person.create("Micronesia",	"Palikir"),
				Person.create("Moldova",	"Chisinau"),
				Person.create("Monaco",	"Monaco"),
				Person.create("Mongolia",	"Ulaanbaatar"),
				Person.create("Montenegro",	"Podgorica"),
				Person.create("Morocco",	"Rabat"),
				Person.create("Mozambique",	"Maputo"),
				Person.create("Myanmar",	"Naypyidaw"),
				Person.create("Namibia",	"Windhoek"),
				Person.create("Nauru",	"Yaren District") ,
				Person.create("Nepal",	"Kathmandu"),
				Person.create("Netherlands",	"Amsterdam"),
				Person.create("New Zealand", "Wellington")	,
				Person.create("Nicaragua",	"Managua"),
				Person.create("Niger",	"Niamey"),
				Person.create("Nigeria",	"Abuja"),
				Person.create("North Korea", "Pyongyang")	,
				Person.create("North Macedonia", "Skopje")	,
				Person.create("Norway",	"Oslo"),
				Person.create("Oman",	"Muscat"),
				Person.create("Pakistan",	"Islamabad"),
				Person.create("Palau",	"Ngerulmud"),
				Person.create("Palestine",	"Jerusalem") ,
				Person.create("Panama",	"Panama City") ,
				Person.create("Papua New Guinea", "Port Moresby") 	,
				Person.create("Paraguay",	"Asunción"),
				Person.create("Peru",	"Lima"),
				Person.create("Philippines",	"Manila"),
				Person.create("Poland",	"Warsaw"),
				Person.create("Portugal",	"Lisbon"),
				Person.create("Qatar",	"Doha"),
				Person.create("Romania",	"Bucharest"),
				Person.create("Russia",	"Moscow"),
				Person.create("Rwanda",	"Kigali"),
				Person.create("Saint Kitts  and Nevis", "Basseterre")	,
				Person.create("Saint Lucia", "Castries")	,
				Person.create("Saint Vincent and the Grenadines", "Kingstown") 	,
				Person.create("Samoa",	"Apia"),
				Person.create("San Marino", "San Marino")	,
				Person.create("Sao Tome and Principe", "São Tomé") 	,
				Person.create("Saudi Arabia", "Riyadh")	,
				Person.create("Senegal",	"Dakar"),
				Person.create("Serbia",	"Belgrade"),
				Person.create("Seychelles",	"Victoria"),
				Person.create("Sierra Leone", "Freetown")	,
				Person.create("Singapore",	"Singapore"),
				Person.create("Slovakia",	"Bratislava"),
				Person.create("Slovenia",	"Ljubljana"),
				Person.create("Solomon Islands", "Honiara")	,
				Person.create("Somalia",	"Mogadishu"),
				Person.create("South Africa", "Cape Town")	,
				Person.create("South Korea", "Seoul")	,
				Person.create("South Sudan", "Juba")	,
				Person.create("Spain",	"Madrid"),
				Person.create("Sri Lanka", "Sri Jayawardenepura Kotte")	,
				Person.create("Sudan",	"Khartoum"),
				Person.create("Suriname",	"Paramaribo"),
				Person.create("Sweden",	"Stockholm"),
				Person.create("Switzerland",	"Bern"),
				Person.create("Syria",	"Damascus"),
				Person.create("Taiwan",	"Taipei"),
				Person.create("Tajikistan",	"Dushanbe"),
				Person.create("Tanzania",	"Dodoma"),
				Person.create("Thailand",	"Bangkok"),
				Person.create("Timor-Leste","Dili")	,
				Person.create("Togo",	"Lomé"),
				Person.create("Tonga",	"Nukuʻalofa"),
				Person.create("Trinidad and Tobago", "Port of Spain") 	,
				Person.create("Tunisia",	"Tunis"),
				Person.create("Turkey",	"Ankara"),
				Person.create("Turkmenistan",	"Ashgabat"),
				Person.create("Tuvalu",	"Funafuti"),
				Person.create("Uganda",	"Kampala"),
				Person.create("Ukraine",	"Kyiv") ,
				Person.create("United Arab Emirates", "Abu Dhabi") 	,
				Person.create("United Kingdom", "London")	,
				Person.create("United States of America", "Washington, D.C.") 	,
				Person.create("Uruguay",	"Montevideo"),
				Person.create("Uzbekistan",	"Tashkent"),
				Person.create("Vanuatu",	"Port Vila") ,
				Person.create("Vatican", " Vatican City"),
				Person.create("Venezuela",	"Caracas"),
				Person.create("Vietnam",	"Hanoi"),
				Person.create("Yemen",	"Sana'a"),
				Person.create("Zambia",	"Lusaka"),
				Person.create("Zimbabwe",	"Harare")
			)){
			
				repository.save(p);
			}
		};
	}




}
