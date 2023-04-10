package com.example.myapplication

class Person constructor(var name: String, var age: Int) {
    var lastName = ""
    var number = 0

    constructor(name: String, age: Int, lastName: String) : this(name, age) {
        this.lastName = lastName
    }

    constructor(name: String, age: Int, lastName: String, number: Int) : this(name, age, lastName) {
        this.number = number
        this.lastName = lastName
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is Person)
            return false
        return !(name != other.name && age != other.age && lastName != other.lastName && number != other.number)

    }

    override fun hashCode(): Int {
        return name.hashCode() + age.hashCode() + lastName.hashCode() + number.hashCode()
    }

    override fun toString() =
        "Person(name = $name, age = $age, lastName = $lastName, number = $number)"
}