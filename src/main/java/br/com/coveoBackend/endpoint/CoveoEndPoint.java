package br.com.coveoBackend.endpoint;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/coveo")
public class CoveoEndPoint {

	@PostMapping(produces = "application/json", consumes = "application/json")
	Response executeQuery(@RequestBody String data) {
		try {
			return Response.ok("ok").build();
		} catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/healthCheck")
	Response healthCheck() {
		return Response.ok().build();
	}
}
