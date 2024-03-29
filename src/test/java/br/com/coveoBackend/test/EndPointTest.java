package br.com.coveoBackend.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import br.com.coveoBackend.CoveoApplication;

/**
 * 
 * Class to test the endpoint of the application
 * @author Paulo Henrique Heidemann
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CoveoApplication.class, webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class EndPointTest {
	
	private static final String TEST_QUERY = "test";
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void postQuery() {
		try {
			mvc.perform(
				MockMvcRequestBuilders.post("/v1/coveo/all")
				.contentType(MediaType.APPLICATION_JSON))
			.andExpect(MockMvcResultMatchers.status().isOk());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void getQuery() {
		try {
			mvc.perform(
				MockMvcRequestBuilders.get("/v1/coveo/" + TEST_QUERY)
				.contentType(MediaType.APPLICATION_JSON))
			.andExpect(MockMvcResultMatchers.status().isOk());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

}
