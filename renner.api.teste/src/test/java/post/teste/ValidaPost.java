package post.teste;

import org.hamcrest.Matchers;
import org.junit.Test;
import io.restassured.RestAssured;

public class ValidaPost {
	@Test
	public void validarCadastroNovo() {
		RestAssured.given()
		.contentType("application/json")
		.body("{\r\n"
				+ "    \"name\": \"Isaque Antunes\",\r\n"
				+ "    \"job\": \"QA Automation\"\r\n"
				+ "}")
		.when().post("https://reqres.in/api/users")
		.then().log().all()
		.statusCode(201)
		.body("name", Matchers.is("Isaque Antunes"));
		System.out.println("---CT01 - Cadastro Efetuado com Sucesso---");
		
	}

}
