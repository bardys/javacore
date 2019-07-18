package io.swagger.petstore.controllers;

import io.restassured.RestAssured;
import io.swagger.petstore.models.PetModel;

public class PetCtrl {

    public PetCtrl(){

    }


    public PetModel addNewPet(PetModel pet){
        return RestAssured.given()
                .body(pet)
                .when()
                .post()
                .as(PetModel.class);
    }
}
