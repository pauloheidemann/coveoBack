package br.com.coveoBackend.test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;

import br.com.coveoBackend.service.CoveoService;
import br.com.coveoBackend.service.ICoveoService;

/**
 * Class to test the usage of the Coveo API
 * @author Paulo Henrique Heidemann
 *
 */
public class CoveoApiTest {
	
	private ICoveoService service;
	
	@Before
	public void init() {
		service = new CoveoService();
	}

	@Test
	public void queryWithoutParametersUsingGet() {
		try {
			JsonNode result = service.getQuery("");
			assertTrue("The count must be bigger than 0", result.toString().length() > 0);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void queryWithoutParametersUsingPost() {
		try {
			JsonNode result = service.postQuery("");
			assertTrue("The count must be bigger than 0", result.toString().length() > 0);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void searchByFieldUsingGet() {
		try {
			JsonNode result = service.getQuery("@title=\"Brasserie Voirons Lug, Forte Rousse\"");
			assertTrue("The count must be bigger than 0", result.toString().length() > 0);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void searchByFieldUsingPost() {
		try {
			JsonNode result = service.postQuery("@title=\"Brasserie Voirons Lug, Forte Rousse\"");
			assertTrue("The count must be bigger than 0", result.toString().length() > 0);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
}