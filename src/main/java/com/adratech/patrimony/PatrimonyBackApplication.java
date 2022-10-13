package com.adratech.patrimony;

import com.adratech.patrimony.model.Demandstate;
import com.adratech.patrimony.model.Entrydemandstate;
import com.adratech.patrimony.model.Productstate;
import com.adratech.patrimony.repository.DemandstateRepo;
import com.adratech.patrimony.repository.EntryStateRepo;
import com.adratech.patrimony.repository.ProductstateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;
@SpringBootApplication
public class PatrimonyBackApplication implements CommandLineRunner {

	@Autowired
	DemandstateRepo state;

	@Autowired
	EntryStateRepo entryState;

	@Autowired
	ProductstateRepo productstate;
	public static void main(String[] args) {
		SpringApplication.run(PatrimonyBackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		// Inserting the data in the mysql table.
		Demandstate firstState = new Demandstate(1, "En instance");
		Demandstate secondState = new Demandstate(2, "En attente de livraison");
		Demandstate thirdState = new Demandstate(3, "Livrée");
		state.save(firstState);
		state.save(secondState);
		state.save(thirdState);

		Entrydemandstate firstEntryState = new Entrydemandstate(1, "En instance");
		Entrydemandstate secondEntryState = new Entrydemandstate(2, "En attente de validation");
		Entrydemandstate thirdEntryState = new Entrydemandstate(3, "validée");
		entryState.save(firstEntryState);
		entryState.save(secondEntryState);
		entryState.save(thirdEntryState);



		Productstate firstProductstate = new Productstate(1, "Disponible ");
		Productstate secondProductstate = new Productstate(2, "Affecté ");
		Productstate thirdProductstate = new Productstate(3, "Détruit ");
		productstate.save(firstProductstate);
		productstate.save(secondProductstate);
		productstate.save(thirdProductstate);
	}
	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Authorization", "Origin, Accept", "X-Requested-With",
				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}

}
