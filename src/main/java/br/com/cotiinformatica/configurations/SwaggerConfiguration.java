package br.com.cotiinformatica.configurations;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {
    @Bean
    OpenAPI customOpenApi() {
        var openApi =  new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Produtos API - COTI Informática")
                        .description("API Spring Boot para gerenciamento de produtos")
                        .version("v1.0"));

        return openApi;
    }
}
