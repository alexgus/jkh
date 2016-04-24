/**
 * 
 */
package fr.nikk.jkh;

import fr.nikk.services.http.HttpService;
import fr.nikk.services.rest.RESTService;

/**
 * @author Alexandre Guyon
 *
 */
public class MainController {

	/**
	 * Serves rest request
	 */
	private RESTService rest;
	
	/**
	 * Serves http requests
	 */
	private HttpService http;

	/**
	 * Creates and instantiates all needed services
	 */
	public MainController() {
		this.rest = new RESTService();
		this.http = new HttpService();
	}
	
	/**
	 * Start services
	 */
	public void start(){
		this.http.start();
	}

}
