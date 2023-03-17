package org.example;

public class Student {


    private int ID;
    private String meno;
    private String priezvisko;
    private int vek;
    public Student(int ID, String meno, String priezvisko, int vek){
        this.ID= ID;
        this.meno= meno;
        this.priezvisko= priezvisko;
        this.vek= vek;
    }

    public int getID() {
        return ID;
    }
    public String getMeno() {
        return meno;
    }
    public String getPriezvisko() {
        return priezvisko;
    }
    public int getVek() {
        return vek;
    }

    /*public void setID(int yourID){
        this.ID = yourID;
    }
    public void setMeno(String yourMeno){
        this.meno = yourMeno;
    }
    public void setPriezvisko(String yourPriezvisko){
        this.priezvisko = yourPriezvisko;
    }
    public void setVek(int yourVek){
        this.vek = yourVek;
    }*/
}

