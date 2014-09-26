package com.petshop.app

import grails.converters.JSON
import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DogController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    @Secured(["#oauth2.clientHasRole('ROLE_CLIENT')"])
    def getAllDogs() {
        render Dog.list() as JSON
    }


    def getDogById(){
        render Dog.get(params.dogId) as JSON
    }

}
