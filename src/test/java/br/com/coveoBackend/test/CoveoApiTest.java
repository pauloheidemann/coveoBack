package br.com.coveoBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.coveoBackend.CoveoApplication;

public class CoveoApiTest {
	
	public static String query = "https://cloudplatform.coveo.com/rest/search?access_token=" + CoveoApplication.TOKEN;

	@Test
	public void queryWithoutParameters() {
		try {
			RestTemplate template = new RestTemplate();
			ResponseEntity<String> response = template.getForEntity(query, String.class);
			assertEquals(response.getStatusCode(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void searchByTitle() {
		try {
			RestTemplate template = new RestTemplate();
			ResponseEntity<String> response = template.getForEntity(query + "&q=@title=\"Brasserie Voirons Lug, Forte Rousse\"", String.class);
			ObjectMapper mapper = new ObjectMapper();
			JsonNode root = mapper.readTree(response.getBody());
			JsonNode totalCount = root.path("totalCount");
			assertEquals(totalCount.asInt(), 1);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void searchByTitleUsingPost() {
		try {
			RestTemplate template = new RestTemplate();
			ResponseEntity<String> response = template.postForEntity(query, "q=@title=\"Brasserie Voirons Lug, Forte Rousse\"" , String.class);
			ObjectMapper mapper = new ObjectMapper();
			JsonNode root = mapper.readTree(response.getBody());
			JsonNode totalCount = root.path("totalCount");
			assertEquals(totalCount.asInt(), 1);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
}