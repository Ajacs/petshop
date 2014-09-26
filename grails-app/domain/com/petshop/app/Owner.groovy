package com.petshop.app

class Owner {

    String name
    String secondName
    Date createdAt


    static hasMany = [dogs:Dog]

    static mapping = {
        version false
    }

    static constraints = {
    }
}
