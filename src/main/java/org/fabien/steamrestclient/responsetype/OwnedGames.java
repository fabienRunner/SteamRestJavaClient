package org.fabien.steamrestclient.responsetype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OwnedGames {
	
	Response response;

	public OwnedGames() {
		super();
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}
	
	 @Override
	  public String toString() {
	    return response.toString();
	  }

}
