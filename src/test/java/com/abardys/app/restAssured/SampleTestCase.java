package com.abardys.app.restAssured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.swagger.petstore.models.PetModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class SampleTestCase {



    @Test
    public void testUserInfoResponse(){
        RestAssured.given()
                .baseUri("http://petstore.swagger.io/v2/")
                .basePath("pet")
                .contentType(ContentType.JSON)
                .header("api_key", "00000")
                .body("{\"id\":555555 + \"category\":{\"id\":555555 + \"name\":\"name1\"} + \"name\":\"name1\" + \"photoUrls\":[] + \"tags\":[] + \"status\":available }")
                .when().post()
                .then()
                .body("type", Matchers.equalTo("unknown"))
                .extract().response().prettyPrint();


    }


    @Test
    public void addPetTest(){
        int idTestValue = RandomUtils.nextInt(0, 9000);
        String testPetName = RandomStringUtils.randomAlphabetic(5);
        PetModel testPet = new PetModel(idTestValue, null, testPetName, null, null, "avaliable");

        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io/v2/")
                .setContentType(ContentType.JSON)
                .addHeader("api_key", "special-key")
                .build();

        RestAssured.given(requestSpecification)
                .basePath("pet")
                .body(testPet)
                .when().post()
                .then()
                .statusCode(200)
                .extract().response().prettyPrint();

    }


}
