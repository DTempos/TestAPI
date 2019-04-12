package br.com.TestAPI;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class TestttAPI {
	
	@Test
	public void TestesAPI(){
		String baseURI = "https://jsonplaceholder.typicode.com/todos/1";
		
		given()
		.when()
				.get(baseURI)
		.then()
				.statusCode(200) // O status http retornado foi 200
				.contentType(ContentType.JSON) // O response foi retornado no formato JSON
				.body("userId", is(1))
				.body("id", is(1))
				.body("title", equalTo("delectus aut autem"))
				.body("completed", is(false));
				
		}
	
}
