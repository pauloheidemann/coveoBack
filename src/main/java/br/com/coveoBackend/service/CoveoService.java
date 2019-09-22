package br.com.coveoBackend.service;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * Service that executes the queries in the coveo API
 * @author Paulo Henrique Heidemann
 *
 */
@Service
public class CoveoService implements ICoveoService {
	
	private static final Logger logger = LogManager.getLogger(CoveoService.class);
	
	@Override
	public JsonNode getQuery(String filter) throws IOException, Exception {
		try {
			RestTemplate template = new RestTemplate();
			ResponseEntity<String> response = template.getForEntity(ICoveoService.BASE_QUERY + "&q=" + filter, String.class);
			ObjectMapper mapper = new ObjectMapper();
			JsonNode result = mapper.readTree(response.getBody());
			return result.path("results");
		} catch (RestClientException rce) {
			logger.error(rce);
			throw new Exception(String.format("An error ocurred when trying to GET the URL %s", ICoveoService.BASE_QUERY + "&q=" + filter));
		} catch (Exception e) {
			logger.error(e);
			throw new Exception(String.format("An error ocurred when trying to GET the URL %s", ICoveoService.BASE_QUERY + "&q=" + filter));
		}
	}
	
	@Override
	public JsonNode postQuery(String filter) throws IOException, Exception {
		try {
			RestTemplate template = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
			map.add("q", filter);
			HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
			ResponseEntity<String> response = template.postForEntity(ICoveoService.BASE_QUERY, request, String.class);
			ObjectMapper mapper = new ObjectMapper();
			JsonNode result = mapper.readTree(response.getBody());
			return result.path("results");
		} catch (RestClientException rce) {
			logger.error(rce);
			throw new Exception(String.format("An error ocurred when trying to POST the URL %s", ICoveoService.BASE_QUERY + "&q=" + filter));
		} catch (Exception e) {
			logger.error(e);
			throw new Exception(String.format("An error ocurred when trying to POST the URL %s", ICoveoService.BASE_QUERY + "&q=" + filter));
		}
	}

}