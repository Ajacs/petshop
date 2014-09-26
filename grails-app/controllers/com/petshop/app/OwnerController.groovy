package com.petshop.app

import grails.converters.JSON

class OwnerController {


    def getAllOwners() {
        render Owner.list() as JSON
    }


    def getOwnerById(){
        render Owner.get(params.ownerId) as JSON
    }



}
