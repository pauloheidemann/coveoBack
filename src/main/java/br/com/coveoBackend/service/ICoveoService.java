package br.com.coveoBackend.service;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * 
 * Interface that defines the behaviour of the queries to the coveoApi
 * @author Paulo Henrique Heidemann
 *
 */
public interface ICoveoService {
	
	//TOKEN used in the search queries to Coveo API
	final String TOKEN = "058c85fd-3c79-42a3-9236-b83d35588103";
	String BASE_QUERY = "https://cloudplatform.coveo.com/rest/search?access_token=" + ICoveoService.TOKEN;

	/**
	 * Uses the HTTP method GET to execute the query in the coveo API
	 * @param filter
	 * @return
	 * @throws Exception
	 */
	JsonNode getQuery(String filter) throws Exception;
	
	/**
	 * Uses the HTTP method POST to execute the query in the coveo API
	 * @param filter
	 * @return
	 * @throws Exception
	 */
	JsonNode postQuery(String filter) throws Exception;

}
