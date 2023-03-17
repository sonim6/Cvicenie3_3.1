package org.example;

public class Main {
    public static void main(String[] args) {
    Student myObj= new Student(66,"Simon","Sedivy",21);
    /*myObj.setID(6);
    myObj.setMeno("Simon");
    myObj.setPriezvisko("Sedivy");
    myObj.setVek(21);*/
    System.out.println(myObj.getID());
    System.out.println(myObj.getMeno());
    System.out.println(myObj.getPriezvisko());
    System.out.println(myObj.getVek());

    }
}