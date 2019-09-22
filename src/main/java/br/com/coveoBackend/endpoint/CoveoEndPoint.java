package br.com.coveoBackend.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

import br.com.coveoBackend.service.ICoveoService;

/**
 * 
 * Endpoint that executes the queries to the Coveo API
 * @author Paulo Henrique Heidemann
 *
 */
@RestController
@RequestMapping("/v1/coveo")
public class CoveoEndPoint {
	
	@Autowired
	private ICoveoService service;

	/**
	 * Execute the query in the Coveo API using the HTTP method POST
	 * @param data
	 * @return
	 */
	@PostMapping(produces = "application/json", consumes = "application/json")
	ResponseEntity<String> executePostQuery(@RequestBody String data) {
		try {
			JsonNode result = service.postQuery(data);
			return new ResponseEntity<String>(result.toString(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * Execute the query in the Coveo API using the HTTP method GET
	 * @param filter
	 * @return
	 */
	@GetMapping(value = "{filter}", produces = "application/json", consumes = "application/json")
	ResponseEntity<String> executeGetQuery(@PathVariable String filter) {
		try {
			JsonNode result = service.getQuery(filter);
			return new ResponseEntity<String>(result.toString(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * Used to healthCheck the application
	 * @return
	 */
	@GetMapping("/healthCheck")
	ResponseEntity<String> healthCheck() {
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
