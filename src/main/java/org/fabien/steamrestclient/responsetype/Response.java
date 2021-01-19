package org.fabien.steamrestclient.responsetype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
	
	Integer game_count;
	Game[] games;
	
	public Response() {
		super();
	}

	public Integer getGame_count() {
		return game_count;
	}

	public void setGame_count(Integer game_count) {
		this.game_count = game_count;
	}

	public Game[] getGames() {
		return games;
	}

	public void setGames(Game[] games) {
		this.games = games;
	}
	
	 @Override
	  public String toString() {
	    
		 String gamesString = "";
		 for(Game g : games) {
			 gamesString += g.toString() + ", ";
		 }
		 
		 return "game_count=" + game_count +
	        ", games='" + gamesString;
	  }
	
}
