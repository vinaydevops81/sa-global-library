package com.i27academy.builds


class Calculator {
    def jenkins
    Calculator (jenkins) {
        this.jenkins = jenkins
    }

    def add(firstNumber, secondNumber) {
        //login
        return firstNumber+secondNumber
    }
    //multiplication method
    def multiply(firstNumber, secondNumber) {
        return firstNumber*secondNumber
    }
}