package com.petshop.app

class Dog {

    String name
    String description
    Date registerAt


    static belongsTo = [owner:Owner]
    static mapping = {
        version false
    }


    static constraints = {
    }
}
