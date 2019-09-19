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

@RunWith(SpringRunner.class)
// @SpringBootTest(classes = WaesApplication.class, webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class EndPointTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void save() {
		try {
			mvc.perform(MockMvcRequestBuilders.post("/v1/diff/1/right").contentType(MediaType.APPLICATION_JSON)
					.content("data")).andExpect(MockMvcResultMatchers.status().isOk());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
}
