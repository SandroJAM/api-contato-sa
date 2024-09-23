package br.com.evolution.api_contato_sa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
	info = @Info(
		title = "Documentação API CONTATO",
		version = "1.0",
		description = "API básica de gerenciamento de Contatos",
		contact = @Contact(name = "Sandro Muniz", email = "sandro.mnz@gmail.com" /*, url = "https://www.evolution.com" */)
	)
)

@SpringBootApplication
public class ApiContatoSaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiContatoSaApplication.class, args);
	}

}
