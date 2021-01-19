package org.fabien.steamrestclient;

import org.fabien.steamrestclient.responsetype.OwnedGames;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SteamRestClientApplication {

	final String api_url = "http://api.steampowered.com/IPlayerService/GetOwnedGames/v0001/?key=EC7E0E87FD5F4FA21CC891F53B4DBC56&steamid=76561199111087430&format=json&include_appinfo=true";
	
	private static final Logger log = LoggerFactory.getLogger(SteamRestClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SteamRestClientApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			
			OwnedGames ownedGames = restTemplate.getForObject(
					api_url, OwnedGames.class);
			log.info(ownedGames.toString());
		};
	}

}
