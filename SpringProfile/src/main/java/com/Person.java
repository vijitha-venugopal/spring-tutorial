package com;

class Person {

  private final String firstName;
  private final String lastName;
  private final int age;

  Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  String getFirstName() {
    return firstName;
  }

  String getLastName() {
    return lastName;
  }

  int getAge() {
    return age;
  }
}