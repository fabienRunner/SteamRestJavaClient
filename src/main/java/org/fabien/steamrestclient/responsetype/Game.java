package org.fabien.steamrestclient.responsetype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Game {
	
	Integer appid;
	String  name;

	public Game() {
		super();
	}
	
	public Integer getAppid() {
		return appid;
	}
	public void setApp_id(Integer appid) {
		this.appid = appid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	 @Override
	  public String toString() {
	    return "{" +
	        "appid=" + appid +
	        ", name='" + name + '\'' +
	        '}';
	  }
	
	
	

}
