package br.com.testeApi;
import static io.restassured.RestAssured.*;
import junit.framework.Assert;
import io.restassured.http.ContentType;

import org.apache.http.protocol.HTTP;
import org.junit.Test;

public class ApiGet {

	@Test
	
	public void GetSend() {
		
		String urlBase = "https://jsonplaceholder.typicode.com/todos";
		
		given()
		
		.relaxedHTTPSValidation()
		.param("userId", 1)
		.param("id", 1)
		.param("title", "delectus aut autem")
		.param("completed",false)
		.when()
		.get(urlBase)
		.then()
		.statusCode(200)
		
		.contentType(ContentType.JSON);
			
	}
	
}