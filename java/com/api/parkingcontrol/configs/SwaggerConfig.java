
package com.api.parkingcontrol.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration



public class SwaggerConfig{

    @Bean
    public OpenAPI springParkingSpotOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Api of ParkingSpot").description("Parking-Spot")
                        .version("v0.0.1")
                        .license(new License().name("João Almeida").url("https://www.linkedin.com/in/jo%C3%A3o-marcos-6391b718b/"))
                    .contact(new Contact().name("GiHub Joao").url("https://github.com/joao295/")
                                .email("joaomarcos290502@gmail.com")))
                .externalDocs(new ExternalDocumentation().description("GitHub do Projeto")
                        .url("https://github.com/joao295/Parking-Control"));
    }
    


    


}